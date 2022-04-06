package com.quan_ly_khach_hang.repository;

import com.quan_ly_khach_hang.model.Customer;
import com.quan_ly_khach_hang.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long>{
    List<Customer> findAllByProvince(Province province);
}
