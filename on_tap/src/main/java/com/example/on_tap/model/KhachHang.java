package com.example.on_tap.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "khachHang")
@Table
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idKhachHang;

    private String ten;

    @OneToMany(mappedBy = "khachHang")
    private List<SoTietKiem> soTietKiemList;

    public KhachHang() {
    }

    public Integer getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<SoTietKiem> getSoTietKiemList() {
        return soTietKiemList;
    }

    public void setSoTietKiemList(List<SoTietKiem> soTietKiemList) {
        this.soTietKiemList = soTietKiemList;
    }
}
