<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>===== Customers List =====</title>
</head>
<body>
<h3>Customers List</h3>
    <table border="1">
        <tr>
            <th>Customer ID</th>
            <th>Customer Name</th>
            <th>Customer Balance</th>
        </tr>
        <c:forEach var="customer" items="${list}">
            <tr>
                <td>${customer.cid}</td>
                <td>${customer.name}</td>
                <td>${customer.balance}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>