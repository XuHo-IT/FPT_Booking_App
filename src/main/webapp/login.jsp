<%-- 
    Document   : login
    Created on : Jun 4, 2024, 12:41:24 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <br><br>
    <jsp:include page="header.jsp" />
    <c:if test="${not empty failedMsg}">
        <h5 class="text-center text-danger">${failedMsg}</h5>
        <c:remove var="failedMsg" scope="session"/>
    </c:if>
    <c:if test="${not empty succMsg}">
        <h5 class="text-center text-success">${succMsg}</h5>
        <c:remove var="failedMsg" scope="session"/>
    </c:if>
    <form action="LoginController" method="POST">
        <label>Email:</label>
        <input type="text" name="email" required/><br><br>
        <label>Password:</label>
        <input type="password" name="password" required/><br><br>
        <input type="submit" value="Login" />
        <a href="register.jsp" target="#">Register</a>
    </form>
</html>
