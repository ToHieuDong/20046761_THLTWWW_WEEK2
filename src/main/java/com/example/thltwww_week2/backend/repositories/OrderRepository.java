package com.example.thltwww_week2.backend.repositories;

import com.example.thltwww_week2.backend.models.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class OrderRepository {
    private EntityManager manager;
    private EntityTransaction transaction;

    public OrderRepository() {
        manager = Persistence.createEntityManagerFactory("week2").createEntityManager();
        transaction = manager.getTransaction();
    }

    public void addOrder(Order order) {
        try {
            transaction.begin();
            manager.persist(order);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void updateOrder(Order order) {
        try {
            transaction.begin();
            manager.merge(order);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public Order findByIdOrder(long id) {
        Order em = new Order();
        try {
            transaction.begin();

            em = manager.find(Order.class, id);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return em;
    }

    public List<Order> getAllOrder() {
        return manager.createNativeQuery("select * from order", Order.class).getResultList();
    }
}
