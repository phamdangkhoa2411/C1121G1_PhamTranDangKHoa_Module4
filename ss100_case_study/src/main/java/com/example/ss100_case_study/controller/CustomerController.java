package com.example.ss100_case_study.controller;


import com.example.ss100_case_study.dto.CustomerDTO;
import com.example.ss100_case_study.model.contract.Contract;
import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.customer.CustomerType;
import com.example.ss100_case_study.service.IContractService;
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
import java.util.Optional;

@RequestMapping("customers")
@Controller
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @Autowired
    IContractService iContractService;


    @GetMapping("")
    public String list(@RequestParam Optional<String> keyword, Model model, @PageableDefault(value = 5) Pageable pageable) {
        Page<Customer> customerPage;
        if (keyword.isPresent()) {
            customerPage = iCustomerService.findByName(keyword.get(), pageable);
        } else {
            customerPage = iCustomerService.findAll(pageable);
        }
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
            return "error";
        }
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customer, customerDTO);

        List<CustomerType> customerTypes = this.iCustomerService.findAllCustomerType();
        model.addAttribute("customerDTO", customerDTO);
        model.addAttribute("customerTypes", customerTypes);
        return "/customer/edit";
    }

    @PostMapping("/edit/{id}")
    public String editCustomer(@PathVariable Integer id, @Validated @ModelAttribute CustomerDTO customerDTO, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model) {

        if (bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypes = this.iCustomerService.findAllCustomerType();
            model.addAttribute("customerTypes", customerTypes);
            return "/customer/edit";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        customer.setIdCustomer(id);
        this.iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("SOS", "edit thành công!");
        return "redirect:/customers";
    }

    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable Integer id, Model model) {
        Customer customer = this.iCustomerService.findById(id);
        if (customer == null) {
            return "error";
        }
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customer, customerDTO);

        List<CustomerType> customerTypes = this.iCustomerService.findAllCustomerType();
        model.addAttribute("customerDTO", customerDTO);
        model.addAttribute("customerTypes", customerTypes);
        return "/customer/delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id, @Validated @ModelAttribute CustomerDTO customerDTO, BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes, Model model) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        customer.setIdCustomer(id);
        this.iCustomerService.deleteById(id);
        redirectAttributes.addFlashAttribute("SOS", "delete thành công!");
        return "redirect:/customers";

    }

    @GetMapping("/customerService")
    public String customerService(Model model, @PageableDefault(value = 5) Pageable pageable) {
        Page<Contract> contractList;
        contractList = iContractService.findAll(pageable);
        model.addAttribute("contractList", contractList);
    return "/customer/customerService";
    }


}
