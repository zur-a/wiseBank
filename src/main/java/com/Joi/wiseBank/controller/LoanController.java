package com.Joi.wiseBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loans")
    public String loanDetails() {
        return "Loans details are provided here";
    }
}
