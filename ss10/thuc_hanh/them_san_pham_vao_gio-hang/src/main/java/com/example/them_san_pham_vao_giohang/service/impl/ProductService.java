package com.example.them_san_pham_vao_giohang.service.impl;

import com.example.them_san_pham_vao_giohang.model.Product;
import com.example.them_san_pham_vao_giohang.repository.IProductRepository;
import com.example.them_san_pham_vao_giohang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}
