<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Error Page</h1>
<h3>Invalid Credentials! Please Login again</h3>

<a href="<%= request.getContextPath() %>/admin/login">Re-Login</a>
</body>
</html>