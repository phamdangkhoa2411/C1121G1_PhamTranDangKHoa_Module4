package com.example.ket_hop_restful_cho_app_blog.service.impl;


import com.example.ket_hop_restful_cho_app_blog.model.Category;
import com.example.ket_hop_restful_cho_app_blog.repository.ICategoryRepository;
import com.example.ket_hop_restful_cho_app_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository ;

    @Override
    public List<Category> findAllCategory() {
        return iCategoryRepository.findAll();
    }
}
