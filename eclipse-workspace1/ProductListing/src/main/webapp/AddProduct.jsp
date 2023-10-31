<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>
<%
 session = request.getSession(false); 
if (session != null && session.getAttribute("AdminUser") != null) {
    response.sendRedirect("Login.html"); 
}

%>

 <form action="/ProductListing/AddProduct" method="post"><br>
 Product ID <input type="text" name="pid"><br>
 Product Name <input type="text" name="pname"><br>
 Product Price <input type="text" name="pprice"><br>
 <input type="submit" value="Add Product">

  
 </form>

</body>
</html>