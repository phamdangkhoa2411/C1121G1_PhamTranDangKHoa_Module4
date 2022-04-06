package com.quan_ly_khach_hang.service.impl;

import com.quan_ly_khach_hang.model.Province;
import com.quan_ly_khach_hang.repository.IProvinceRepository;
import com.quan_ly_khach_hang.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return (List<Province>) provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }

}
