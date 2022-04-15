package com.example.ket_hop_restful_cho_app_blog.service;


import com.example.ket_hop_restful_cho_app_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable );

    void save(Blog blog) ;

    Blog findById(Integer id);


    void remove(Integer id);

   Page<Blog> findByName(String keyword , Pageable pageable);

   List<Blog> findBlogCategoryById(Integer idCategory);
}
