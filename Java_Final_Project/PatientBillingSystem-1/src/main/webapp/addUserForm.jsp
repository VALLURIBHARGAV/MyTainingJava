<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add User Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        form {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px #ccc;
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            margin-top: 20px;
        }

        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"],
        select {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 18px;
            margin-top: 10px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h2>Enter User Details</h2>
    <spring:form action="/admin/dashboard/addUser" modelAttribute="user" method="post">
        User Name: <spring:input path="username" type="text" /><br />
        Password: <spring:input path="password" type="password" /><br />
        Role:
        <spring:select path="role">
            <spring:option value="ADMIN">Admin</spring:option>
            <spring:option value="OPERATOR">Operator</spring:option>
            <spring:option value="DOCTOR">Doctor</spring:option>
        </spring:select><br />
        <input type="submit" value="Add User" />
    </spring:form>
</body>
</html>
