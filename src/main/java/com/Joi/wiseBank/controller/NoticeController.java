package com.Joi.wiseBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
    @GetMapping("/notices")
    public String getNotices() {
        return "Notices details are displayed here";
    }
}
