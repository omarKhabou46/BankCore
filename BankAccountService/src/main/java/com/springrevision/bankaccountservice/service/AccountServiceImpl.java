package com.springrevision.bankaccountservice.service;

import com.springrevision.bankaccountservice.dao.BankAccountRepo;
import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;
import com.springrevision.bankaccountservice.mapper.BankAccountMapper;
import com.springrevision.bankaccountservice.model.Account;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
    public void createAccount(BankAccountRequestDTO dto) {
       Account account = accountMapper.requestDTOtoEntity(dto);
       accountRepo.save(account);
    }
}
