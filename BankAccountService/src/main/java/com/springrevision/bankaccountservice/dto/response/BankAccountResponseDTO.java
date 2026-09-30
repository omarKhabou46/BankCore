package com.springrevision.bankaccountservice.dto.response;

import com.springrevision.bankaccountservice.model.Customer;
import com.springrevision.bankaccountservice.model.enumiration.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccountResponseDTO {
    private String id;
    private LocalDateTime createdAt;
    private BigDecimal balance;
    private String currency;
    private AccountType type;
    private Customer customer;
}
