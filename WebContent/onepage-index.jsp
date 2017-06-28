<%@page import="java.util.List"%>
<%@page import="com.Bid_Platform.model.*"%>
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
  <title>Vente aux enchères</title>

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
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|Pathway+Gothic+One|PT+Sans+Narrow:400+700|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <!-- Fonts END -->
  <!-- Global styles BEGIN -->
  <link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="assets/global/plugins/slider-revolution-slider/rs-plugin/css/settings.css" rel="stylesheet">
  <!-- Global styles END -->
  <!-- Page level plugin styles BEGIN -->
  <link href="assets/global/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
  <link href="assets/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.css" rel="stylesheet">
  <link href="assets/global/plugins/slider-revolution-slider/rs-plugin/css/settings.css" rel="stylesheet"> 
  <!-- Page level plugin styles END -->
  <!-- Theme styles BEGIN -->
  <link href="assets/global/css/components.css" rel="stylesheet">
  <link href="assets/frontend/onepage/css/style.css" rel="stylesheet">
  <link href="assets/frontend/onepage/css/style-responsive.css" rel="stylesheet">
  <link href="assets/frontend/onepage/css/themes/red.css" rel="stylesheet" id="style-color">
  <link href="assets/frontend/onepage/css/custom.css" rel="stylesheet">
  
  <link href="assets/global/css/components.css" rel="stylesheet">
   <link href="assets/frontend/layout/css/style.css" rel="stylesheet"> 
  <link href="assets/frontend/pages/css/style-revolution-slider.css" rel="stylesheet">
  <!-- metronic revo slider styles -->
  <link href="assets/frontend/layout/css/style-responsive.css" rel="stylesheet">
  <!-- Theme styles END -->
