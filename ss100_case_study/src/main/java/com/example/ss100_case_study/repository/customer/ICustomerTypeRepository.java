package com.example.ss100_case_study.repository.customer;

import com.example.ss100_case_study.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
