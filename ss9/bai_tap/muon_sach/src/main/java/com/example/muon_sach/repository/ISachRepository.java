package com.example.muon_sach.repository;

import com.example.muon_sach.model.Sach;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISachRepository extends JpaRepository<Sach,Integer> {
    Page<Sach> findAll(Pageable pageable);
}