</head>
<!--DOC: menu-always-on-top class to the body element to set menu on top -->
<body class="corporate">
  
  <!-- Header BEGIN -->
  <div class="header header-mobi-ext" style="float:right">
    <div class="container" >
      <div class="row">
        <!-- Logo BEGIN 
        <div class="col-md-2 col-sm-2">
          <a class="scroll site-logo" href="#promo-block"><img src="assets/frontend/onepage/img/logo/red.png" alt="Metronic One Page"></a>
        </div>
        <!-- Logo END -->
        <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>
        <!-- Navigation BEGIN -->
        <div style="padding-top:20px " class="col-md-10 pull-right">
          <ul class="header-navigation">
            <li class="current"><a href="#promo-block">Home</a></li>
            <li><a href="#services">Services</a></li>
            <li><a href="#portfolio">Catégories</a></li>
            <li><a href="#benefits">How does it work</a></li>
            <li><a href="#contact">Contact</a></li>
              <li><a href="addProduct.jsp">Add product</a></li>
          </ul>
        </div>
        <!-- Navigation END -->
      </div>
    </div>
  </div>
  <!-- Header END -->
  
  
  <!-- Promo block BEGIN -->
  <div class="promo-block" id="promo-block">
    <div class="tp-banner-container">
      <div class="tp-banner" >
        <ul>
          <li data-transition="fade" data-slotamount="5" data-masterspeed="700" data-delay="9400" class="slider-item-1">
            <img src="assets/frontend/onepage/img/silder/slide1.jpg" alt="" data-bgfit="cover" style="opacity:0.4 !important;" data-bgposition="center center" data-bgrepeat="no-repeat">
            <div class="tp-caption large_text customin customout start"
              data-x="center"
              data-hoffset="0"
              data-y="center"
              data-voffset="60"
              data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
              data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
              data-speed="1000"
              data-start="500"
              data-easing="Back.easeInOut"
              data-endspeed="300">
              <div class="promo-like"><i class="fa fa-thumbs-up"></i></div>
              <div class="promo-like-text">
                <h2>What are you waiting for ?!</h2>
                <p>Start right now!<br> Bid Anywhere, Anytime.</p>
              </div>
            </div>
            <div class="tp-caption large_bold_white fade"
              data-x="center"
              data-y="center"
              data-voffset="-110"
              data-speed="300"
              data-start="1700"
              data-easing="Power4.easeOut"
              data-endspeed="500"
              data-endeasing="Power1.easeIn"
              data-captionhidden="off"
              style="z-index: 6">Welcome to our  <span>auctions</span> application
            </div>
          </li>
          <li data-transition="fadefromright" data-slotamount="5" data-masterspeed="700" data-delay="9400" class="slider-item-2">
            <img src="assets/frontend/onepage/img/silder/Slide2_bg.jpg" alt="slidebg2" data-bgfit="cover" data-bgposition="center center" data-bgrepeat="no-repeat">
            <div class="caption lft start"
              data-y="center"
              data-voffset="40"
              data-x="center"
              data-hoffset="-250"
              data-speed="600" 
              data-start="500" 
              data-easing="easeOutBack"><img src="assets/frontend/onepage/img/silder/Slide2_iphone_left.png" alt="">
            </div>
            <div class="caption lft start"
              data-y="center"
              data-voffset="40"
              data-x="center"
              data-hoffset="170"
              data-speed="600" 
              data-start="1200" 
              data-easing="easeOutBack"><img src="assets/frontend/onepage/img/silder/Slide2_iphone_right.png" alt="">
            </div>
            <div class="tp-caption large_bold_white fade"
              data-x="center"
              data-y="40"
              data-speed="300"
              data-start="1700"
              data-easing="Power4.easeOut"
              data-endspeed="500"
              data-endeasing="Power1.easeIn"
              data-captionhidden="off"
              style="z-index: 6">The World of<span> Auctions </span>at your Fingertips
            </div>
          </li>
          <li data-transition="fade" data-slotamount="5" data-masterspeed="700" data-delay="9400" class="slider-item-3">
            <img src="http://themepunch.com/revolution/wp-content/uploads/2014/05/video_woman_cover3.jpg"  alt="video_woman_cover3"  data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat">
            
            <div class="tp-caption tp-fade fadeout fullscreenvideo"
              data-x="0"
              data-y="0"
              data-speed="1000"
              data-start="1100"
              data-easing="Power4.easeOut"
              data-endspeed="1500"
              data-endeasing="Power4.easeIn"
              data-autoplay="true"
              data-autoplayonlyfirsttime="false"
              data-nextslideatend="true"
              data-forceCover="1"
              data-dottedoverlay="twoxtwo"
              data-aspectratio="16:9"
              data-forcerewind="on"
              style="z-index: 2">
              <video class="video-js vjs-default-skin" preload="none" width="100%" height="100%">
                  <source src='http://goodwebtheme.com/previewvideo/forest_edit.mp4' type='video/mp4'>
                <source src='http://goodwebtheme.com/previewvideo/forest_edit.webm' type='video/webm'>
                <source src='http://goodwebtheme.com/previewvideo/forest_edit.ogv' type='video/ogg'>
              
              </video>
            </div>
            <div class="tp-caption large_bold_white_25 customin customout tp-resizeme"
              data-x="center" data-hoffset="0"
              data-y="170"
              data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:5;scaleY:5;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
              data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
              data-speed="600"
              data-start="1400"
              data-easing="Power4.easeOut"
              data-endspeed="600"
              data-endeasing="Power0.easeIn"
              style="z-index: 3">Become a member , Browse products ,</br> Bid Anytime <br/>Pay Only if you WIN !
            </div>
            <div class="tp-caption medium_text_shadow customin customout tp-resizeme"
              data-x="center" data-hoffset="0"
              data-y="bottom" data-voffset="-140"
              data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:5;scaleY:5;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
              data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
              data-speed="600"
              data-start="1700"
              data-easing="Power4.easeOut"
              data-endspeed="600"
              data-endeasing="Power0.easeIn"
              style="z-index: 4">
            </div>
          </li>
        </ul>
      </div>
    </div>
  </div>
  <!-- Promo block END -->

  
  <div class="row recent-work margin-bottom-40">
          <div style="text-align:center" class="portfolio-block content content-center" id="">
             <div class="container" >
                <h2>Recent <strong>Products</strong></h2>
             <div class="row">
          </div> <br>
		  <div class="col-md-2"></div>
          <div class="col-md-8">
            <div class="owl-carousel owl-carousel3">
              
              <%
              	 Data_base_utils dbu=new Data_base_utils(); 
              	 List<Produit> lp=dbu.all_products();
                 for(int i=0;i<Math.min(4, lp.size());i++){
                	 String img=lp.get(i).getPhoto();
                	 %>
               <div class="recent-work-item">
                <em>
                  <img src="/Bid_Platform/ressources/<%= img %>" alt="Amazing Project" class="img-responsive">
                  <!--   <a href="portfolio-item.html"><i class="fa fa-link"></i></a> -->
                  <a href="produit.jsp?id=<%= lp.get(i).getSerie() %>" class="fancybox-button" title="Project Name #1" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong><%= lp.get(i).getNom() %></strong>
                  <b>Current bid :<%= lp.get(i).getPrix() %></b>
                </a>
              </div>
              <% 
                 }
              %>
            
            </div>       
          </div>
        </div>   
  
  
  
  

  
  <!-- Services block BEGIN -->
  <div class="services-block content content-center" id="services">
    <div class="container">
      <h2>Our <strong>services</strong></h2>
      <div class="row">
        <div class="col-md-3 col-sm-3 col-xs-12 item">
          <i class="fa fa-users"></i>
          <h3>Experts</h3>
          <p>A bunch of experts<br>ready to advise you.</p>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-12 item">
          <i class="fa fa-truck"></i>
          <h3>Shipping</h3>
          <p>Buy a product and<br> We take care of shipping.</p>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-12 item">
          <i class="fa fa-cubes"></i>
          <h3>Products</h3>
          <p>Here you'll find all kinds<br> of products</p>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-12 item">
          <i class="fa fa-lock"></i>
          <h3>Security</h3>
          <p>Safe payment methods.<br>
        </div>
      </div>
    </div>
  </div>
  <!-- Services block END -->

    
    <?php  include"test.html";?>
  

  
  <!-- Message block BEGIN -->
  <div class="message-block content content-center valign-center" id="message-block">
    <div class="valign-center-elem" style="padding-top:100px">
      <h2>The bidding has just begun.<strong>It will be fascinating to see how the battle develops</strong></h2>
    </div>
  </div>

  <!-- Portfolio block BEGIN -->
  <div class="portfolio-block content content-center" id="portfolio">
    <div class="container">
      <h2 class="margin-bottom-50">Our <strong>Categories</strong></h2>
    </div>
    <div class="row" >
	<div class="item col-md-2 col-sm-6 col-xs-12">
	</div>
      <div class="item col-md-2 col-sm-6 col-xs-12">
        <img src="assets/frontend/onepage/img/portfolio/2.jpg" alt="NAME" class="img-responsive">
        <a href="liste.jsp" class="zoom valign-center">
          <div class="valign-center-elem">
            <br><strong>Antiques</strong><br>
            <b>view products</b>
          </div>
        </a>
      </div>
      <div class="item col-md-2 col-sm-6 col-xs-12">
        <img src="assets/frontend/onepage/img/portfolio/6.jpg" alt="NAME" class="img-responsive">
        <a href="liste.jsp" class="zoom valign-center">
          <div class="valign-center-elem">
            <br><strong>Electronics</strong><br>
            <b>view products</b>
          </div>
        </a>
      </div>
      <div class="item col-md-2 col-sm-6 col-xs-12">
        <img src="assets/frontend/onepage/img/portfolio/8.jpg" alt="NAME" class="img-responsive">
        <a href="liste.jsp" class="zoom valign-center">
          <div class="valign-center-elem">
            <br><strong>Furniture</strong><br>
            <b>view products</b>
          </div>
        </a>
      </div>
      <div class="item col-md-2 col-sm-6 col-xs-12">
        <img src="assets/frontend/onepage/img/portfolio/3.jpg" alt="NAME" class="img-responsive">
        <a href="liste.jsp" class="zoom valign-center">
          <div class="valign-center-elem">
            <br><strong>Jewelry</strong><br>
            <b>view products</b>
          </div>
        </a>
      </div>
               
    </div>
  </div>
  <!-- Portfolio block END -->
  <!-- Choose us block BEGIN -->
  <div class="choose-us-block content text-center margin-bottom-40" id="benefits">
    <div class="container">
      <h2><strong></strong>4 Easy Steps To Start <strong>Bidding</strong></h2>
     <br>
      <div class="row">
        <div class="col-md-6 col-sm-6 col-xs-12 text-left">
          <img src="assets/frontend/onepage/img/choose-us.png" alt="Why to choose us" class="img-responsive">
        </div>
        <div class="col-md-6 col-sm-6 col-xs-12 text-left">
          <div class="panel-group" id="accordion1">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h5 class="panel-title">
                  <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion1" href="#accordion1_1">Become A Member</a>
                </h5>
              </div>
              <div id="accordion1_1" class="panel-collapse collapse in">
                <div class="panel-body">
                  <p>Join the community with the largest collection of storied objects.</p>
                </div>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h5 class="panel-title">
                  <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion1" href="#accordion1_2">Browse</a>
                </h5>
              </div>
              <div id="accordion1_2" class="panel-collapse collapse">
                <div class="panel-body">
                  <p>Discover new treasures with our robust search feature or explore by category.</p>
                </div>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h5 class="panel-title">
                  <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion1" href="#accordion1_3">Bid Anytime</a>
                </h5>
              </div>
              <div id="accordion1_3" class="panel-collapse collapse">
                <div class="panel-body">
                  <p>Enter an amount and place bids online anytime before an auction begins.</p>
                </div>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h5 class="panel-title">
                  <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion1" href="#accordion1_4">Pay Only If You Win</a>
                </h5>
              </div>
              <div id="accordion1_3" class="panel-collapse collapse">
                <div class="panel-body">
                  <p>Complete your transaction only after you bid and win. Items are then delivered to your door.</p>
                </div>
              </div>
               <!--</div>-->
            <!--</div>-->
           <!--</div>-->
        </div>
      </div>
    </div>
  </div>
  <!-- Choose us block END -->
  <!-- Checkout block BEGIN -->
  <div class="checkout-block content">
    <div class="container">
      <div class="row">
        <div class="col-md-10" >
          <h2 style="text-align:center">ENSA Marrakech</h2>
        </div>

      </div>
    </div>
  </div>
  <!-- Checkout block END -->
  
  <!-- Partners block BEGIN -->
  <div class="partners-block">
    <div class="container">
      <div class="row">
     
       <!-- <div class="col-md-2 col-sm-3 col-xs-6">
          <img src="assets/frontend/onepage/img/partners/logo_uca.jpg" alt="walmart" style="padding-left:500px">
        </div>
     -->
        <div class="col-md-2 col-sm-3 col-xs-6">
          <img src="assets/frontend/onepage/img/partners/logo.jpg" alt="ngreen" style="padding-left:300px">
        </div>
        
      </div>
    </div>
  </div>
  <!-- Partners block END -->
 
 
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
 
 
 
 
 
  <a href="#promo-block" class="go2top scroll"><i class="fa fa-arrow-up"></i></a>
  <!--[if lt IE 9]>
  <script src="assets/global/plugins/respond.min.js"></script>
  <![endif]-->
  <!-- Load JavaScripts at the bottom, because it will reduce page load time -->
  <!-- Core plugins BEGIN (For ALL pages) -->
  <script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
  <script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
  <script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
  <!-- Core plugins END (For ALL pages) -->
  <!-- BEGIN RevolutionSlider -->
  <script src="assets/global/plugins/slider-revolution-slider/rs-plugin/js/jquery.themepunch.revolution.min.js" type="text/javascript"></script>
  <script src="assets/global/plugins/slider-revolution-slider/rs-plugin/js/jquery.themepunch.tools.min.js" type="text/javascript"></script>
  <script src="assets/frontend/onepage/scripts/revo-ini.js" type="text/javascript"></script> 
  <!-- END RevolutionSlider -->
  <!-- Core plugins BEGIN (required only for current page) -->
  <script src="assets/global/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
  <script src="assets/global/plugins/jquery.easing.js"></script>
  <script src="assets/global/plugins/jquery.parallax.js"></script>
  <script src="assets/global/plugins/jquery.scrollTo.min.js"></script>
  <script src="assets/frontend/onepage/scripts/jquery.nav.js"></script>
  <!-- Core plugins END (required only for current page) -->
  <!-- Global js BEGIN -->
  <script src="assets/frontend/onepage/scripts/layout.js" type="text/javascript"></script>
  <script>
    $(document).ready(function() {
      Layout.init();
    });
  </script>
  <!-- Global js END -->
  
  
  
  <script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
    <script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
    <script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="assets/frontend/layout/scripts/back-to-top.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="assets/global/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
    <script src="assets/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->

    <!-- BEGIN RevolutionSlider -->
    <script src="assets/global/plugins/slider-revolution-slider/rs-plugin/js/jquery.themepunch.revolution.min.js" type="text/javascript"></script>
    <script src="assets/global/plugins/slider-revolution-slider/rs-plugin/js/jquery.themepunch.tools.min.js" type="text/javascript"></script>
    <script src="assets/frontend/pages/scripts/revo-slider-init.js" type="text/javascript"></script>
    <!-- END RevolutionSlider -->

    <script src="assets/frontend/layout/scripts/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initOWL();
            RevosliderInit.initRevoSlider();
            Layout.initTwitter();
            //Layout.initFixHeaderWithPreHeader(); /* Switch On Header Fixing (only if you have pre-header) */
            //Layout.initNavScrolling();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
  
</body>
</html>