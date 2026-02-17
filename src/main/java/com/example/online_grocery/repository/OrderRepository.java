package com.example.online_grocery.repository;

import com.example.online_grocery.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
