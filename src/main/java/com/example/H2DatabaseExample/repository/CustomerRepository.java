package com.example.H2DatabaseExample.repository;

import com.example.H2DatabaseExample.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
