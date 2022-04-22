package com.example.ss100_case_study.repository.employee;

import com.example.ss100_case_study.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division,Integer> {
}
