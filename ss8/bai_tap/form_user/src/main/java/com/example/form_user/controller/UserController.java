package com.example.form_user.controller;

import com.example.form_user.dto.UserDto;
import com.example.form_user.model.User;
import com.example.form_user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/")
    public String listUser(Model model, @PageableDefault(value = 2) Pageable pageable) {
        Page<User> users = iUserService.fildAll(pageable);
        model.addAttribute("users", users);
        return "index";
    }
    @GetMapping("/create")
    public String showForm(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDTO", userDto);
        return "create";
    }


}
