package com.example.ss100_case_study.service.impl;

import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.employee.Division;
import com.example.ss100_case_study.model.employee.EducationDegree;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.employee.Position;
import com.example.ss100_case_study.repository.employee.IDivisionRepository;
import com.example.ss100_case_study.repository.employee.IEducationDegreeRepository;
import com.example.ss100_case_study.repository.employee.IEmployeeRepository;
import com.example.ss100_case_study.repository.employee.IPositionRepository;
import com.example.ss100_case_study.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Autowired
    IDivisionRepository iDivisionRepository ;

    @Autowired
    IEducationDegreeRepository iEducationDegreeRepository ;

    @Autowired
    IPositionRepository iPositionRepository ;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return iEmployeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Division> findAllDivision() {
        return iDivisionRepository.findAll();
    }

    @Override
    public List<EducationDegree> findAllEducation() {
        return iEducationDegreeRepository.findAll();
    }

    @Override
    public List<Position> findAllPosition() {
        return iPositionRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        iEmployeeRepository.deleteById(id);
    }
}
