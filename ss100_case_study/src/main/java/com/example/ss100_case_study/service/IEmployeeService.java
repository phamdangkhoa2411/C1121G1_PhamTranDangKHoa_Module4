package com.example.ss100_case_study.service;


import com.example.ss100_case_study.model.employee.Division;
import com.example.ss100_case_study.model.employee.EducationDegree;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.employee.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {

    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    Employee findById(Integer id);

    List<Division> findAllDivision();

    List<EducationDegree> findAllEducation();

    List<Position> findAllPosition();

    void deleteById(Integer id);

}
