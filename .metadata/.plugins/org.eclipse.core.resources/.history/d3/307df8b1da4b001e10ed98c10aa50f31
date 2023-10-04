<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>===== Add Cart Products =====</title>
</head>
<body>
	<h3>
	Products List	
	</h3>
	<form action="back">
		<input type="submit" value="Back"/>
	</form>
    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Name</th>
            <th>Cost</th>
            <th>Available Quantity</th>
            <th>Discount</th>
        </tr>
        <c:forEach var="product" items="${list}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.cost}</td>
                <td>${product.quantity}</td>
                <td>${product.discount}</td>
				<td>
	                <form action="addItems">
        				<input type="hidden" name="id" value="${product.id}"/>
        				<input type="hidden" name="name" value="${product.name}"/>
        				<input type="hidden" name="cost" value="${product.cost}"/>
        				<input type="hidden" name="discount" value="${product.discount}"/>
        				<input type="submit" value="Add to Cart" />       	
    	            </form>
				</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>