package com.example.ss100_case_study.service.impl;

import com.example.ss100_case_study.model.services.Services;
import com.example.ss100_case_study.repository.services.IServicesRepository;
import com.example.ss100_case_study.service.IServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServicesService implements IServicesService {
    @Autowired
    IServicesRepository iServicesRepository ;
    @Override
    public Page<Services> findAll(Pageable pageable) {
        return iServicesRepository.findAll(pageable);
    }
}
