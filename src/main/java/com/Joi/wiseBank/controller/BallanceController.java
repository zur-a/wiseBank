package com.Joi.wiseBank.controller;

import com.Joi.wiseBank.Repository.AccountTransactionsRepository;
import com.Joi.wiseBank.model.AccountTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BallanceController {
    @Autowired
    private AccountTransactionsRepository repository;
    @GetMapping("/balance")
    public List<AccountTransactions> getBalanceDetails(@RequestParam int id) {
        List<AccountTransactions> transactions = repository.findByCustomerIdOrderByTransactionDateDesc(id);
        if (transactions != null) {
            return transactions;
        } else {
            return null;
        }
    }
}
