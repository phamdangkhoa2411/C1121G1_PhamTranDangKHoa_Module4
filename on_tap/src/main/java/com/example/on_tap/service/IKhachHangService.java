package com.example.on_tap.service;

import com.example.on_tap.model.KhachHang;

import java.util.List;
import java.util.Optional;

public interface IKhachHangService {

    List<KhachHang> findAll();


    void save(KhachHang khachHang);

    Optional<KhachHang> findById(Integer idKhachHang);

    void remove(Integer idKhachHang);
}
