<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>===== Cart List =====</title>
</head>
<body>
<h3>Cart List</h3>
	<form action="back">
		<input type="submit" value="Back"/>
	</form>
    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Cost</th>
            <th>Product Quantity</th>
            <th>Product Discount</th>
        </tr>
        <c:forEach var="cart" items="${list}">
            <tr>
                <td>${cart.id}</td>
                <td>${cart.name}</td>
                <td>${cart.cost}</td>
                <td>${cart.quantity}</td>
                <td>${cart.discount}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>