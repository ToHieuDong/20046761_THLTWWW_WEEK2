package com.example.thltwww_week2.backend.resources;

import com.example.thltwww_week2.backend.models.Employee;
import com.example.thltwww_week2.backend.services.EmployeeService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;

@Path("/hello")
public class resource {

    private EmployeeService service;

    public resource() {
        service = new EmployeeService();
    }

    @GET
    @Produces("application/json")
    public List<Employee> hello() {
        return service.getAllEmployee();
    }



}
