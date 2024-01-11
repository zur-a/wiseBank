package com.Joi.wiseBank.controller;

import com.Joi.wiseBank.Repository.ContactRepsitory;
import com.Joi.wiseBank.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class ContactController {
    @Autowired
    private ContactRepsitory repsitory;
    @PostMapping("/contact")
    public Contact saveContactDetails(@RequestBody Contact contact) {
        contact.setContactId(getServiceReqNumber());
        contact.setCreateDate(new Date(System.currentTimeMillis()));
        return repsitory.save(contact);
    }

    private String getServiceReqNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(999999999 - 9999) + 9999;
        return "SR" + randomNumber;
    }
}
