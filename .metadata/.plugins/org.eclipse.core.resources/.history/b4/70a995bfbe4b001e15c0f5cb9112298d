<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
</head>
<body>
    <h1>Customer List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Balance</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td>${customer.customer_id}</td>
                <td>${customer.name}</td>
                <td>${customer.email}</td>
                <td>${customer.balance}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
