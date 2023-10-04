<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Customer</title>
</head>
<body>
    <h1>Add Customer</h1>
    <form action="getCustomers" method="post">
        <label for="cid">Customer ID:</label>
        <input type="text" id="cid" name="cid" required><br><br>
        
        <label for="name">Customer Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="balance">Balance:</label>
        <input type="text" id="balance" name="balance" required><br><br>
        
        <input type="submit" value="Add Customer">
    </form>
</body>
</html>
