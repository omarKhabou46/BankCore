package com.springrevision.bankaccountservice.mapper;

import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;
import com.springrevision.bankaccountservice.model.Account;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {

    Account requestDTOtoEntity(BankAccountRequestDTO requestDTO);
    BankAccountResponseDTO toDto(Account account);
}
