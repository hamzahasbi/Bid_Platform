<%@page import="com.Bid_Platform.model.Produit"%>
<%@page import="java.util.List"%>
<%@page import="com.Bid_Platform.model.Data_base_utils"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.2.0
Version: 3.4
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest (the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->

<!-- Head BEGIN -->
<head>
  <meta charset="utf-8">
  <title>View Product</title>

  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

  <meta content="Metronic Shop UI description" name="description">
  <meta content="Metronic Shop UI keywords" name="keywords">
  <meta content="keenthemes" name="author">

  <meta property="og:site_name" content="-CUSTOMER VALUE-">
  <meta property="og:title" content="-CUSTOMER VALUE-">
  <meta property="og:description" content="-CUSTOMER VALUE-">
  <meta property="og:type" content="website">
  <meta property="og:image" content="-CUSTOMER VALUE-"><!-- link to image for socio -->
  <meta property="og:url" content="-CUSTOMER VALUE-">

  <link rel="shortcut icon" href="icone.png">

  <!-- Fonts START -->
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <!-- Fonts END -->

  <!-- Global styles START -->          
  <link href="assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Global styles END --> 
   
  <!-- Page level plugin styles START -->
  <link href="assets/global/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
  <link href="assets/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.css" rel="stylesheet">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="assets/global/css/components.css" rel="stylesheet">
  <link href="assets/frontend/layout/css/style.css" rel="stylesheet">
  <link href="assets/frontend/pages/css/portfolio.css" rel="stylesheet">
  <link href="assets/frontend/layout/css/style-responsive.css" rel="stylesheet">
  <link href="assets/frontend/layout/css/themes/red.css" rel="stylesheet" id="style-color">
  <link href="assets/frontend/layout/css/custom.css" rel="stylesheet">
  <!-- Theme styles END -->
  
  <link href="assets/global/css/components.css" rel="stylesheet">
  <link href="assets/frontend/onepage/css/style2.css" rel="stylesheet">
  <link href="assets/frontend/onepage/css/style-responsive.css" rel="stylesheet">
  <link href="assets/frontend/onepage/css/themes/red.css" rel="stylesheet" id="style-color">
  <link href="assets/frontend/onepage/css/custom.css" rel="stylesheet">
  <link href="assets/global/css/components.css" rel="stylesheet">
   <!-- <link href="assets/frontend/layout/css/style.css" rel="stylesheet"> -->
  <link href="assets/frontend/pages/css/style-revolution-slider.css" rel="stylesheet">
  <!-- metronic revo slider styles -->
  <link href="assets/frontend/layout/css/style-responsive.css" rel="stylesheet">
  <!-- Theme styles END -->
  
  
  
  
  
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">
   
  
    <!-- BEGIN HEADER -->
	<div style=" height:150px ; width:100% ; background-image:url('images.jpg')">
	</div>
	
    <div class="header">
      <div class="container">
                <a class="site-logo" href="onepage-index.jsp"><img src="assets/frontend/layout/img/logos/auction2.png" alt="Metronic FrontEnd"></a>

        <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>
        
      </div>
    </div>
    <!-- Header END -->

    <div class="main">
      <div class="container">
        <ul class="breadcrumb">
            <li><a href="onepage-index.jsp">Home</a></li>
            <li><a href="liste.jsp">Products</a></li>
            <li class="active">Info_product</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <%
                 Data_base_utils dbu=new Data_base_utils();
                List<Produit> lpp=dbu.products_by_serie(request.getParameter("id"));
 
                %>
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
            <h1>Bid on this product now !</h1>
            <div class="content-page">
              <div class="row margin-bottom-30">
                <!-- BEGIN CAROUSEL -->            
                <div class="col-md-5 front-carousel">
                  <div class="carousel slide" id="myCarousel">
                    <!-- Carousel items -->
                    <div class="carousel-inner">
                      <div class="item">
                        <img alt="" src="/Bid_Platform/ressources/<%= lpp.get(0).getPhoto() %>">
                     
                      </div>
                      <div class="item active">
                        <img alt="" src="/Bid_Platform/ressources/<%= lpp.get(0).getPhoto() %>">
                        
                      </div>
                      <div class="item">
                        <img alt="" src="/Bid_Platform/ressources/<%= lpp.get(0).getPhoto() %>">
                        
                      </div>
                    </div>
                    <!-- Carousel nav -->
                    <a data-slide="prev" href="#myCarousel" class="carousel-control left">
                      <i class="fa fa-angle-left"></i>
                    </a>
                    <a data-slide="next" href="#myCarousel" class="carousel-control right">
                      <i class="fa fa-angle-right"></i>
                    </a>
                  </div>                
                </div>
                <!-- END CAROUSEL -->                             

                <!-- BEGIN PORTFOLIO DESCRIPTION -->            
                <div class="col-md-7">
                
                  <h2><%= lpp.get(0).getNom() %></h2>
                  <p><%= lpp.get(0).getDescription() %>.</p>
                  <br>
                  <div class="row front-lists-v2 margin-bottom-15">
                    <div class="col-md-10">
                      <ul class="list-unstyled">
                        <li><i class="fa fa-dot-circle-o"></i> ID  &nbsp &nbsp <i class="fa fa-chevron-right"></i> &nbsp &nbsp <%= lpp.get(0).getSerie() %></li>
                        <li><i class="fa fa-th-list"></i> Category  &nbsp &nbsp  <i class="fa fa-chevron-right"></i> &nbsp &nbsp <%= lpp.get(0).getCategorie() %></li>
                        <li><i class="fa fa-usd"></i> Current Price &nbsp &nbsp  <i class="fa fa-chevron-right"></i> &nbsp &nbsp <%= lpp.get(0).getPrix() %> </li>
                        <li><i class="fa fa-user"></i> Owner's email &nbsp &nbsp  <i class="fa fa-chevron-right"></i> <%= lpp.get(0).getOwner().getEmail() %></li>
                      </ul>
                    </div>
                    
                  </div>
                  <a class="btn btn-primary" href="ProduitControl"><i class="fa fa-legal"></i>&nbsp Bid On This Product</a>
                </div>
                <!-- END PORTFOLIO DESCRIPTION -->            
              </div>

              
   
	
	
	
	
	 <!-- BEGIN PRE-FOOTER -->
  <div class="pre-footer" id="contact">
    <div class="container">
      <div class="row">
        <!-- BEGIN BOTTOM ABOUT BLOCK -->
        <div class="col-md-4 col-sm-6 pre-footer-col" style="padding-left:80px">
          <h2 style="color:orange">About us</h2>
          <p> This application is made as a J2EE project </p>
		  <p> <u>Made by :</u> </p>
		  Hamza Hasbi <br>
		  Rida Bouharras <br>
		  Elouassif Abdellah <br>
		  Badr Adnan
        </div>
        <!-- END BOTTOM ABOUT BLOCK -->
        
        <div class="col-md-4 col-sm-6 pre-footer-col" style="padding-left:200px">
          <!-- BEGIN BOTTOM CONTACTS -->
          
		  <h2 style="color:orange">Our Contacts</h2>
		  <address class="margin-bottom-40">
            Marrakech, Morocco<br>
            Email: <a href="mailto:info@metronic.com">elouassif.28@gmail.com</a><br>
            Email: <a href="mailto:info@metronic.com">b.rida5055@gmail.com</a><br>
			Email: <a href="mailto:info@metronic.com">hamza.hasbi@gmail.com</a><br>
			Email: <a href="mailto:info@metronic.com">adnan5badr@gmail.com</a><br>
			</address>
          <!-- END BOTTOM CONTACTS -->
  
        </div>
      </div>
    </div>
  </div>
	
    
    <!-- BEGIN FOOTER -->
    <div class="footer">
      <div class="container">
        <div class="row">
          <!-- BEGIN COPYRIGHT -->
          <div class="col-md-6 col-sm-6 padding-top-10">
             ALL Rights Reserved. <a href="javascript:;">Privacy Policy</a> | <a href="javascript:;">Terms of Service</a>
          </div>
          <!-- END COPYRIGHT -->
          <!-- BEGIN PAYMENTS -->
          <div class="col-md-6 col-sm-6">
            <ul class="social-footer list-unstyled list-inline pull-right">
              <li><a href="javascript:;"><i class="fa fa-facebook"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-google-plus"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-dribbble"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-linkedin"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-twitter"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-skype"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-github"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-youtube"></i></a></li>
              <li><a href="javascript:;"><i class="fa fa-dropbox"></i></a></li>
            </ul>  
          </div>
          <!-- END PAYMENTS -->
        </div>
      </div>
    </div>
    <!-- END FOOTER -->

    <!-- Load javascripts at bottom, this will reduce page load time -->
    <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
    <!--[if lt IE 9]>
    <script src="assets/global/plugins/respond.min.js"></script>
    <![endif]--> 
    <script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
    <script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
    <script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>      
    <script src="assets/frontend/layout/scripts/back-to-top.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="assets/global/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->

    <script src="assets/frontend/layout/scripts/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();    
            Layout.initTwitter();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>