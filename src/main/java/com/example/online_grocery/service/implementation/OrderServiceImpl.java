package com.example.online_grocery.service.implementation;



import java.util.List;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.online_grocery.exeception.ResourceNotFoundException;
import com.example.online_grocery.dto.OrderRequest;

import com.example.online_grocery.entity.Customer;
import com.example.online_grocery.entity.GroceryItem;
import com.example.online_grocery.entity.Order;

import com.example.online_grocery.repository.CustomerRepository;
import com.example.online_grocery.repository.GroceryItemRepository;
import com.example.online_grocery.repository.OrderRepository;
import com.example.online_grocery.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
    }

    @Override
    public Order createOrder(OrderRequest orderRequest) {
        Customer customer = customerRepository.findById(orderRequest.getCustomerId())
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + orderRequest.getCustomerId()));
        List<GroceryItem> groceryItems =groceryItemRepository.findAllById(orderRequest.getGroceryItemIds());

        if (groceryItems.size() != orderRequest.getGroceryItemIds().size()) {
            throw new ResourceNotFoundException("One or more products not found");
        }

        Order order = new Order();

        order.setCustomer(customer);
        order.setItems(groceryItems);
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        Order order = getOrderById(id);
        orderRepository.delete(order);
    }



}
