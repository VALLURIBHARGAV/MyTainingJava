<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" import="javax.naming.*" import="javax.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
    String amountStr = request.getParameter("amount");
    if (amountStr != null && !amountStr.isEmpty()) {
        double amount = Double.parseDouble(amountStr);
       
            Context initContext = new InitialContext();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hollandbank", "root", "VIBV!*1998*");


            PreparedStatement stmt=  con.prepareStatement("INSERT INTO accountdetails(balance) VALUES (?)");
            stmt.setDouble(1, amount);
            stmt.executeUpdate();
    %>
            <p>Deposit of $<%= amount %> added successfully!</p>
    <%
        }else{
    %>
    
        <p>Please enter a valid amount.</p>
        <a href="Deposit.jsp"> <button> Back to Deposit Form </button></a>
<%} %>
</body>
</html>