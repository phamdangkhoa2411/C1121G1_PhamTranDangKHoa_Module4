package com.example.them_san_pham_vao_giohang.repository;

import com.example.them_san_pham_vao_giohang.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

}
