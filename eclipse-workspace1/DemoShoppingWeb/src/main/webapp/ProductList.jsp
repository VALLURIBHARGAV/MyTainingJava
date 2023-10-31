<%@page import="com.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" import="Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<h1>Product Listing</h1>
<table cellspacing="2" cellpadding="2">
<tr>
<td>Product Id </td> <td> Product Name </td> 
<%
ArrayList<Product> list =(ArrayList<Product>)session.getAttribute("products");
%>
</table>
</body>
</html>