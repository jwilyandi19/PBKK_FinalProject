<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">

<head>
<style type="text/css" >
  body{
    background: url(<c:url value="/resources/img/Home/homebg.jpg"/>) no-repeat;
    background-size: cover;
    z-index: -1;
  
  } 

	.main-section {
	  margin: 0 auto;
	  margin-top: 130px;
	  padding: 0;
	}
	.modal-content {
	  background-color: #434e5a;
	  opacity: .85;
	  padding: 0 18px;
	  border-radius: 10px;
	  float: right;
	}
	.user-img img {
	  height: 200px;
	  width: 200px;
	}
	.user-img {
	  margin-top:-100px;
	}
	
	.btn-success {
	  background-color: #1c6288;
	  font-size: 19px;
	  border-radius: 5px;
	  padding: 7px 14px;
	  border: 1px solid #daf1ff;
	}
	.btn-success:hover {
	  background-color: #13445e;
	  border: 1px solid #daf1ff;
	}
	
	.form-group input{
	  opacity: 1;
	}
	
	.forgot {
	  padding: 5px 0 25px;
	}
	.forgot a {
	  color: blue;
	  opacity: 1;
	}

</style>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>ITS CYCLE</title>

  <!-- Custom fonts for this template-->
  <link rel="stylesheet" href="<c:url value="/resources/css/Home/plugins.css" />" >
  <link href="<c:url value="/resources/vendor/fontawesome-free/css/all.min.css" />" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<c:url value="/resources/css/sb-admin-2.min.css"/>" rel="stylesheet">

</head>

<body>
	
  <div class="container">

    <!-- Outer Row -->
    <div class="modal-dialog text-center">
    <div class="col-sm-9 main-section">
      <div class="modal-content">

        <div class="col-12 user-img">
          <img src="<c:url value="/resources/img/Home/stab1.png"/>">
        </div>

        <div class="col-12 form-input">

          <h3>SELAMAT DATANG DI <strong>ITS-CYCLE</strong></h3>
          <p>Login Admin</p>
          <form:form action="petugas-check" method="post" modelAttribute="user">
            <div class="form-group">
            	<label>Username</label>
              	<input class="form-control" type="text" name="username" placeholder="Enter Username">
            </div>
            <div class="form-group">
            	<label>Password</label>
              	<input class="form-control" type="password" name="password" placeholder="Enter Password">    		
            </div>
            <button type="submit" class="btn btn-success" style="margin: 10px">Login</button>
          </form:form>
          
	
        </div>

  

      </div>
    </div>
  </div>


  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="<c:url value="/resources/vendor/jquery/jquery.min.js"/>"></script>
  <script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>

  <!-- Core plugin JavaScript-->
  <script src="<c:url value="/resources/vendor/jquery-easing/jquery.easing.min.js"/>"></script>

  <!-- Custom scripts for all pages-->
  <script src="<c:url value="/resources//js/sb-admin-2.min.js" />"></script>

</body>

   
</div>



</html>
