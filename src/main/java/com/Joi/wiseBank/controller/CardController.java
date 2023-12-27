package com.Joi.wiseBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @GetMapping("/cards")
    public String cardDetails() {
        return "Card details are displayed here";
    }
}
