<%-- 
    Document   : login
    Created on : Jun 4, 2024, 12:41:24 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <br><br>
            <jsp:include page="header.jsp" />

    <form action="InsertController" method="POST">
        <label>Name:</label>
        <input type="text" name="name" required/><br><br>
        <label>Password:</label>
        <input type="password" name="password" required/><br><br>
        <input type="submit" value="Login" />
        <a href="register.jsp" target="#">Register</a>
    </form>
</html>
