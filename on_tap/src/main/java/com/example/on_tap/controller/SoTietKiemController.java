package com.example.on_tap.controller;


import com.example.on_tap.model.SoTietKiem;
import com.example.on_tap.repository.ISoTietKiemRepository;
import com.example.on_tap.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/SoTietKiem")
public class SoTietKiemController {

    @Autowired
    IKhachHangService iKhachHangService;

    @Autowired
    ISoTietKiemRepository iSoTietKiemRepository ;

    @GetMapping("")
    public String list(Model model) {
        List<SoTietKiem> soTietKiemList = iSoTietKiemRepository.findAll();
        model.addAttribute("soTietKiemList",soTietKiemList );
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<SoTietKiem> soTietKiemList = iSoTietKiemRepository.findAll();
        model.addAttribute("khachhang", new KhachHangController());
        model.addAttribute("soTietKiemList",soTietKiemList);
        return "/create";
    }

}
