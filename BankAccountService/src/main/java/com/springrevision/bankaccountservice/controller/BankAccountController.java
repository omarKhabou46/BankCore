package com.springrevision.bankaccountservice.controller;

import com.springrevision.bankaccountservice.dao.BankAccountRepo;
import com.springrevision.bankaccountservice.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account-service")
@RequiredArgsConstructor
public class BankAccountController {

    private final BankAccountRepo accountRepo;

    @PostMapping
    public ResponseEntity<Void> createAccount(@RequestBody Account account) {
        accountRepo.save(account);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccount() {
        return ResponseEntity.ok(accountRepo.findAll());
    }

}
