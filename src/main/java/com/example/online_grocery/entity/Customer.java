package com.example.online_grocery.entity;

import jakarta.persistence.*;


import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "customer_name")
    private String name;
    private String email;
    private String phone;
    private String address;
}
