<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Bill</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
        }

        form {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px #ccc;
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            margin-top: 20px;
        }

        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 18px;
            margin-top: 10px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        #totalAmount {
            background-color: #f2f2f2;
            border: 1px solid #ccc;
            border-radius: 3px;
            padding: 10px;
            font-size: 16px;
            width: 100%;
        }
    </style>
</head>
<body>
    <h1>Add Bill</h1>
    <form:form action="/bills/add" modelAttribute="bill" method="post">
        <label for="patient">Patient ID:</label>
        <form:input path="patient" required="true" /><br><br>
        
        <!-- Assuming that "calculateCharges" is a JavaScript function that calculates charges based on the selected patient -->
        <label for="billNumber">Bill Number:</label>
        <form:input path="billNumber" required="true" /><br><br>
        <label for="billDate">Bill Date:</label>
        <form:input path="billDate" required="true"  type="date"/><br><br>
        <label for="bedCharges">Bed Charges:</label>
        <form:input path="bedCharges" required="true"  /><br><br>
        
        <label for="wardCharges">Ward Charges:</label>
        <form:input path="wardCharges" required="true"  /><br><br>
        
        <label for="treatmentCharges">Treatment Charges:</label>
        <form:input path="treatmentCharges" required="true"  /><br><br>
        
        <%-- <label for="totalAmount">Total Amount:</label>
        <form:input path="totalAmount" required="true" readonly="true" /><br><br> --%>
        
        <input type="submit" value="Add Bill">
    </form:form>

    <!-- JavaScript function to calculate charges based on the patient ID -->
    <!-- <script>
        function calculateCharges() {
            var patientId = document.getElementById("patientId").value;
            // You can use AJAX to fetch patient data and calculate charges here
            // For simplicity, we assume charges are calculated in the client-side JavaScript
            var bedCharges = parseFloat(document.getElementById("bedCharges").value);
            var wardCharges = parseFloat(document.getElementById("wardCharges").value);
            var treatmentCharges = parseFloat(document.getElementById("treatmentCharges").value);
            var totalAmount = bedCharges + wardCharges + treatmentCharges;
            document.getElementById("totalAmount").value = totalAmount;
        }
    </script> -->
    
    <a href="<c:url value='/bills'/>">Back to Bill List</a>
</body>
</html>
