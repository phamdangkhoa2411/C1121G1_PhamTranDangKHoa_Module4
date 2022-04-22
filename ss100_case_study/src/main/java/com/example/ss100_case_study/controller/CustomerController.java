package com.example.ss100_case_study.controller;


import com.example.ss100_case_study.dto.CustomerDTO;
import com.example.ss100_case_study.model.Customer;
import com.example.ss100_case_study.model.CustomerType;
import com.example.ss100_case_study.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("customers")
@Controller
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;


    @GetMapping("")
    public String list(Model model, @PageableDefault(value = 5) Pageable pageable) {

        Page<Customer> customerPage;
        customerPage = iCustomerService.findAll(pageable);
        model.addAttribute("customerPage", customerPage);
        return "customer/list";

    }

    @GetMapping("/create")
    public String showForm(Model model) {
        CustomerDTO customerDTO = new CustomerDTO();
        model.addAttribute("customerDTO", customerDTO);
        return "customer/create";
    }

    @PostMapping("/create")
    public String CreateCustomer(@Valid @ModelAttribute CustomerDTO customerDTO,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDTO, customer);
            iCustomerService.save(customer);
            redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
            return "redirect:/customers";
        }
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        Customer customer = this.iCustomerService.findById(id);
        if (customer == null) {
            return "error.404";
        }
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customer, customerDTO);

        List<CustomerType> customerTypes = this.iCustomerService.findAllCustomerType();
        model.addAttribute("customerDTO", customerDTO);
        model.addAttribute("customerTypes", customerTypes);
        return "/customer/edit";
    }

    @PostMapping("/edit/{id}")
    public String editCustomer(@PathVariable Integer id, @Validated @ModelAttribute CustomerDTO customerDTO, Model model, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypes = this.iCustomerService.findAllCustomerType();
            model.addAttribute("customerTypes", customerTypes);
            return "/customer/edit";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        this.iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Edit Success !");
        return "redirect:/customer";
    }


}
