<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Generate Bill</title>
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

        input {
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

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }

        th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
    
</head>
<body>
    <h1>Generate Bill</h1>
    <form action="/bills/generateBill" method="post" >
        <label for="patient">Enter Patient ID:</label>
        <c:if test="${bill != null}">
        <input name="patient"  value="${bill.patient.id}"/><br><br>
        </c:if>
        <c:if test="${bill == null}">
        <input name="patient"  /><br><br>
        </c:if>
        <input type="submit" value="Generate Bill">
    </form>
    <c:if test="${bill != null}">
        <h2>Generated Bill</h2>
        <table border="1">
            <tr>
            	<th>Patient ID</th>
                <th>Patient Name</th>
                <th>Bed Charges</th>
                <th>Ward Charges</th>
                <th>Treatment Charges</th>
                <th>Total Amount</th>
            </tr>
            <tr>
            	<td>${bill.patient.id}</td>
                <td>${bill.patient.name}</td>
                <td>${bill.bedCharges}</td>
                <td>${bill.wardCharges}</td>
                <td>${bill.treatmentCharges}</td>
                <td>${bill.amount}</td>
            </tr>
        </table>
    </c:if>
    <a href="/bills">Back to List</a>
</body>
</html>
