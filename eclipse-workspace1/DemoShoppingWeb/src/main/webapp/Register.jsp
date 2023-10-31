<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<h3 align="center"> Register</h3>
<form action="ResgisterServlet" method="post">

UserName: <input type="text" name="username"> <br>
PassWord: <input type="password" name="password"><br>
Email:  <input type="email" name="email"><br>
<input type="submit" value="Register"> 
</form>
</body>
</html>