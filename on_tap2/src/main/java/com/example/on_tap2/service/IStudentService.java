package com.example.on_tap2.service;

import com.example.on_tap2.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService {
    Page<Student> findAll(Pageable pageable);

    void save(Student student);

}
