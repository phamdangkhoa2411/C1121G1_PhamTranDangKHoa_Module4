package com.example.ss100_case_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("furama")
@Controller
public class HomeController {

    @GetMapping("")
    public String showHome(){
        return "/home";
    }
}
