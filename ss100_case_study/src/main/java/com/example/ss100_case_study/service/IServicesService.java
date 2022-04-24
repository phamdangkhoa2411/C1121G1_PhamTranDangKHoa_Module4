package com.example.ss100_case_study.service;

import com.example.ss100_case_study.model.services.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServicesService {
    Page<Services> findAll(Pageable pageable);

    void save(Services services);
}
