package com.example.ss100_case_study.repository.employee;

import com.example.ss100_case_study.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Integer>{
}
