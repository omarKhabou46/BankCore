package com.springrevision.bankaccountservice.dao;

import com.springrevision.bankaccountservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
