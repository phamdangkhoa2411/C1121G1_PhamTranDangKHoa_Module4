package com.example.on_tap.model;

import javax.persistence.*;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "soTietKiem")
@Table
public class SoTietKiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSo;

    @Column(columnDefinition = "date")
    private String ngayBatDau;

    private String kyHan;

    private Integer soTienGui;

    @ManyToOne
    @JoinColumn(name = " id_Khach_Hang",referencedColumnName = " idKhachHang")
    private KhachHang khachHang;

    public SoTietKiem() {
    }

    public Integer getIdSo() {
        return idSo;
    }

    public void setIdSo(Integer idSo) {
        this.idSo = idSo;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public Integer getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(Integer soTienGui) {
        this.soTienGui = soTienGui;
    }


    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
