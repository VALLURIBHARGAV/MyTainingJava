<%@page import="com.example.demo.models.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
<h1>Product Details</h1>

<%
Product myPrd = (Product)request.getAttribute("product");
%>
<ul>
<li><%=myPrd.getPrdId()%></li>
<li><%=myPrd.getPrdName()%></li>
<li><%=myPrd.getPrdPrice()%></li>
</ul>

<h2>${user}</h2>
<h3>${product}</h3>


</body>
</html>