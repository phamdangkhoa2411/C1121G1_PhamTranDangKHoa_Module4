package com.example.on_tap.service;

import com.example.on_tap.model.SoTietKiem;

import java.util.List;
import java.util.Optional;


public interface ISoTietKiemService {

    List<SoTietKiem> findAll();

    void save( SoTietKiem soTietKiem ) ;

    Optional<SoTietKiem> findById(Integer idSo);


    void remove(Integer idSo);
}
