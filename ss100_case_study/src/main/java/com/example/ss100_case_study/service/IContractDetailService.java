package com.example.ss100_case_study.service;

import com.example.ss100_case_study.model.contract.AttachServices;
import com.example.ss100_case_study.model.contract.Contract;
import com.example.ss100_case_study.model.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractDetailService {
    Page<ContractDetail> findAll(Pageable pageable);

    List<Contract> findAllContract();

    List<AttachServices> findAllAttachServices();

    void save(ContractDetail contractDetail);
}
