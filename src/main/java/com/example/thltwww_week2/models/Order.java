package com.example.thltwww_week2.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "order_day", columnDefinition = "datetime")
    private LocalDateTime orderDay;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order() {
    }

    public Order(long orderId, LocalDateTime orderDay) {
        this.orderId = orderId;
        this.orderDay = orderDay;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(LocalDateTime orderDay) {
        this.orderDay = orderDay;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDay=" + orderDay +
                '}';
    }
}
