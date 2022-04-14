package com.example.ket_hop_restful_cho_app_blog.repository;


import com.example.ket_hop_restful_cho_app_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByWriterContaining(String keyword, Pageable pageable);

    List<Blog> findAllByCategory_Id(Integer id);

}
