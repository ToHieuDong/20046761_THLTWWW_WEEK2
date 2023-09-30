package com.example.thltwww_week2.frontend.model;

import com.example.thltwww_week2.backend.models.Employee;
import com.example.thltwww_week2.backend.services.EmployeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class EmployeeModel {
    private final EmployeeService service = new EmployeeService();

    public void insertEmp(HttpServletRequest request, HttpServletResponse response) {
        Employee employee = new Employee();
        employee.setFullname(request.getParameter("name"));
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime = LocalDate.parse(request.getParameter("dob"), timeFormatter);
        employee.setDob(dateTime);
        employee.setEmail(request.getParameter("email"));
        employee.setPhone(request.getParameter("phone"));
        employee.setAddress(request.getParameter("address"));

        service.addEmployee(employee);
    }

    public void listing(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> lst = service.getAllEmployee();

        request.setAttribute("emp_lst", lst);
        request.getRequestDispatcher("custom.jsp").forward(request, response);
    }
}
