<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
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

    input[type="text"],
    input[type="password"] {
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
    }

    input[type="submit"]:hover {
      background-color: #0056b3;
    }

    p {
      color: red;
    }
  </style>
</head>
<body>
  <h1>Login</h1>

  <form action="/PBS/login" method="post">
    <input type="text" name="username" placeholder="Username" required="required">
    <input type="password" name="password" placeholder="Password" required="required">
    <input type="submit" value="Login">
  </form>

  <c:if test="${not empty errorMessage}">
    <p>${errorMessage}</p>
  </c:if>
</body>
</html>
