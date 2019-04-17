<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<link href="<c:url value="/resources/css/LoginPage/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="login-box">
    	<img alt="logo-spring" class="avatar" src="<c:url value="/resources/img/LoginPage/avatar.png"/> ">
        <h1>ITS Cycle</h1>
            <form action = "display" method = "post">
            	<p>Username</p>
            	<input required="" type="text" name="username" placeholder="Enter Username">
            	<p>Password</p>
            	<input required="" type="password" name="password" placeholder="Enter Password">
            	<input type="submit" name="submit" value="LOGIN"> 
            </form>
            <p>
              Don't have account? <a href="register">Create here</a>
            </p>
        </div>
</body>
</html>