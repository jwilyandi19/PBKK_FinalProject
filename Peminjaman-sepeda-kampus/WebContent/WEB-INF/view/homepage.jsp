<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
 
<!DOCTYPE html>
<html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>ITS CYCLE</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/iconfont.css" />" >
        <link rel="stylesheet" href="<c:url value="/resources/fonts/stylesheet.css" />" >
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/font-awesome.min.css" />" >
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/jquery.fancybox.css" />" >
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/bootstrap.min.css" />" >
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/magnific-popup.css" />" >
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/plugins.css" />" >

        <!--Theme custom css -->
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/style.css" />" >

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="<c:url value="/resources/css/Home/responsive.css" />" >

        <script src="<c:url value="/resources/js/Home/vendor/modernizr-2.8.3-respond-1.4.2.min.js" /> "></script>
    </head>
    <body data-spy="scroll" data-target=".navbar-collapse">
        
        <div class="culmn">
            <header id="main_menu" class="header navbar-fixed-top">            
                <div class="main_menu_bg">
                    <div class="container">
                        <div class="row">
                            <div class="nave_menu">
                                <nav class="navbar navbar-default">
                                    <div class="container-fluid">
                                        <!-- Brand and toggle get grouped for better mobile display -->
                                        <div class="navbar-header">
                                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                                <span class="sr-only">Toggle navigation</span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                            </button>
                                            <a class="navbar-brand" href="#home">
                                                <img src="<c:url value="/resources/img/Home/logo.png"/> ">
                                            </a>
                                        </div>

                                        <!-- Collect the nav links, forms, and other content for toggling -->

                                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                                            <ul class="nav navbar-nav navbar-right">
                                                <li><a href="#home">HOME</a></li>
                                                <li><a href="#service">TENTANG</a></li>
                                                <li><a href="#contact">DENAH</a></li>
                                            </ul>
                                        </div>

                                    </div>
                                </nav>
                            </div>	
                        </div>

                    </div>

                </div>
            </header> <!--End of header -->
			
            <section id="home" class="home">
                <div class="overlay">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 ">
                                <div class="main_home_slider text-center">
                                    <div class="single_home_slider">
                                        <div class="main_home wow fadeInUp" data-wow-duration="700ms">
                                            <h1>SELAMAT DATANG DI ITS CYCLE</h1>
                                            <p>Website peminjaman sepeda kampus di ITS</p>
                                            <div class="home_btn">
                                                <a href="" class="btn btn-primary">PINJAM SEKARANG</a>
                                            </div>

                                        </div>
                                    </div>
                                    <div class="single_home_slider">
                                        <div class="main_home wow fadeInUp" data-wow-duration="700ms">
                                            <h1>WELCOME TO ITS CYCLE</h1>
                                            <p>ITS's bicycle lending website</p>
                                            <div class="home_btn">
                                                <a href="" class="btn btn-primary">RENT NOW</a>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>


            <section id="service" class="service">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="main_service_area">
                                <div class="main_service_content">
                                    <div class="service_tabe">

                                        <!-- Tab panes -->
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane active" id="webdesign">
                                                <div class="single_service_tab">
                                                    <div class="row">
                                                        <div class="col-sm-6">
                                                            <div class="single_tab_content">
                                                                <div class="head_title">
                                                                    <h3>Apa itu ITS Cycle ?</h3>
                                                                    <div class="separator"></div>
                                                                </div>
                                                                <p>ITS Cycle adalah website yang membantu warga ITS khususnya mahasiswa dalam hal peminjaman sepeda kampus. Seperti yang kita ketahui, saat ini peminjaman sepeda kampus di ITS masih menggunakan sistem manual. ITS Cycle hadir agar memudahkan mahasiswa dalam kegiatan peminjaman sepeda kampus ini. Pengguna dapat mengetahui berapa jumlah sepeda yang tersedia pada setiap pos peminjaman dan tentunya pengguna dapat meiminjam sepeda secara online. </p>

                                                                
                                                            </div>
                                                        </div>

                                                        <div class="col-sm-6">
                                                            <div class="single_tab_img">
                                                              <img src="<c:url value="/resources/img/Home/stab1.png"/> " alt="">
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

            <section id="contact" class="contact">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="row">
                                <div class="contact_contant sections">
                                    <div class="col-sm-6">

                                        <div class="main_contact_info">
                                            <div class="head_title">
                                                <h3>DENAH</h3>
                                                <div class="separator"></div>
                                            </div>
                                            <div class="row">
                                                <div class="contact_info_content">
                                                    <div class="col-sm-12">
                                                        <div class="single_contact_info">
                                                            <div class="single_info_text">
                                                                <h3>POS 1</h3>
                                                                <p>Ketersedian Sepeda : none</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-12">
                                                        <div class="single_contact_info">
                                                            <div class="single_info_text">
                                                               <h3>POS 2</h3>
                                                                <p>Ketersedian Sepeda : none</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-12">
                                                        <div class="single_contact_info">
                                                            <div class="single_info_text">
                                                                <h3>POS 3</h3>
                                                                <p>Ketersedian Sepeda : none</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div> 

                                    <div class="col-sm-6">
                                        <img src="<c:url value="/resources/img/Home/denah.jpg"/> ">
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
            </section>  <!-- End of contact section -->


        <!-- START SCROLL TO TOP  -->

        <div class="scrollup">
            <a href="#"><i class="fa fa-chevron-up"></i></a>
        </div>
        <script src="<c:url value="/resources/js/Home/vendor/jquery-1.11.2.min.js" /> "></script>
        <script src="<c:url value="/resources/js/Home/vendor/bootstrap.min.js" /> "></script>
        <script src="<c:url value="/resources/js/Home/jquery.magnific-popup.js" /> "></script>
        <script src="<c:url value="/resources/js/Home/jquery.mixitup.min.js" /> "></script>
        <script src="<c:url value="/resources/js/Home/jquery.easing.1.3.js" /> "></script>
        <script src="<c:url value="/resources/js/Home/jquery.masonry.min.js" /> "></script>
        <script src="<c:url value="/resources/js/Home/jquery.fancybox.pack.js" /> "></script>

        <script src="<c:url value="/resources/js/Home/plugins.js" /> "></script>
        <script src="<c:url value="/resources/js/Home/main.js" /> "></script>

    </body>
</html>