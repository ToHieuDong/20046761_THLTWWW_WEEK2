package com.example.thltwww_week2.services;

import com.example.thltwww_week2.models.Order;
import com.example.thltwww_week2.repositories.OrderRepository;

import java.util.List;

public class OrderService {

    private OrderRepository repository;

    public OrderService() {
        repository = new OrderRepository();
    }

    public void addOrder(Order order) {
        repository.addOrder(order);
    }

    public void updateOrder(Order order) {
        repository.updateOrder(order);
    }

    public Order findByIdOrder(long id) {
        return repository.findByIdOrder(id);
    }

    public List<Order> getAllOrder() {
        return repository.getAllOrder();
    }
}
