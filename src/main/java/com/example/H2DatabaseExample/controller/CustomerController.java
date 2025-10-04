package com.example.H2DatabaseExample.controller;


import com.example.H2DatabaseExample.model.Customer;
import com.example.H2DatabaseExample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/getCustomers")
    List<Customer> getCustomers() {
        return repository.findAll();
    }
}
