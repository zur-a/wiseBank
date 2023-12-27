package com.Joi.wiseBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account")
    public String getAccountDetails() {
        return "Welcome to Wise bank";
    }
}
