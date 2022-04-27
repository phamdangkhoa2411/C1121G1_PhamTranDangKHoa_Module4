package com.example.ss100_case_study.repository.customer;

import com.example.ss100_case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

    Page<Customer> findAllByNameCustomerContaining(String keyword, Pageable pageable);
}
