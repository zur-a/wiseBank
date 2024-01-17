package com.Joi.wiseBank.controller;

import com.Joi.wiseBank.Repository.NoticeRepository;
import com.Joi.wiseBank.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class NoticeController {
    @Autowired
    private NoticeRepository repository;
    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNoticesDetails() {
        List<Notice> notices = repository.findAllActiveNotices();
        if (notices != null) {
            return ResponseEntity
                    .ok()
                    .cacheControl(CacheControl.maxAge(1800, TimeUnit.SECONDS))
                    .body(notices);
        } else {
            return null;
        }
    }
}
