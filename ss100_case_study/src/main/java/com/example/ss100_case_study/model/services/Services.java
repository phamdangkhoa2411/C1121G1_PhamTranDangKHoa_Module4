package com.example.ss100_case_study.model.services;

import javax.persistence.*;

@Entity
@Table(name = "services")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServices ;
    private String nameServices ;
    private  Integer areaServices ;
    @Column(columnDefinition = "double")
    private String costService ;
    private  Integer maxPeopleService ;
    private  String standardRoomService;
    private String descriptionOtherConvenience;
    @Column(columnDefinition = "double")
    private String poolAreaService;
    private Integer numberOfFloors ;

    @ManyToOne
    @JoinColumn(name ="id_rent_type",referencedColumnName = "idRentType")
    private RentType rentType ;

    @ManyToOne
    @JoinColumn(name ="id_service_type",referencedColumnName = "idServiceType")
    private  ServicesType servicesType ;

    public Services() {
    }

    public Integer getIdServices() {
        return idServices;
    }

    public void setIdServices(Integer idServices) {
        this.idServices = idServices;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public Integer getAreaServices() {
        return areaServices;
    }

    public void setAreaServices(Integer areaServices) {
        this.areaServices = areaServices;
    }

    public String getCostService() {
        return costService;
    }

    public void setCostService(String costService) {
        this.costService = costService;
    }

    public Integer getMaxPeopleService() {
        return maxPeopleService;
    }

    public void setMaxPeopleService(Integer maxPeopleService) {
        this.maxPeopleService = maxPeopleService;
    }

    public String getStandardRoomService() {
        return standardRoomService;
    }

    public void setStandardRoomService(String standardRoomService) {
        this.standardRoomService = standardRoomService;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getPoolAreaService() {
        return poolAreaService;
    }

    public void setPoolAreaService(String poolAreaService) {
        this.poolAreaService = poolAreaService;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServicesType getServicesType() {
        return servicesType;
    }

    public void setServicesType(ServicesType servicesType) {
        this.servicesType = servicesType;
    }
}
