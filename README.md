# 🛒 Online Grocery Order Management System

## 📌 Project Description

This project is a RESTful API built using Spring Boot to manage an online grocery ordering system. It allows users to perform CRUD operations on Customers, Grocery Items, and Orders. The system demonstrates entity relationships, database integration, and REST API development using Spring Boot and MySQL/H2.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- MySQL / H2 Database
- Gradle
- Lombok
- IntelliJ IDEA
- Postman (for API testing)

---


---
## 📂 Project Structure

com.example.online_grocery
│
├── controller
│   ├── CustomerController.java
│   ├── GroceryItemController.java
│   └── OrderController.java
│
├── service
│   ├── CustomerService.java
│   ├── GroceryItemService.java
│   ├── OrderService.java
│   │
│   └── implementation
│       ├── CustomerServiceImpl.java
│       ├── GroceryItemServiceImpl.java
│       └── OrderServiceImpl.java
│
├── repository
│   ├── CustomerRepository.java
│   ├── GroceryItemRepository.java
│   └── OrderRepository.java
│
├── entity
│   ├── Customer.java
│   ├── GroceryItem.java
│   └── Order.java
│
├── exception
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
│
└── GroceryApplication.java


## 🧩 Entity Relationships

- One Customer → Many Orders
- One Order → Many Grocery Items
- One Grocery Item → Many Orders

This creates:

- One-to-Many relationship (Customer → Orders)
- Many-to-Many relationship (Orders ↔ Grocery Items)



📡 API Endpoints

Customers
POST /customers: Create a new customer
GET /customers: Get all customers
GET /customers/{id}: Get customer by ID
PUT /customers/{id}: Update specific customer details
DELETE /customers/{id}: Delete a customer

Grocery Items
POST /items: Create a new item
GET /items: Get all items
GET /items/{id}: Get item by ID
PUT /items/{id}: Update an item
DELETE /items/{id}: Delete an item

Orders
POST /orders: Place a new order
GET /orders: Get all orders
GET /orders/{id}: Get order by ID
DELETE /orders/{id}: Delete an order

---

## 🛠 Database Configuration

Example MySQL configuration in `application.properties`:

````properties
spring.datasource.url=jdbc:mysql://localhost:3306/grocery_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect


