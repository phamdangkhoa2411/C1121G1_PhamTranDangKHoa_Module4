package com.example.ss100_case_study.service;

import com.example.ss100_case_study.model.Customer;
import com.example.ss100_case_study.model.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    List<CustomerType> findAllCustomerType();

    Customer findById(Integer id);

    void deleteById(Integer idDelete);
}
