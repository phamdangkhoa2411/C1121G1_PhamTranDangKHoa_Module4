package com.example.on_tap.controller;

import com.example.on_tap.Dto.KhachHangDto;
import com.example.on_tap.model.KhachHang;
import com.example.on_tap.service.IKhachHangService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/khachhang")
public class KhachHangController {

    @Autowired
    IKhachHangService iKhachHangService;

    @GetMapping("")
    public String list(Model model) {
        List<KhachHang> khachHangList = iKhachHangService.findAll();
        model.addAttribute("khachHangList", khachHangList);
        return "listKHang";
    }

    @GetMapping("/createKHang")
    public String create(Model model) {
        KhachHangDto khachHangDto = new KhachHangDto();
        model.addAttribute("khachHangDto", khachHangDto);
        return "/createKHang";
    }


    @PostMapping("/createKHang")
    public String Save(@Validated @ModelAttribute KhachHangDto khachHangDto,
                       BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasFieldErrors()) {
            return "/createKHang";
        }
        KhachHang khachHang = new KhachHang();
        BeanUtils.copyProperties(khachHangDto,khachHang);
        iKhachHangService.save(khachHang);
        redirectAttributes.addFlashAttribute("smg", "thêm mới thành công");
        return "redirect:/khachhang";
    }



    @GetMapping("/{idKhachHang}/deleteKHang")
    public String delete(@PathVariable Integer idKhachHang, Model model) {
        model.addAttribute("khachhang", iKhachHangService.findById(idKhachHang));
        return "/deleteKHang";
    }


    @PostMapping("/deleteKHang")
    public String delete(KhachHang khachHang, RedirectAttributes redirectAttributes) {
        iKhachHangService.remove(khachHang.getIdKhachHang());
        redirectAttributes.addFlashAttribute("success", "xóa thành công!");
        return "redirect:/khachhang";
    }

}
