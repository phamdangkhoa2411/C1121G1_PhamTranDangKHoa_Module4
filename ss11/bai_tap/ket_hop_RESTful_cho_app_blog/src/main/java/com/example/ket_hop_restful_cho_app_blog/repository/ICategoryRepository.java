package com.example.ket_hop_restful_cho_app_blog.repository;


import com.example.ket_hop_restful_cho_app_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {

}
