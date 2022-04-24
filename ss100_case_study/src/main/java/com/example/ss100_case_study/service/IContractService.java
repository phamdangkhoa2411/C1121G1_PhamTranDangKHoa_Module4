package com.example.ss100_case_study.service;

import com.example.ss100_case_study.model.contract.Contract;
import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.services.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);

    List<Employee> findAllEmployee();

    List<Customer> findAllCustomer();

    List<Services> findAllServices();

    void save(Contract contract);

}
