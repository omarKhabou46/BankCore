package com.springrevision.bankaccountservice.service;

import com.springrevision.bankaccountservice.dao.CustomerRepo;
import com.springrevision.bankaccountservice.dto.request.CustomerRequestDTO;
import com.springrevision.bankaccountservice.mapper.CustomerMapper;
import com.springrevision.bankaccountservice.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;
    private final CustomerMapper customerMapper;

    @Override
    public Customer createCustomer(CustomerRequestDTO customerRequestDTO) {
        return customerRepo.save(customerMapper.requestDTOtoEntity(customerRequestDTO));
    }
}
