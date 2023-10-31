<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor Form</title>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        
        h1 {
            background-color: #007bff;
            color: #fff;
            text-align: center;
            padding: 20px;
        }
        
        form {
            max-width: 500px;
            margin: 20px auto;
            background-color: #fff;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
            padding: 20px;
        }
        
        label {
            font-weight: bold;
        }
        
        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        
        button {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        
        button:hover {
            background-color: #0056b3;
        }
        
        a {
            text-decoration: none;
            color: #007bff;
            display: block;
            margin-top: 20px;
            text-align: center;
        }
        
        a:hover {
            background-color: #0056b3;
            color: #fff;
        }
    </style>
</head>
<body>
    <h1>Doctor Filling Form</h1>
    <form:form action="/adddoc" method="post" modelAttribute="doctor">
        <form:label path="name">Doctor name:</form:label>
        <form:input path="name"/><br/>
        <form:label path="specialization">Specialization:</form:label>
        <form:input path="specialization"/><br/>
       
        <form:button>SUBMIT</form:button>
    </form:form>
    <a href="/listdoc">Back to List</a>
    
</body>
</html>