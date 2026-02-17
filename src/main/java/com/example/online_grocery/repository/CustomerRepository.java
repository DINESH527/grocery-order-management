package com.example.online_grocery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_grocery.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
        // Custom query method
        List<Customer> findByEmail(String email);
}


