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

--
## 📡 API Endpoints

### 👤 Customer APIs

| Method | Endpoint | Description |
|------|----------|-------------|
| POST | /customers | Create a new customer |
| GET | /customers | Get all customers |
| GET | /customers/{id} | Get customer by ID |
| PUT | /customers/{id} | Update specific customer details |
| DELETE | /customers/{id} | Delete a customer |

### 🛒 Grocery Item APIs

| Method | Endpoint | Description |
|------|----------|-------------|
| POST | /items | Create a new item |
| GET | /items | Get all items |
| GET | /items/{id} | Get item by ID |
| PUT | /items/{id} | Update an item |
| DELETE | /items/{id} | Delete an item |

### 📦 Order APIs

| Method | Endpoint | Description |
|------|----------|-------------|
| POST | /orders | Place a new order |
| GET | /orders | Get all orders |
| GET | /orders/{id} | Get order by ID |
| DELETE | /orders/{id} | Delete an order |

---

## 🌐 Base URL

http://localhost:8080

---

## 🧪 Example JSON Request

Create Customer:

{
  "name": "Dinesh",
  "email": "dinesh@gmail.com",
  "address": "Hyderabad",
  "phone": "9876543210"
}


---

## ⚙ Database Configuration

Example MySQL configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/grocery_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---




## ▶ How to Run the Project

1. Clone repository  
git clone https://github.com/yourusername/grocery-order-management.git  

2. Open in IntelliJ IDEA  

3. Configure database in application.properties  

4. Run GroceryApplication.java  

---

## 🧪 Testing APIs

Use Postman to test APIs  

Example:  
POST http://localhost:8080/customers  

---

## 🎯 Features

- Customer CRUD operations  
- Grocery Item CRUD operations  
- Order CRUD operations  
- Entity relationships  
- Exception handling  
- RESTful API design  
- Database integration  


