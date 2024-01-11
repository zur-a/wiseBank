package com.Joi.wiseBank.controller;

import com.Joi.wiseBank.Repository.AccountsRepository;
import com.Joi.wiseBank.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountsRepository repository;

    @GetMapping("/account")
    public Accounts getAccountDetails(@RequestParam int id) {
        Accounts accounts = repository.findByCustomerId(id);
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }
}
