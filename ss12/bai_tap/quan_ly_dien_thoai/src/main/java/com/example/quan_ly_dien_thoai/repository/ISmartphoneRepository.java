package com.example.quan_ly_dien_thoai.repository;

import com.example.quan_ly_dien_thoai.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository  extends JpaRepository<Smartphone, Long>  {
}
