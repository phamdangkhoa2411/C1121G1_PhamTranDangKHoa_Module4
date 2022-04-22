package com.example.security_blog.controller;

import com.example.security_blog.model.Blog;
import com.example.security_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequestMapping("blog")
@Controller
public class BlogController {

    @Autowired
    IBlogService iBlogService;



    @GetMapping("")
    public String list(@RequestParam Optional<String> keyword, Model model, @PageableDefault(value = 2) Pageable pageable ) {
        Page<Blog> blogList;
        if(keyword.isPresent()){
            blogList = iBlogService.findByName(keyword.get(), pageable);

        }else {
            blogList = iBlogService.findAll(pageable);
        }

        model.addAttribute("blogList", blogList);
        return "list";
    }

}
