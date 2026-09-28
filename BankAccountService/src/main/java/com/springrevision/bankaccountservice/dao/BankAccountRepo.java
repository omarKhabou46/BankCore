package com.springrevision.bankaccountservice.dao;

import com.springrevision.bankaccountservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankAccountRepo extends JpaRepository<Account, String> {
}
