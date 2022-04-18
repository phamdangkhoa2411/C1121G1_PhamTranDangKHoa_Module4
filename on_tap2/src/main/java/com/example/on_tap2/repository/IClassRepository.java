package com.example.on_tap2.repository;

import com.example.on_tap2.model.ClassStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassRepository extends JpaRepository<ClassStudent,Integer> {
}
