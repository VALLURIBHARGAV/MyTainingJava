<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Bills</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }

        table, th, td {
            border: 1px solid #333;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        a {
            text-decoration: none;
            background-color: #007bff;
            color: #fff;
            padding: 5px 10px;
            border-radius: 3px;
            margin-right: 5px;
        }

        a:hover {
            background-color: #0056b3;
        }

        a.delete {
            background-color: #dc3545;
        }

        a.delete:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>
    <h1>List of Bills</h1>
    <table>
        <tr>
            <th>Bill Number</th>
            <th>Bill Date</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${bills}" var="bill">
            <tr>
                <td>${bill.billNumber}</td>
                <td>${bill.billDate}</td>
                <td>${bill.amount}</td>
                <td>
                    <a href="/bills/${bill.id}">View</a>
                    <a href="/bills/edit/${bill.id}">Edit</a>
                    <a href="/bills/delete/${bill.id}" class="delete">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="<c:url value='/bills/add'/>">Add New Bill</a>
</body>
</html>
