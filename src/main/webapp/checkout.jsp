<%@ page import="com.example.thltwww_week2.backend.models.Product" %>
<%@ page import="com.example.thltwww_week2.backend.models.ProductImage" %><%--
  Created by IntelliJ IDEA.
  User: Gnoodd
  Date: 12/2/2023
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .product-image {
            width: 80px;
            height: 100px;
        }

        .container {
            width: 80%;
            margin: 0 auto;
        }

        header {
            background-color: #333;
            color: white;
            padding: 10px 0;
            text-align: center;
        }

        section {
            margin: 20px 0;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        button {
            background-color: #333;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<header>
    <h1>Checkout</h1>
</header>

<div class="container">
    <% Product product = (Product) request.getAttribute("pro"); %>
    <% ProductImage productImage = (ProductImage) request.getAttribute("img"); %>
    <section>
        <h2>Order Summary</h2>
        <!-- Display order summary here -->
        <img class="product-image" src=<%=productImage.getPath()%> >
        <p>Product Name: <%=product.getDescription()%></p>
        <p>Product OS: <%=product.getManufacturer()%></p>

    </section>

    <section>
<%--        <h2>Shipping Information</h2>--%>
        <!-- Your shipping form goes here -->
<%--        <form action="#" method="post">--%>
<%--            <label for="firstName">First Name:</label>--%>
<%--            <input type="text" id="firstName" name="firstName" required>--%>

<%--            <label for="lastName">Last Name:</label>--%>
<%--            <input type="text" id="lastName" name="lastName" required>--%>

<%--            <label for="address">Address:</label>--%>
<%--            <input type="text" id="address" name="address" required>--%>

            <button><a href="controls?action=pro_lst">Place Order</a></button>
<%--        </form>--%>
    </section>
</div>
</body>
</html>
