package com.example.ss100_case_study.service.impl;

import com.example.ss100_case_study.model.Customer;
import com.example.ss100_case_study.model.CustomerType;
import com.example.ss100_case_study.repository.ICustomerRepository;
import com.example.ss100_case_study.repository.ICustomerTypeRepository;
import com.example.ss100_case_study.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository ;

    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository ;


    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public List<CustomerType> findAllCustomerType() {
        return iCustomerTypeRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer idDelete) {
        iCustomerRepository.deleteById(idDelete);
    }

}
