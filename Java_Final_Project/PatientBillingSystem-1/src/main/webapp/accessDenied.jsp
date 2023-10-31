<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Access Denied</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        #container {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px #ccc;
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            margin-top: 20px;
        }

        h1 {
            color: #333;
        }

        p {
            font-size: 16px;
        }

        a {
            text-decoration: none;
        }

        button {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 18px;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div id="container">
        <h1>Access Denied</h1>
        <p>Sorry, you do not have permission to access this page.</p>
        <p>Please log in to access.</p><br>
        <a href="/PBS/login">
            <button>Login</button>
        </a>
    </div>
</body>
</html>

