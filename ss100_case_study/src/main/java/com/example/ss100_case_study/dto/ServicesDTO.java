package com.example.ss100_case_study.dto;

import com.example.ss100_case_study.model.employee.Division;
import com.example.ss100_case_study.model.employee.EducationDegree;
import com.example.ss100_case_study.model.employee.Position;
import com.example.ss100_case_study.model.services.RentType;
import com.example.ss100_case_study.model.services.ServicesType;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ServicesDTO {


    private Integer idServices;

    @NotBlank
    @Size(min = 1, max = 45)
    private String nameServices;


    private String areaServices;

    @NotBlank
    private String costService;

    @Min(value = 2,message = "ít nhất là 2 người")
    @Max(value = 15,message = "tối đa chỉ được 15 người")
    private Integer maxPeopleService;


    private String standardRoomService;


    private String descriptionOtherConvenience;


    private String poolAreaService;

    private Integer numberOfFloors;

    private RentType rentType;

    private ServicesType servicesType;

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

    public String getAreaServices() {
        return areaServices;
    }

    public void setAreaServices(String areaServices) {
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

