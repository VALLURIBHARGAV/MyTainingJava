<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient List</title>
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
        margin-top: 20px;
    }

    table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid #ccc;
        padding: 10px;
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
</style>
</head>
<body>
    <h1>Patient Lists</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Age</th>
            <th>Health Issue</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${patients}" var="pat">
            <tr>
                <td>${pat.id}</td>
                <td>${pat.name}</td>
                <td>${pat.gender}</td>
                <td>${pat.age}</td>
                <td>${pat.healthissue}</td>
                <td>${pat.address}</td>
                <td><a href="/patient/editPatient/${pat.id}"><button>Edit</button></a></td>
                <td><a href="/patient/deletePatient/${pat.id}"><button>Delete</button></a></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/patient/addPatient"><button>Insert New Patient</button></a>
</body>
</html>
