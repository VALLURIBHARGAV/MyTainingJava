<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Register Page</title>
</head>
<body>


	<form action="RegisterAccountServlet" method="post">

		Name &nbsp; <input type="text" name="Name"><br>
		UserId <input type="text" name="UserId"><br> 
		Password <input type="password" name="Password"><br>
		<input type="submit" value="Submit">
	</form>

</body>
</html>