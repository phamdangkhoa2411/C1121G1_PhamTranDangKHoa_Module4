package com.example.quan_ly_khach_hang_su_dung_restful.repository;

import com.example.quan_ly_khach_hang_su_dung_restful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository  extends PagingAndSortingRepository<Customer, Long> {
}
