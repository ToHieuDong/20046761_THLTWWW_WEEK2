package com.example.thltwww_week2.backend.repositories;

import com.example.thltwww_week2.backend.models.Employee;
import com.example.thltwww_week2.backend.models.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class ProductRepository {
    private EntityManager manager;
    private EntityTransaction transaction;

    public ProductRepository() {
        manager = Persistence.createEntityManagerFactory("week2").createEntityManager();
        transaction = manager.getTransaction();
    }

    public void addProduct(Product product) {
        try {
            transaction.begin();
            manager.persist(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void updateProduct(Product product) {
        try {
            transaction.begin();
            manager.merge(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public Product findByIDProduct(long id) {
        Product em = new Product();
        try {
            transaction.begin();

            em = manager.find(Product.class, id);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return em;
    }

    public List<Product> getAllProduct() {
        return manager.createNativeQuery("select * from product", Product.class).getResultList();
    }
}
