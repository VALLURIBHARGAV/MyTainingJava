<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Shopping</title>
 <style>
        body {
        
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            align-items: center;
            justify-content: center;
        }

        center {
            margin-top: 50px;
        }

        h2 {
            color: #333;
        }

        h3 {
            color: #555;
        }

        p {
            color: #777;
        }

        form {
            margin-bottom: 20px;
        }

        input[type='submit'] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type='submit']:hover {
            background-color: #45a049;
        }
        
    </style>

</head>
<body>
<% 

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("Valluri Bhargav".equals(username) && "Secret@123".equals(password) ) {
			
			session.setAttribute("user", username);
			out.println("Welcome " + username);
			%>
			
        <h2>Welcome to Products Page </h2>
        <h3>Product Details</h3>
		<h4> Choose Your Favourite Product </h4>
		
        <p>Product Name: Nothing Phone 1</p>
        <p>Price: Rs.32999/-</p>
        <form action="Order.jsp" method='post'>
            <input type='submit' value='Buy'>
        </form>

        <p>Product Name: Nothing Ear 1</p>
        <p>Price: Rs.6999/-</p>
        <form action="Order.jsp" method='post'>
            <input type='submit' value='Buy'>
        </form>

        <p>Product Name: Nothing Stick</p>
        <p>Price: Rs.4999/-</p>
        <form action="Order.jsp" method='post'>
            <input type='submit' value='Buy'>
        </form>

        <p>Product Name: Nothing Smart Watch</p>
        <p>Price: Rs.3999/-</p>
        <form action="Order.jsp" method='post'>
            <input type='submit' value='Buy'>
        </form>
   
			<% 	
		}
		else{
			
			response.sendRedirect("Error.html");
		}

%>

</body>
</html>