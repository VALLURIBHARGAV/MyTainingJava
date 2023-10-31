<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit page</title>
</head>
<body>
    <h1>Deposit Form</h1>
    <form action="depositHandler.jsp" method="post">
        Amount: <input type="text" name="amount" id="amount">
        <input type="submit" value="Deposit">
    </form>
</body>
</html>