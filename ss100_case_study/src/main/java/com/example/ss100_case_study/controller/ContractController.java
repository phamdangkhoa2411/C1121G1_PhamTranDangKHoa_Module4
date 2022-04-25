package com.example.ss100_case_study.controller;

import com.example.ss100_case_study.dto.ContractDTO;


import com.example.ss100_case_study.model.contract.Contract;

import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.services.Services;
import com.example.ss100_case_study.service.IContractService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("contracts")
@Controller
public class ContractController {
    @Autowired
    IContractService iContractService;

    @GetMapping("")
    public String list(Model model, @PageableDefault(value = 5) Pageable pageable) {

        Page<Contract> contractPage;
        contractPage = iContractService.findAll(pageable);
        model.addAttribute("contractPage", contractPage);
        return "contract/list";

    }

    @GetMapping("/create")
    public String showForm(Model model) {
        ContractDTO contractDTO = new ContractDTO();
        List<Employee> employeeList = iContractService.findAllEmployee();
        List<Customer> customerList = iContractService.findAllCustomer();
        List<Services> servicesList = iContractService.findAllServices();
        model.addAttribute("contractDTO", contractDTO);
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("customerList", customerList);
        model.addAttribute("servicesList", servicesList);
        return "contract/create";
    }

    @PostMapping("/create")
    public String CreateContract(@Valid @ModelAttribute ContractDTO contractDTO,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "contract/create";
        } else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDTO, contract);
            iContractService.save(contract);
            redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
            return "redirect:/contracts";
        }
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("contracts", iContractService.findById(id));
        return "contract/view";

    }
}
