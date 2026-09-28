package com.springrevision.bankaccountservice.model;

import com.springrevision.bankaccountservice.model.enumiration.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private BigDecimal balance;
    private String currency;
    @Enumerated(value = EnumType.STRING)
    private AccountType type;
}
