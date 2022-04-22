package com.example.ss100_case_study.model.employee;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "division")
public class Division {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDivision ;
    private String nameDivision ;

   @OneToMany(mappedBy = "division")
    List<Employee> employeeList ;


    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
