package com.springrevision.bankaccountservice.service;

import com.springrevision.bankaccountservice.dto.request.CustomerRequestDTO;
import com.springrevision.bankaccountservice.model.Customer;

public interface CustomerService {
    Customer createCustomer(CustomerRequestDTO customerRequestDTO);
}
