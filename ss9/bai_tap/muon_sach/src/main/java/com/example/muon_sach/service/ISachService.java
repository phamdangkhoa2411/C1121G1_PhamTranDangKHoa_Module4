package com.example.muon_sach.service;

import com.example.muon_sach.model.Sach;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface ISachService {
    Page<Sach> findAll(Pageable pageable);
    void save(Sach sach);
    Sach findById(Integer id);
}
