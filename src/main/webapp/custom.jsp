<%@ page import="com.example.thltwww_week2.backend.services.EmployeeService" %>
<%@ page import="com.example.thltwww_week2.backend.models.Employee" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hieud
  Date: 9/29/2023
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        EmployeeService service = new EmployeeService();
//        List<Employee> lst = service.getAllEmployee();
        List<Employee> lst = (List<Employee>) request.getAttribute("emp_lst");
    %>
    <h1>Table Employee</h1>
    <table class="table table-hover">
        <tr>
            <th>EmpID</th>
            <th>FullName</th>
            <th>DayOfBirth</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Status</th>
            <th colspan="2"><a href="InsertEmp.jsp">Insret</a></th>
        </tr>

        <%for (Employee e:lst) { %>
            <tr>
                <td><%=e.getEmpid()%></td>
                <td><%=e.getFullname()%></td>
                <td><%=e.getDob()%></td>
                <td><%=e.getEmail()%></td>
                <td><%=e.getAddress()%></td>
                <td><%=e.getPhone()%></td>
                <td><%=e.getStatus()%></td>
            </tr>
        <%}%>

    </table>


</body>
</html>
