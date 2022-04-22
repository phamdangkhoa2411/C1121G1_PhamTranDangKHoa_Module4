package com.example.ss100_case_study.model.services;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idRentType ;
    private String nameRentType ;
    @Column(columnDefinition = "double")
    private String costRentType;

    @OneToMany(mappedBy = "rentType")
    List<Services> servicesList;

    public RentType() {
    }

    public Integer getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(Integer idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public String getCostRentType() {
        return costRentType;
    }

    public void setCostRentType(String costRentType) {
        this.costRentType = costRentType;
    }

    public List<Services> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<Services> servicesList) {
        this.servicesList = servicesList;
    }
}
