package com.example.ss100_case_study.dto;

import com.example.ss100_case_study.model.contract.AttachServices;
import com.example.ss100_case_study.model.contract.Contract;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Setter
@Getter
public class ContractDetailDTO {

    private Integer idContractDetail;
    private Integer contractQuantity ;

    private Contract contract ;

    private AttachServices attachServices ;

}
