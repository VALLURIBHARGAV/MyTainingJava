<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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
            margin: 10px 0;
            padding: 10px 20px;
            border-radius: 5px;
        }
        .custom-button:hover {
            background-color: #e64a19;
        }
    </style>
</head>
<body>
    <div class="dashboard-container">
        <h1 class="dashboard-title">ADMIN DASHBOARD</h1>
        <!-- Add New User Button with Custom Styling -->
        <a href="/admin/dashboard/addUser" class="custom-button">Add New User</a>

        <!-- Custom Styling for Other Actions -->
        <div class="row">
            <div class="col-md-6">
                <a href="/adddoc" class="custom-button">Add Doctor</a>
            </div>
            <div class="col-md-6">
                <a href="/listdoc" class="custom-button">View Doctors</a>
            </div>
            <div class="col-md-6">
                <a href="/patient/addPatient" class="custom-button">Add Patient</a>
            </div>
            <div class="col-md-6">
                <a href="/patient/list" class="custom-button">View Patients</a>
            </div>
            <div class="col-md-6">
                <a href="/addBed" class="custom-button">Add Bed</a>
            </div>
            <div class="col-md-6">
                <a href="/bedList" class="custom-button">View Beds</a>
            </div>
            <div class="col-md-6">
                <a href="/bills/add" class="custom-button">Add Bill</a>
            </div>
            <div class="col-md-6">
                <a href="/bills/generateBill" class="custom-button">Generate Bill</a>
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
