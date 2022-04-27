package com.example.ss100_case_study.repository.contract;

import com.example.ss100_case_study.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IContractRepository extends JpaRepository<Contract,Integer> {

    @Query(
            value = "select  contract.deposit as deposit ," +
                    " services.cost_service as costService," +
                    " contract_detail.contract_quantity as contractQuantity " +
                    " , attach_services.cost_attach_services as costAttachService " +
                    " from contract , services, contract_detail, attach_services ; ",
            nativeQuery = true
    )
   <T> List<T> findAllSumTotal(Class<T> type);
}
