package com.springrevision.bankaccountservice.service;

import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;

import java.util.List;

public interface AccountService {
    List<BankAccountResponseDTO> getAllAccounts();
    BankAccountResponseDTO createAccount(BankAccountRequestDTO dto);

    BankAccountResponseDTO getAccountById(String id);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountRequestDTO);
    boolean deleteAccount(String id);

}
