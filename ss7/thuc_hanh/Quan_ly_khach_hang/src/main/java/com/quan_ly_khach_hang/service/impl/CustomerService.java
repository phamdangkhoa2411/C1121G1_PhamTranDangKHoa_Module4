package com.quan_ly_khach_hang.service.impl;

import com.quan_ly_khach_hang.model.Customer;
import com.quan_ly_khach_hang.model.Province;
import com.quan_ly_khach_hang.repository.ICustomerRepository;
import com.quan_ly_khach_hang.service.ICustommerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustommerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
    @Override
    public List<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
