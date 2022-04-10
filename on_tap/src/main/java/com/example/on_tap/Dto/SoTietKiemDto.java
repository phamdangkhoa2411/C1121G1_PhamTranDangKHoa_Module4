package com.example.on_tap.Dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class SoTietKiemDto {
    private Integer idSo;

    @NotBlank
    private String ngayBatDau;

    @Pattern(regexp = "")
    private String kyHan;

    @NotBlank
    @Min(value = 30000000)
    private Integer soTienGui;



    public SoTietKiemDto() {
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
}
