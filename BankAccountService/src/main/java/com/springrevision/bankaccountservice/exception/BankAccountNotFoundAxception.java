package com.springrevision.bankaccountservice.exception;

public class BankAccountNotFoundAxception extends RuntimeException {
    public BankAccountNotFoundAxception(String message) {
        super(message);
    }
}
