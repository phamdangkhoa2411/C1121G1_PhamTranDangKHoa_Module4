package com.example.ss100_case_study.service.impl;

import com.example.ss100_case_study.model.contract.Contract;
import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.services.Services;
import com.example.ss100_case_study.repository.contract.IContractRepository;
import com.example.ss100_case_study.repository.customer.ICustomerRepository;
import com.example.ss100_case_study.repository.employee.IEmployeeRepository;
import com.example.ss100_case_study.repository.services.IServicesRepository;
import com.example.ss100_case_study.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    IServicesRepository iServicesRepository ;

    @Autowired
    IContractRepository iContractRepository;

    @Autowired
    ICustomerRepository iCustomerRepository;

    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return iContractRepository.findAll(pageable);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return iCustomerRepository.findAll();
    }

    @Override
    public List<Services> findAllServices() {
        return iServicesRepository.findAll();
    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }
}
