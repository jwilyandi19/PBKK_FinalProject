<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<head>
<style type="text/css"  >
body{
  background: url(<c:url value="/resources/img/Home/homebg.jpg"/>) no-repeat;
  background-size: cover;
  z-index: -1;
}
.main-section {
  margin: 0 auto;
  margin-top: 80px;
  padding: 0;
}
.modal-content {
  background-color: #434e5a;
  padding: 0 18px;
  border-radius: 10px;
  border-width: 20px;
  float: right;
}


.form-group input{

}

.forgot {
  padding: 5px 0 25px;
}
.forgot a {
  color: blue;
  
}

img{
  height: 120px;
  width: 120px;

}

</style>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Form Peminjaman</title>

  <!-- Custom fonts for this template-->
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
      <div class="modal-content" style="border: 2px solid">

        <div class="row" >
          <div class="col-4" >
            <img src="<c:url value="/resources/img/Home/stab1.png"/> " alt="">
          </div>
          <div class="col-8 " style="margin-top: 20px">

            <h4><strong>FORM PEMINJAMAN SEPEDA</strong></h4>
            
          </div>
        </div>
          <p> Informasi Sepeda </p>
<!--           <form action="homepage"> -->
            <div class="form-group">
              <label>ID Sepeda</label>
              <input type="text" class="form-control"  value="SPD01" disabled>
            </div>
            <div class="form-group">
              <label>MODEL Sepeda</label>
              <input type="text" class="form-control" disabled value="evergreen biru"> 
            </div>
            <div class="form-group">
              <label>POS Peminjaman</label>
              <input type="text" class="form-control" value="01-Pintu Utama" disabled>
            </div>


            <a href="user-home" type="submit" class="btn btn-primary" style="margin-bottom: 20px">PINJAM</a>
        <!--   </form> -->
          <a href="user-home">Kembali</a>
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

</html>