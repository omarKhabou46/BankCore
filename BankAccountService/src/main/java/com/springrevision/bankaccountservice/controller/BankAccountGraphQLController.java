package com.springrevision.bankaccountservice.controller;

import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;
import com.springrevision.bankaccountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BankAccountGraphQLController {

    private final AccountService accountService;

    @QueryMapping
    public List<BankAccountResponseDTO> accountList() {
        return accountService.getAllAccounts();
    }

    @QueryMapping
    public BankAccountResponseDTO accountById(@Argument String id) {
        return accountService.getAccountById(id);
    }

    @MutationMapping
    public BankAccountResponseDTO createAccount(@Argument BankAccountRequestDTO accountRequestDTO) {
        return accountService.createAccount(accountRequestDTO);
    }
}
