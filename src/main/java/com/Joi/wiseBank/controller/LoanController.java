package com.Joi.wiseBank.controller;

import com.Joi.wiseBank.Repository.LoansRepository;
import com.Joi.wiseBank.model.Loans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {
    @Autowired
    private LoansRepository repository;
    @GetMapping("/loans")
    public List<Loans> getLoanDetails(@RequestParam int id) {
        List<Loans> loans = repository.findByCustomerIdOrderByStartDateDesc(id);
        if (loans != null) {
            return loans;
        } else {
            return null;
        }
    }
}
