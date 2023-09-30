package com.example.thltwww_week2.frontend.controllers;

import com.example.thltwww_week2.frontend.model.EmployeeModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/controls")
public class ServletController extends HttpServlet {
    private EmployeeModel model = new EmployeeModel();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if (actionObject !=null) {
                resp.sendRedirect("index.jsp");
                if (actionObject.equals("insert_Emp")) {
                    model.insertEmp(req, resp);
                    model.listing(req, resp);
                    resp.sendRedirect("custom.jsp");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if (actionObject !=null) {
                String action = actionObject.toString();
                if (action.equals("emp_lst")) {
                    model.listing(req, resp);
                    resp.sendRedirect("custom.jsp");

                }
            } else {
                resp.sendRedirect("index.jsp");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
