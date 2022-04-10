package com.example.on_tap.service.impl;

import com.example.on_tap.model.SoTietKiem;
import com.example.on_tap.repository.ISoTietKiemRepository;
import com.example.on_tap.service.ISoTietKiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoTietKiemService implements ISoTietKiemService {

    @Autowired
    ISoTietKiemRepository iSoTietKiemRepository;

    @Override
    public List<SoTietKiem> findAll() {
        return iSoTietKiemRepository.findAll();
    }

    @Override
    public void save(SoTietKiem soTietKiem) {
        this.iSoTietKiemRepository.save(soTietKiem);
    }

    @Override
    public Optional<SoTietKiem> findById(Integer idSo) {
        return this.iSoTietKiemRepository.findById(idSo);
    }

    @Override
    public void remove(Integer idSo) {
        this.iSoTietKiemRepository.deleteById(idSo);
    }
}
