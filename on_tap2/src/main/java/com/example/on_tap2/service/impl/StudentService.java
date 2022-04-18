package com.example.on_tap2.service.impl;

import com.example.on_tap2.model.Student;
import com.example.on_tap2.service.IStudentService;
import com.example.on_tap2.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepository  iStudentRepository ;

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return iStudentRepository.findAll(pageable);
    }

    @Override
    public void save(Student student) {
       this.iStudentRepository.save(student);
    }

}
