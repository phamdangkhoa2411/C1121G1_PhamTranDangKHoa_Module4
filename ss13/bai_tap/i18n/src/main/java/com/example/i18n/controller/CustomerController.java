package com.example.i18n.controller;

import com.example.i18n.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("/customer")
    public ModelAndView listCustomer(){
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers", iCustomerService.findAll());
        return modelAndView;
    }


}
