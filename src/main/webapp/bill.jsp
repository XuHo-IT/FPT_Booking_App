<%-- 
    Document   : bill
    Created on : Jun 10, 2024, 2:38:15 PM
    Author     : HELLO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bill</title>
    </head>
  <body>
<%
    // Assuming you have a backend setup to fetch these details
    String userName = "John Doe";
    String billNumber = "12345";
    int numberOfPeople = 2;
    String resortAddress = "123 Beachside Avenue, Sunnyvale, CA";
    String checkInDate = "2024-06-01";
    String checkOutDate = "2024-06-05";
    double pricePerDay = 150.0;
    String roomType = "Deluxe Suite";
    int numberOfDays = 4; // Calculated based on check-in and check-out dates

    double totalAmount = numberOfDays * pricePerDay;
%>
<div class="bill-container">
    <div class="bill-header">
        <h1>Hotel Bill</h1>
        <p>Bill Number: <%= billNumber %></p>
    </div>
    <div class="bill-details">
        <h2>User Information</h2>
        <p>Name: <%= userName %></p>
        <p>Number of People: <%= numberOfPeople %></p>
        <h2>Resort Information</h2>
        <p>Address: <%= resortAddress %></p>
        <h2>Stay Details</h2>
        <table>
            <tr>
                <th>Check-In Date</th>
                <th>Check-Out Date</th>
                <th>Room Type</th>
                <th>Price per Day</th>
                <th>Number of Days</th>
                <th>Total Amount</th>
            </tr>
            <tr>
                <td><%= checkInDate %></td>
                <td><%= checkOutDate %></td>
                <td><%= roomType %></td>
                <td>$<%= String.format("%.2f", pricePerDay) %></td>
                <td><%= numberOfDays %></td>
                <td>$<%= String.format("%.2f", totalAmount) %></td>
            </tr>
        </table>
    </div>
    <div class="total-amount">
        <h2>Total Amount Due: $<%= String.format("%.2f", totalAmount) %></h2>
    </div>
</div>
</body>
</html>
