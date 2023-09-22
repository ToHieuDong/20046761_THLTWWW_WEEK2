package com.example.thltwww_week2.services;

import com.example.thltwww_week2.models.Employee;
import com.example.thltwww_week2.repositories.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService() {
        repository = new EmployeeRepository();
    }

    public void addEmployee(Employee employee) {
        repository.addEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        repository.updateEmployee(employee);
    }

    public Employee findByIdEmployee(long id) {
        return repository.findByIDEmployee(id);
    }

    public List<Employee> getAllEmployee() {
        return repository.getAllEmployee();
    }

}
