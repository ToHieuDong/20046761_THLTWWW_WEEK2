package com.example.thltwww_week2.backend.repositories;

import com.example.thltwww_week2.backend.models.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class EmployeeRepository {
    private EntityManager manager;
    private EntityTransaction transaction;

    public EmployeeRepository() {
        manager = Persistence.createEntityManagerFactory("week2").createEntityManager();
        transaction = manager.getTransaction();
    }

    public void addEmployee(Employee employee) {
        try {
            transaction.begin();
            manager.persist(employee);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void updateEmployee(Employee employee) {
        try {
            transaction.begin();
            manager.merge(employee);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public Employee findByIDEmployee(long id) {
        Employee em = new Employee();
        try {
            transaction.begin();

            em = manager.find(Employee.class, id);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return em;
    }

    public List<Employee> getAllEmployee() {
        return manager.createNativeQuery("select * from employee", Employee.class).getResultList();
    }











}
