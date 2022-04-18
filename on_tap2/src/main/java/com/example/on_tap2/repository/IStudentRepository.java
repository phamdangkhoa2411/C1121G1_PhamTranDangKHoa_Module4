package com.example.on_tap2.repository;

import com.example.on_tap2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
}
