package com.example.muon_sach.service.impl;

import com.example.muon_sach.model.Sach;
import com.example.muon_sach.repository.ISachRepository;
import com.example.muon_sach.service.ISachService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;


@Service
public class SachService implements ISachService {
    @Autowired
    private ISachRepository iSachRepository;

    @Override
    public Page<Sach> findAll(Pageable pageable) {
        return iSachRepository.findAll(pageable);
    }

    @Override
    public void save(Sach sach) {
        iSachRepository.save(sach);
    }

    @Override
    public Sach findById(Integer id) {
        return iSachRepository.findById(id).orElse(null) ;
    }
}
