package com.Joi.wiseBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BallanceController {
    @GetMapping("/balance")
    public String balanceDetails() {
        return "Balance details are provided here";
    }
}
