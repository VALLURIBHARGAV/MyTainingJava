<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Patient form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
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
        input[type="number"],
        textarea,
        select {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 16px;
        }

        select {
            height: 30px;
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

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
    <h1>Patient Filling Form</h1>
    <spring:form action="/patient/savePatient" modelAttribute="patient" method="post">
        Patient Name: <spring:input path="name" type="text"/>
        Gender: 
        <spring:select path="gender">
            <spring:option value="Male">Male</spring:option>
            <spring:option value="Female">Female</spring:option>
        </spring:select>
        Age: <spring:input path="age" type="number"/>
        Health issue: <spring:input path="healthissue" type="text"/>
        Address: <spring:input path="address" type="textarea"/>
        <input type="submit" value="Add Patient"/>
    </spring:form>
    <br>
    <a href="/patient/list">Back to List</a>
</body>
</html>
