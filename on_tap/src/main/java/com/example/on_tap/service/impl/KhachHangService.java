package com.example.on_tap.service.impl;

import com.example.on_tap.model.KhachHang;
import com.example.on_tap.repository.IKhachHangRepository;
import com.example.on_tap.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService implements IKhachHangService {

    @Autowired
    IKhachHangRepository iKhachHangRepository;


    @Override
    public List<KhachHang> findAll() {
        return this.iKhachHangRepository.findAll();
    }

    @Override
    public void save(KhachHang khachHang) {
        this.iKhachHangRepository.save(khachHang);
    }

    @Override
    public Optional<KhachHang> findById(Integer idKhachHang) {
        return this.iKhachHangRepository.findById(idKhachHang);
    }

    @Override
    public void remove(Integer idKhachHang) {
        this.iKhachHangRepository.deleteById(idKhachHang);
    }
}
