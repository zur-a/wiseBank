package com.Joi.wiseBank.controller;

import com.Joi.wiseBank.Repository.CustomerRepository;
import com.Joi.wiseBank.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;
    private ResponseEntity response = null;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
        Customer registeringCustomer = null;
        try {
            String hashPassword = passwordEncoder.encode(customer.getPwd());
            customer.setPwd(hashPassword);
            customer.setCreateDate(String.valueOf(new Date(System.currentTimeMillis())));
            registeringCustomer = repository.save(customer);

            if (registeringCustomer.getId() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Customer is succesfully registered");
            }
            
        } catch (Exception e) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Exception ocurred: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping("/user")
    public Customer getUserDetails(Authentication authentication) {
        List<Customer> customers = repository.findByEmail(authentication.getName());
        if (customers.size() > 0) {
            return customers.get(0);
        } else {
            return null;
        }
    }
}
