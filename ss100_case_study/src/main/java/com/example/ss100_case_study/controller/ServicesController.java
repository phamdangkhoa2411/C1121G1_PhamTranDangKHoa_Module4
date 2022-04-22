package com.example.ss100_case_study.controller;

import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.services.Services;
import com.example.ss100_case_study.service.IServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("services")
@Controller
public class ServicesController {
    @Autowired
    IServicesService iServicesService ;

    @GetMapping("")
    public String list(Model model, @PageableDefault(value = 5) Pageable pageable) {

        Page<Services> servicesPage;
        servicesPage = iServicesService.findAll(pageable);
        model.addAttribute("servicesPage", servicesPage);
        return "services/list";

    }
}
