<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Bill</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        form {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
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

        input[type="text"] {
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

        a {
            text-decoration: none;
            color: #007bff;
            display: block;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <h1>Edit Bill</h1>
    <form:form action="/bills/edit/${bill.id}" modelAttribute="bill" method="post">
        <form:hidden path="id" />
        <label for="billNumber">Bill Number:</label>
        <form:input path="billNumber" required="true" /><br><br>
        <label for="billDate">Bill Date:</label>
        <form:input path="billDate" required="true" /><br><br>
        <label for="amount">Amount:</label>
        <form:input path="amount" required="true" /><br><br>
        <input type="submit" value="Update Bill">
    </form:form>
    <a href="/bills">Back to List</a>
</body>
</html>
