<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Custom CSS for Unique Styling -->
    <style>
        body {
            background-color: #f5f5f5;
        }
        .dashboard-container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }
        .dashboard-title {
            font-size: 28px;
            color: #333;
        }
        .dashboard-subtitle {
            font-size: 18px;
            color: #555;
        }
        .custom-button {
            background-color: #ff5722;
            color: #fff;
            border: none;
        }
        .custom-button:hover {
            background-color: #e64a19;
        }
    </style>
</head>
<body>
    <div class="dashboard-container">
         <h1 class="dashboard-title">DOCTOR DASHBOARD</h1>
        

        <!-- Bootstrap Buttons for Other Actions -->
  

        <div class="row mt-3">
            <div class="col-md-6">
                <a href="/patient/list" class="btn btn-info btn-block">View Patients</a>
            </div>
        </div>

        <!-- Logout Button with Bootstrap -->
        <a href="/PBS/login" class="btn btn-danger mt-3">Logout</a>
    </div>

    <!-- Include Bootstrap JS and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.min.js"></script>
</body>
</html>
