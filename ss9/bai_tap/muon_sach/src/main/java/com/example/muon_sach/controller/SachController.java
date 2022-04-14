package com.example.muon_sach.controller;

import com.example.muon_sach.model.Sach;
import com.example.muon_sach.service.ISachService;
import com.example.muon_sach.service.ITheMuonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Pageable;

@Controller
@RequestMapping("/sach")
public class SachController {
    @Autowired
    private ISachService iSachService;

    @Autowired
    private ITheMuonService iTheMuonService;

    @GetMapping("/list")
    public ModelAndView showList(@PageableDefault(value = 2, sort = "nameBook") Pageable pageable) {
        Page<Sach> sachs = iSachService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("sachs", sachs);
        return modelAndView;
    }


}
