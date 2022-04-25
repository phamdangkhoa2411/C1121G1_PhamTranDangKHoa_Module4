package com.example.ss100_case_study.repository.contract;

import com.example.ss100_case_study.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IContractRepository extends JpaRepository<Contract,Integer> {

}
