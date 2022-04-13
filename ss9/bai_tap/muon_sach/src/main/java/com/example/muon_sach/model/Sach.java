package com.example.muon_sach.model;

public class Sach {
    private Integer id;
    private String tenSach;
    private String tacGia;
    private Integer soLuong;

    public Sach() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
