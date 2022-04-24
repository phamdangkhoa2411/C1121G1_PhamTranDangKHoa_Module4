package com.example.ss100_case_study.model.contract;

import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.services.Services;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContract ;
    private String startDate ;
    private String endDate ;
    private Double deposit ;
    private Double totalMoney ;

    @ManyToOne
    @JoinColumn(name = "id_customer",referencedColumnName = "idCustomer")
    private Customer customer ;

    @ManyToOne
    @JoinColumn(name = "id_employee",referencedColumnName = "idEmployee")
    private Employee employee ;

    @ManyToOne
    @JoinColumn(name = "id_services",referencedColumnName = "idServices")
    private Services services ;

    public Contract() {
    }

}
