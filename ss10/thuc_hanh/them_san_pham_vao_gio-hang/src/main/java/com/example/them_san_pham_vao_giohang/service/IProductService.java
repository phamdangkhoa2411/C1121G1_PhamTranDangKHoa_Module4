package com.example.them_san_pham_vao_giohang.service;

import com.example.them_san_pham_vao_giohang.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
