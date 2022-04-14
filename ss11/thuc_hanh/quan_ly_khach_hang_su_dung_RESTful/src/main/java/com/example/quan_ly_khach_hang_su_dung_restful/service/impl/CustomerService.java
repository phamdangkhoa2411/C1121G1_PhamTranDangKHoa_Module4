package com.example.quan_ly_khach_hang_su_dung_restful.service.impl;

import com.example.quan_ly_khach_hang_su_dung_restful.model.Customer;
import com.example.quan_ly_khach_hang_su_dung_restful.repository.ICustomerRepository;
import com.example.quan_ly_khach_hang_su_dung_restful.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}
