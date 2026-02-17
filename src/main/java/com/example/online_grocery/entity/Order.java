package com.example.online_grocery.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="customer_order")
@Data
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name="Customer_id")
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "order_grocery",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "grocery_id")
    )
    private List<GroceryItem>items = new ArrayList<>();




}

