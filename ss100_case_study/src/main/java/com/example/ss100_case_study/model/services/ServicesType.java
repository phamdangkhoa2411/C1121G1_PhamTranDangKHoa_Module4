package com.example.ss100_case_study.model.services;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_type")
public class ServicesType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServiceType;
    private String nameServiceType;

    @OneToMany(mappedBy = "servicesType")
    List<Services> servicesList;

    public ServicesType() {
    }

    public Integer getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(Integer idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getNameServiceType() {
        return nameServiceType;
    }

    public void setNameServiceType(String nameServiceType) {
        this.nameServiceType = nameServiceType;
    }

    public List<Services> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<Services> servicesList) {
        this.servicesList = servicesList;
    }
}
