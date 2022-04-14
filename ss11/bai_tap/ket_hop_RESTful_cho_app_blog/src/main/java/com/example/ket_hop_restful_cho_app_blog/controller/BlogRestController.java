package com.example.ket_hop_restful_cho_app_blog.controller;

import com.example.ket_hop_restful_cho_app_blog.model.Blog;
import com.example.ket_hop_restful_cho_app_blog.service.IBlogService;
import com.example.ket_hop_restful_cho_app_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/blogRest")
@Controller
@RestController
public class BlogRestController {

    @Autowired
    IBlogService iBlogService;

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public ResponseEntity<Page<Blog>> listBlog(@RequestParam Optional<String> keyword,
                                               @PageableDefault(value = 2) Pageable pageable) {

        String keywordValue = keyword.orElse("");
        Page<Blog> blogList = this.iBlogService.findByName(keywordValue, pageable);
        return new ResponseEntity<>(blogList, HttpStatus.OK);

//        if (keyword.isPresent()) {
//            Page<Blog> blogList = this.iBlogService.findByName(keyword.get(), pageable);
//            return new ResponseEntity<>(blogList, HttpStatus.OK);
//        }else {
//            Page<Blog> blogList = this.iBlogService.findAll( pageable);
//            return new ResponseEntity<>(blogList, HttpStatus.OK);
//        }
    }

    @GetMapping("/{id}/view")
    public ResponseEntity<Blog> viewBlog(@PathVariable Integer id) {
        Blog blogObj = this.iBlogService.findById(id);
        if (blogObj == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(blogObj, HttpStatus.OK);
    }


    @GetMapping("/category/{idCategory}")
    public ResponseEntity<List<Blog>> listBlogByCategory(@PathVariable Integer idCategory ){
        List<Blog> blogList = iBlogService.findBlogCategoryById(idCategory);
        return new  ResponseEntity<>(blogList,HttpStatus.OK);
    }
}
