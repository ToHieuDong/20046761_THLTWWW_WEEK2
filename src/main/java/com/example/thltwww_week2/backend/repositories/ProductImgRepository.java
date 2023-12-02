package com.example.thltwww_week2.backend.repositories;

import com.example.thltwww_week2.backend.models.Employee;
import com.example.thltwww_week2.backend.models.ProductImage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class ProductImgRepository {
    private EntityManager manager;
    private EntityTransaction transaction;

    public ProductImgRepository() {
        manager = Persistence.createEntityManagerFactory("week2").createEntityManager();
        transaction = manager.getTransaction();
    }

    public void addProductImg(ProductImage productImage) {
        try {
            transaction.begin();
            manager.persist(productImage);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void updateProductImg(ProductImage productImage) {
        try {
            transaction.begin();
            manager.merge(productImage);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public ProductImage findByIDProductImg(long id) {
        ProductImage em = new ProductImage();
        try {
            transaction.begin();

            em = manager.find(ProductImage.class, id);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return em;
    }

    public List<ProductImage> getAllProductImage() {
        return manager.createNativeQuery("select * from product_image", ProductImage.class).getResultList();
    }
}
