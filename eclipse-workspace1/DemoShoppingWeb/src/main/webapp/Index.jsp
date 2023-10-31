<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>
<h1>Home Page</h1>
<%
if(session.getAttribute("user")==null){
%>
<div align="right"><a href="Login.jsp"> Login</a>/<a href="Register.jsp"> SignUp</a></div>
<%
}
else{
%>
<div align="right"><%=session.getAttribute("user").toString() %><a href ="Logout.jsp">Logout</a></div>
<%
}%>
</body>
</html>