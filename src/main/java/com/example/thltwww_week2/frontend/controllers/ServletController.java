package com.example.thltwww_week2.frontend.controllers;

import com.example.thltwww_week2.backend.models.Employee;
import com.example.thltwww_week2.backend.models.Product;
import com.example.thltwww_week2.backend.models.ProductImage;
import com.example.thltwww_week2.backend.repositories.ProductImgRepository;
import com.example.thltwww_week2.backend.repositories.ProductRepository;
import com.example.thltwww_week2.frontend.model.EmployeeModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/controls")
public class ServletController extends HttpServlet {
    private EmployeeModel model = new EmployeeModel();
    private ProductRepository productRepository = new ProductRepository();
    private ProductImgRepository productImgRepository = new ProductImgRepository();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if (actionObject !=null) {
//                resp.sendRedirect("index.jsp");
                if (actionObject.equals("insert_Emp")) {
                    model.insertEmp(req, resp);
                    model.listing(req, resp);
//                    resp.sendRedirect("custom.jsp");
                } else if (actionObject.equals("checkout")) {
                    handleCheckout(req, resp);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void handleCheckout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productId = req.getParameter("productId");
        ProductImage productImage = productImgRepository.findByIDProductImg(Long.parseLong(productId));
        Product  product = productRepository.findByIDProduct(Long.parseLong(productId));

        req.setAttribute("img", productImage);
        req.setAttribute("pro", product);
//        resp.sendRedirect("checkout.jsp");
        System.out.println(productImage );
        System.out.println(product );
        req.getRequestDispatcher("checkout.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if (actionObject !=null) {
                String action = actionObject.toString();
                if (action.equals("emp_lst")) {
                    model.listing(req, resp);
//                    resp.sendRedirect("custom.jsp");
                } else if (action.equals("pro_lst")) {
                    handleProductlist(req, resp);
                }
            } else {
                resp.sendRedirect("index.jsp");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void handleProductlist(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Product> lst = productRepository.getAllProduct();

        req.setAttribute("pro_list", lst);
        req.getRequestDispatcher("product.jsp").forward(req, resp);
    }
}
