package com.springrevision.bankaccountservice.dto.request;

import com.springrevision.bankaccountservice.model.enumiration.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccountRequestDTO {
    private BigDecimal balance;
    private String currency;
    private AccountType type;
}
