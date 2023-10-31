<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm Page</title>
</head>
<body>
		<h2>Order Placed Successfully</h2>
		<%String username = request.getParameter("username");
		session.setAttribute("username", username);%>
		
		<p>Thank you ,<b><%out.println(username);%></b> for your purchase!</p><br>
		<a href="Login.html"><button>Re-Login</button></a> &nbsp; &nbsp; 
		<a href="Login.jsp"><button>Product Page</button></a>
</body>
</html>