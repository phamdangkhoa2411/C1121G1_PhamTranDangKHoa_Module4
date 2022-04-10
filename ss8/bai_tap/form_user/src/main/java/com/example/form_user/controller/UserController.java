package com.example.form_user.controller;

import com.example.form_user.dto.UserDto;
import com.example.form_user.model.User;
import com.example.form_user.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/User")
    public String listUser(Model model, @PageableDefault(value = 2) Pageable pageable) {
        Page<User> users = iUserService.fildAll(pageable);
        model.addAttribute("users", users);
        return "index";
    }


    @GetMapping("/create")
    public String showForm(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto", userDto);
        return "create";
    }

    @PostMapping("/create")
    public String createUser(@Validated @ModelAttribute UserDto userDto,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes,
                             Pageable pageable) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        iUserService.save(user);
        redirectAttributes.addFlashAttribute("smg", "thêm mới thành công");
        return "redirect:/User";


    }

}
