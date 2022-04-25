package com.example.ss100_case_study.service.impl;

import com.example.ss100_case_study.model.contract.AttachServices;
import com.example.ss100_case_study.model.contract.Contract;
import com.example.ss100_case_study.model.contract.ContractDetail;
import com.example.ss100_case_study.repository.contract.IAttachServicesRepository;
import com.example.ss100_case_study.repository.contract.IContractDetailRepository;
import com.example.ss100_case_study.repository.contract.IContractRepository;
import com.example.ss100_case_study.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {

    @Autowired
    IAttachServicesRepository iAttachServicesRepository ;

    @Autowired
    IContractRepository iContractRepository;

    @Autowired
    IContractDetailRepository iContractDetailRepository ;

    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return iContractDetailRepository.findAll(pageable);
    }

    @Override
    public List<Contract> findAllContract() {
        return iContractRepository.findAll();
    }

    @Override
    public List<AttachServices> findAllAttachServices() {
        return iAttachServicesRepository.findAll();
    }

    @Override
    public void save(ContractDetail contractDetail) {
        iContractDetailRepository.save(contractDetail);
    }
}
