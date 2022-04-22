package com.example.ss100_case_study.repository.services;

import com.example.ss100_case_study.model.services.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServicesRepository extends JpaRepository<Services,Integer> {
}
