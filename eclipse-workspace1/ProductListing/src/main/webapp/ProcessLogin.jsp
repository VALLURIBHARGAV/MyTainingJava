<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<%
String user=request.getParameter("username");
String password=request.getParameter("password");
 
if(user.equals("AdminUser") && password.equals("Admin@123")) {
	session.setAttribute("user", user);
	%>
	<h2>Welcome to <%=user%></h2><br/>
 	<h3 style="color:blue">Welcome to Add Product Page </h3>
	<a href='AddProduct.jsp'> <button>Click to Add Product</button></a> &nbsp; &nbsp; &nbsp;
	<a href="ProductList.jsp"> <button>Click to View Product</button></a>
	<%
	}
else if (user.equals("User") && password.equals("User@123")) {
	session.setAttribute("user", user);
	%>
	<h2>Welcome to <%=user%></h2><br/>
	<h3 style="color:blue">Welcome to Product List Page </h3>
	<a href="ProductList.jsp"> <button>Click to View Product  </button></a>
	<%
	}
else{
	%>
	<h3 style="color:red">Invalid credentials </h3>
	<a href="Login.html">Click re-login</a>
	<%
	}%>


</body>
</html>