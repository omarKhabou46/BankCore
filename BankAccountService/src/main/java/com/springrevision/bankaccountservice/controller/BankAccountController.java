package com.springrevision.bankaccountservice.controller;

import com.springrevision.bankaccountservice.dao.BankAccountRepo;
import com.springrevision.bankaccountservice.dto.request.BankAccountRequestDTO;
import com.springrevision.bankaccountservice.dto.response.BankAccountResponseDTO;
import com.springrevision.bankaccountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account-service")
@RequiredArgsConstructor
public class BankAccountController {

    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<Void> createAccount(@RequestBody BankAccountRequestDTO accountRequestDTO) {
        accountService.createAccount(accountRequestDTO);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<BankAccountResponseDTO>> getAllAccount() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

}
