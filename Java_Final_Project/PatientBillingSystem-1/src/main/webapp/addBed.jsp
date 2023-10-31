<%@page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accommodation Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }

        h2 {
            background-color: #333;
            color: #fff;
            padding: 10px;
        }

        form {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        }

        label {
            display: block;
            margin-top: 10px;
        }

        input[type="number"],
        input[type="text"],
        select {
            width: 50%;
            padding: 10px;
            margin-top: 5px;
            margin-bottom: 10px;
        }

        input[type="radio"] {
            margin-right: 5px;
        }

        input[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h2>Accommodation Details</h2>
<form:form modelAttribute="bed" action="/addBed" method="post">
    <form:label path="bedno">Bed Number:</form:label>
    <form:input path="bedno" /><br>
    <form:label path="bedstatus">Bed Status:</form:label><br>
    <form:radiobutton path="bedstatus" value="Occupied" label="Occupied"/>
    <form:radiobutton path="bedstatus" value="Available" label="Available"/><br>
    <form:label path="ward">Ward:</form:label>
    <form:select path="ward">
        <option value="ICU">ICU</option>
        <option value="General">General</option>
        <option value="Ward">Ward</option>
    </form:select><br>
    <form:button>SUBMIT</form:button>
</form:form>
<a href="/bedList">Back to List</a>
</body>
</html>