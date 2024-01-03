package com.Joi.wiseBank.config;

import com.Joi.wiseBank.Repository.CustomerRepository;
import com.Joi.wiseBank.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class WiseBankUserDetails implements UserDetailsService {
    @Autowired
    CustomerRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String userName, password = null;
        List<GrantedAuthority> authorities = null;

        List<Customer> customers = repository.findByEmail(username);

        if (customers.size() == 0) {
            throw new UsernameNotFoundException("User: " + username + "doesn not exist");
        } else {
            userName = customers.get(0).getEmail();
            password = customers.get(0).getPwd();
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(customers.get(0).getRole()));
        }
        return new User(username, password, authorities);
    }
}
