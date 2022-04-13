package com.example.muon_sach.model;



import javax.persistence.*;


@Entity
public class TheMuon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idThe;
    private String tenNguoiMuon;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Sach sach;



    public TheMuon() {
    }

    public Integer getIdThe() {
        return idThe;
    }

    public void setIdThe(Integer idThe) {
        this.idThe = idThe;
    }

    public String getTenNguoiMuon() {
        return tenNguoiMuon;
    }

    public void setTenNguoiMuon(String tenNguoiMuon) {
        this.tenNguoiMuon = tenNguoiMuon;
    }


    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }


}
