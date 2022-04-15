package com.example.ket_hop_restful_cho_app_blog.controller;


import com.example.ket_hop_restful_cho_app_blog.model.Category;
import com.example.ket_hop_restful_cho_app_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("CategoryRest")
@Controller
@RestController
public class CategoryRestController {

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public ResponseEntity<List<Category>> listCategogy(){
        List<Category> categoryList = iCategoryService.findAllCategory();
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }

}

