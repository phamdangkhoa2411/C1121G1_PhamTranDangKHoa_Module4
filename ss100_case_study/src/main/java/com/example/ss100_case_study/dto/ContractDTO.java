package com.example.ss100_case_study.dto;

import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.services.Services;

import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotNull;

@Setter
@Getter
public class ContractDTO {

    private Integer idContract;

    private String startDate;

    private String endDate;
    @NotNull(message = "không được bỏ trống")
    private Double deposit;

    private Double totalMoney;

    private Services services;
    private Employee employee;
    private Customer customer;


}
