<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Patient</title>
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

        button {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 18px;
            margin-top: 10px;
        }

        button:hover {
            background-color: #0056b3;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
<% int value=(int)request.getAttribute("id"); %>
    <h1>Edit Patient</h1>
    <spring:form action="/patient/editSavePatient" method="post" modelAttribute="patient">
        <spring:label path="name">Patient name:</spring:label>
        <spring:input path="name" /><br/>
        <spring:label path="gender">Gender:</spring:label>
        <spring:input path="gender"/><br/>
        <spring:label path="age">Age:</spring:label>
        <spring:input path="age" /><br/>
        <spring:label path="healthissue">Health Issue:</spring:label>
        <spring:input path="healthissue" /><br/>
        <spring:label path="address">Address:</spring:label>
        <spring:input path="address" /><br/>
        <spring:input path="id" value="<%=value%>" type="hidden"/>
        <spring:button>SUBMIT</spring:button>
    </spring:form>
    <a href="/patient/list">Back to List</a>
</body>
</html>