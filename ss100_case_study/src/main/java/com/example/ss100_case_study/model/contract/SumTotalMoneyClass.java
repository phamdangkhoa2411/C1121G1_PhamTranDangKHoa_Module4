package com.example.ss100_case_study.model.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SumTotalMoneyClass {

    Double deposit;

    Double costService;

    Double contractQuantity;

    Double costAttachService;

    Double total;

    public SumTotalMoneyClass() {
    }

    public SumTotalMoneyClass(Double deposit, Double costService, Double contractQuantity, Double costAttachService, Double total) {
        this.deposit = deposit;
        this.costService = costService;
        this.contractQuantity = contractQuantity;
        this.costAttachService = costAttachService;
        this.total = total;
    }

    public Double calculate() {
        return this.costService - this.deposit + (this.contractQuantity * this.costAttachService);
    }
}
