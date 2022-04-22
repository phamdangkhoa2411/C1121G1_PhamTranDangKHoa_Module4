package com.example.security_blog.service;

import com.example.security_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByName(String s, Pageable pageable);

}
