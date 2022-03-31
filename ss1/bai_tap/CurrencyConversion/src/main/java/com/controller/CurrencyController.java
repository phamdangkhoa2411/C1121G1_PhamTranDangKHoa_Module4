package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {

    @GetMapping("/currency")
    public String input() {
        return "input";
    }

    @PostMapping("/currencyVnd")
    public String Conversion(@RequestParam Double dola, Model model) {

        Double vnd = dola * 23000;

        model.addAttribute("vnd", vnd);

        return "result";
    }

    @PostMapping("/currencyDola")
    public String dolaTovnd(@RequestParam Double vnd, Model model) {

        Double dola = vnd / 23000;

        model.addAttribute("dola", dola);

        return "result";
    }
}
