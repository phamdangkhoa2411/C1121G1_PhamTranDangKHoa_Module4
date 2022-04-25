package com.example.ss100_case_study.model.contract;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "contract_detail")
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContractDetail;
    private Integer contractQuantity ;

    @ManyToOne
    @JoinColumn(name = "idContract",referencedColumnName ="idContract" )
    private Contract contract ;

    @ManyToOne
    @JoinColumn(name = "id_attach_services",referencedColumnName = "idAttachServices")
    private AttachServices attachServices ;

    public ContractDetail() {
    }
}
