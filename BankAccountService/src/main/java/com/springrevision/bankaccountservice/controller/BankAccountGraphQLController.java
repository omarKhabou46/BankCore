package com.springrevision.bankaccountservice.controller;

import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.request.CustomerRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;
import com.springrevision.bankaccountservice.model.Customer;
import com.springrevision.bankaccountservice.service.AccountService;
import com.springrevision.bankaccountservice.service.CustomerService;
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
    private final CustomerService customerService;

    @QueryMapping
    public List<BankAccountResponseDTO> accountList() {
        return accountService.getAllAccounts();
    }

    @QueryMapping
    public BankAccountResponseDTO accountById(@Argument String id) {
        return accountService.getAccountById(id);
    }

    @MutationMapping
    public BankAccountResponseDTO createAccount(@Argument BankAccountRequestDTO accountRequestDTO, @Argument Long customerId) {
        return accountService.createAccount(accountRequestDTO, customerId);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id,@Argument BankAccountRequestDTO accountRequestDTO) {
        return accountService.updateAccount(id, accountRequestDTO);
    }

    @MutationMapping
    public boolean deleteAccount(@Argument String id) {
       return accountService.deleteAccount(id);
    }

    @MutationMapping
    public Customer createCustomer(@Argument CustomerRequestDTO customerRequestDTO) {
        return customerService.createCustomer(customerRequestDTO);
    }
}
