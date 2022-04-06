package com.quan_ly_khach_hang.service;

import com.quan_ly_khach_hang.IGeneralService;
import com.quan_ly_khach_hang.model.Customer;
import com.quan_ly_khach_hang.model.Province;

import java.util.List;

public interface ICustommerService extends IGeneralService<Customer> {
    List<Customer> findAllByProvince(Province province);
}
