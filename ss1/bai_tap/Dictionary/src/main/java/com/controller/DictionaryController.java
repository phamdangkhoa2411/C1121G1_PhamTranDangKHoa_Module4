package com.controller;

import com.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService ;

    @GetMapping("/dictional")
    public String dictionary(){
        return "search";
    }

    @PostMapping("/dictional")
    public String result(@RequestParam String search, Model model){
        String result = dictionaryService.searchDictional(search);
        model.addAttribute("result", result);
        return "search";
    }
}
