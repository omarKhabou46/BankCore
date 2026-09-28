package com.springrevision.bankaccountservice.service;

import com.springrevision.bankaccountservice.dao.BankAccountRepo;
import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;
import com.springrevision.bankaccountservice.exception.BankAccountNotFoundAxception;
import com.springrevision.bankaccountservice.mapper.BankAccountMapper;
import com.springrevision.bankaccountservice.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final BankAccountRepo accountRepo;
    private final BankAccountMapper accountMapper;

    @Override
    public List<BankAccountResponseDTO> getAllAccounts() {
        List<Account> accountList = accountRepo.findAll();
        return accountList.stream().map(accountMapper::toDto).toList();
    }

    @Override
    public BankAccountResponseDTO createAccount(BankAccountRequestDTO dto) {

        System.out.println("DTO = " + dto);

        Account account = accountMapper.requestDTOtoEntity(dto);

        System.out.println("ACCOUNT = " + account);

        return accountMapper.toDto(accountRepo.save(account));
    }

    @Override
    public BankAccountResponseDTO getAccountById(String id) {
        Account account = accountRepo.findById(id).orElseThrow(() -> new BankAccountNotFoundAxception("account with id " + id + " not found"));
        return accountMapper.toDto(account);
    }
}
