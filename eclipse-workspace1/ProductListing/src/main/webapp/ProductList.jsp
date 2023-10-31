<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.Connection"
	import="java.sql.DriverManager" import="java.sql.Statement" import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List Page</title>
</head>
<body>
<h3 style="color:blue">Welcome to Product List Page </h3>

<%
 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/productlist", "root", "VIBV!*1998*");
	//PreparedStatement ps = con.prepareStatement("Select pid,pname,pcost from product ");
	Statement s =con.createStatement();
	String query="Select * from products";
	//ps.setInt(1, pid);
	ResultSet rs=s.executeQuery(query);
	%>
	<table style="border:thick;">
	<tr><td>Product ID</td><td>Product Name</td><td>Product Cost</td></tr>
	<%
	while(rs.next()){
		%>
	<tr>
	<td><%=rs.getInt(1)%></td>
	<td><%= rs.getString(2)%></td>
	<td><%=rs.getFloat(3)%>
	</td></tr>
	<%
	}%>
	</table>
	


</body>
</html>