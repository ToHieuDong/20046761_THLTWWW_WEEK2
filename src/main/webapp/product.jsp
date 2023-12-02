<%@ page import="com.example.thltwww_week2.backend.models.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Gnoodd
  Date: 12/2/2023
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>

<style>
    #productContainer {
        display: flex;
        flex-wrap: wrap;
    }

    .product {
        border: 1px solid #ccc;
        margin: 10px;
        padding: 10px;
        width: 200px;
    }

    .product p {
        margin: 0;
    }
</style>
<body>
<%
    //        EmployeeService service = new EmployeeService();
//        List<Employee> lst = service.getAllEmployee();
    List<Product> lst = (List<Product>) request.getAttribute("pro_list");
//    System.out.println(lst);
%>
    <h1>Product</h1>
    <div id="productContainer">
        <% for (Product product:lst) { %>
            <div class="product">
                <p><%=product.getDescription()%></p>
                <p><%=product.getManufacturer()%></p>
                <form action="controls?action=checkout" method="post">
                    <input type="hidden" name="productId" value="<%= product.getProduct_id() %>"/>
                    <button class="product" style="width: 180px;" type="submit">Mua</button>
                </form>
            </div>

        <%}%>
    </div>





</body>
</html>
