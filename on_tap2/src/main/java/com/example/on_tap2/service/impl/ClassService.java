package com.example.on_tap2.service.impl;

import com.example.on_tap2.model.ClassStudent;
import com.example.on_tap2.repository.IClassRepository;
import com.example.on_tap2.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService implements IClassService {

    @Autowired
    IClassRepository iClassRepository;


    @Override
    public List<ClassStudent> findAllClass() {
        return this.iClassRepository.findAll();
    }
}
