<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Accommodation List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }

        h1 {
            background-color: #333;
            color: #fff;
            padding: 10px;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:nth-child(odd) {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
    <h1>Accommodation List</h1>
    <table>
        <tr>
            <th>Bed Number</th>
            <th>Bed Status</th>
            <th>Bed Location</th>
            <th>Actions</th>
            
        </tr>
        <c:forEach items="${bed}" var="bd">
            <tr>
                <td>${bd.bedno}</td>
                <td>${bd.bedstatus}</td>
                <td>${bd.ward}</td>
                
                <td>
                    <a href="/editBed/${bd.bedid }">Edit</a>
                    <a href="/deleteBed/${bd.bedid }">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="add-patient-link">
        <a href="/addBed">Insert New Bed</a>
    </div>
    
</body>
</html>
