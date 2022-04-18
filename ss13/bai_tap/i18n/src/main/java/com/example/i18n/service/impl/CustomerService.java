package com.example.i18n.service.impl;

import com.example.i18n.model.Customer;
import com.example.i18n.repository.ICustomerRepository;
import com.example.i18n.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository ;


    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }
}
