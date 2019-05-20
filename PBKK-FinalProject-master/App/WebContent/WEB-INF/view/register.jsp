<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Register</title>
	<link href="<c:url value="/resources/css/Login/style2.css" />" rel="stylesheet">
</head>
<body>
	<div class="login-box">
    	<img alt="logo-spring" class="avatar" src="<c:url value="/resources/img/Login/avatar.png"/> ">
        <h1>ITS Cycle</h1>
        	<form action = "login" method = "post">
            	<p>NRP</p>
              	<input required="" type="text" name="nrp" placeholder="Enter Student Number">
            	<p>Name</p>
              	<input required="" type="text" name="name" placeholder="Enter Name">
              	<p>Phone Number</p>
              	<input required="" type="text" name="phonenumber" placeholder="Enter Phone Number">
              	<p>Address</p>
              	<input required="" type="text" name="address" placeholder="Enter Address">
              	<p>Departement</p>
              	<input required="" type="text" name="departement" placeholder="Enter Departement">
            	<p>Password</p>
              	<input required="" type="password" name="password1" placeholder="Enter Password">
              	<p>Re-enter Password</p>
              	<input required="" type="password" name="password2" placeholder="Enter Password">
              <input type="submit" name="reg_user" value="Register"> 
            </form>
            <p>
              Already a member? <a href="login">Sign in</a>
            </p>        
        </div>
</body>
</html>