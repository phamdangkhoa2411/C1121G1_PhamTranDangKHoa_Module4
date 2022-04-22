package com.example.ss100_case_study.repository;

import com.example.ss100_case_study.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

}
