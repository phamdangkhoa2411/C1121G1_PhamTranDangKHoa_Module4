package khaibao.model;

public class ToKhai {
    private String ten;
    private String namSinh;
    private String gioiTinh;
    private String quocTinh;
    private String cmnd;
    private String thongTinDiLai;
    private String soHieu;
    private String soGhe;
    private String ngayKhoiHanh;
    private String ngayKetThuc;
    private String diaDiemDaDen;
    private String tinhThanhLienLac;
    private String quanHuyenLienLac;
    private String phuongXaLienLac;
    private String diaChiNoiO;
    private String sdt;
    private String email;

    public ToKhai() {
    }

    public ToKhai(String ten, String namSinh, String gioiTinh, String quocTinh, String cmnd, String thongTinDiLai, String soHieu, String soGhe, String ngayKhoiHanh, String ngayKetThuc, String diaDiemDaDen, String tinhThanhLienLac, String quanHuyenLienLac, String phuongXaLienLac, String diaChiNoiO, String sdt, String email) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.quocTinh = quocTinh;
        this.cmnd = cmnd;
        this.thongTinDiLai = thongTinDiLai;
        this.soHieu = soHieu;
        this.soGhe = soGhe;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.diaDiemDaDen = diaDiemDaDen;
        this.tinhThanhLienLac = tinhThanhLienLac;
        this.quanHuyenLienLac = quanHuyenLienLac;
        this.phuongXaLienLac = phuongXaLienLac;
        this.diaChiNoiO = diaChiNoiO;
        this.sdt = sdt;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuocTinh() {
        return quocTinh;
    }

    public void setQuocTinh(String quocTinh) {
        this.quocTinh = quocTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getThongTinDiLai() {
        return thongTinDiLai;
    }

    public void setThongTinDiLai(String thongTinDiLai) {
        this.thongTinDiLai = thongTinDiLai;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(String soGhe) {
        this.soGhe = soGhe;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getDiaDiemDaDen() {
        return diaDiemDaDen;
    }

    public void setDiaDiemDaDen(String diaDiemDaDen) {
        this.diaDiemDaDen = diaDiemDaDen;
    }

    public String getTinhThanhLienLac() {
        return tinhThanhLienLac;
    }

    public void setTinhThanhLienLac(String tinhThanhLienLac) {
        this.tinhThanhLienLac = tinhThanhLienLac;
    }

    public String getQuanHuyenLienLac() {
        return quanHuyenLienLac;
    }

    public void setQuanHuyenLienLac(String quanHuyenLienLac) {
        this.quanHuyenLienLac = quanHuyenLienLac;
    }

    public String getPhuongXaLienLac() {
        return phuongXaLienLac;
    }

    public void setPhuongXaLienLac(String phuongXaLienLac) {
        this.phuongXaLienLac = phuongXaLienLac;
    }

    public String getDiaChiNoiO() {
        return diaChiNoiO;
    }

    public void setDiaChiNoiO(String diaChiNoiO) {
        this.diaChiNoiO = diaChiNoiO;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ToKhai{" +
                "ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", quocTinh='" + quocTinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", thongTinDiLai='" + thongTinDiLai + '\'' +
                ", soHieu='" + soHieu + '\'' +
                ", soGhe='" + soGhe + '\'' +
                ", ngayKhoiHanh='" + ngayKhoiHanh + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", diaDiemDaDen='" + diaDiemDaDen + '\'' +
                ", tinhThanhLienLac='" + tinhThanhLienLac + '\'' +
                ", quanHuyenLienLac='" + quanHuyenLienLac + '\'' +
                ", phuongXaLienLac='" + phuongXaLienLac + '\'' +
                ", diaChiNoiO='" + diaChiNoiO + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
