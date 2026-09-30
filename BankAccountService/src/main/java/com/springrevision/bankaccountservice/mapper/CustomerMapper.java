package com.springrevision.bankaccountservice.mapper;

import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.request.CustomerRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;
import com.springrevision.bankaccountservice.model.Account;
import com.springrevision.bankaccountservice.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer requestDTOtoEntity(CustomerRequestDTO requestDTO);
}
