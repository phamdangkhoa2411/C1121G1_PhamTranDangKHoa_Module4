package com.example.ss100_case_study.repository.contract;

import com.example.ss100_case_study.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
}
