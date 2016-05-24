<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="mirchu team make this design. mirchu web and technology blog">
    <meta name="author" content="Waqas Hussain">
    <link href="resources/assets/icons/favicon.ico" rel="icon" />
    
    <title>NTVRU - Audiocast</title>
    
    <!-- Bootstrap core CSS -->
    
<!--     <link href="assets/css/bootstrap.min.css" rel="stylesheet"> -->
       <link href="resources/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900' rel='stylesheet' type='text/css' />
    <!-- Custom styles for this template -->
<%--     <link href="<c:url value="assets/MDicons/css/MDicon.min.css" />" rel="stylesheet"> --%>
    <link href="resources/assets/MDicons/css/MDicon.min.css" rel="stylesheet" />
<!--     <link rel="stylesheet" href="assets/css/animate.css"> -->
    <link href="resources/assets/css/animate.css"  rel="stylesheet">
    <link rel="stylesheet" href="resources/assets/css/themes/default/default-nivo-theme.css" type="text/css">
    <link rel="stylesheet" href="resources/assets/css/nivo-lightbox.css" type="text/css">
    <link href="resources/assets/css/style.min.css" rel="stylesheet">
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
          <script src="assets/js/html5shiv.min.js"></script>
          <script src="assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
<body>
<!-- Preloader -->
<div id="preloader">
    <div id="status">&nbsp;</div>
</div>

<!-- Fixed navbar -->
<div class="navbar main-menu navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="" title="Audiocast"><img src="<c:url value="resources/assets/images/logo.png" />" alt="logo" title="Audiocast" /></a> </div>
    <div class="navbar-collapse collapse">
      <ul class="nav navbar-nav navbar-right" id="menu">
        <li><a data-scroll data-options="easing: easeOutQuart" href="#banner">Home</a></li>
        <li><a data-scroll data-options="easing: easeOutQuart" href="#mywork">My Work</a></li>
        <li><a data-scroll data-options="easing: easeOutQuart" href="#about">About</a></li>
        <li><a data-scroll data-options="easing: easeOutQuart" href="#skills">Skills</a></li>
        <li><a data-scroll data-options="easing: easeOutQuart" href="#contact">Contact</a></li>
      </ul>
    </div>
    <!--/.nav-collapse --> 
  </div>
</div>
<section id="banner" class="section">
	<div class="container">
    	<div class="intro">
    	<h1 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s"><i class="mdicon location-history"></i></h1>
        <h2 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="1.0s">I am <span>Material</span>Strap</h2>
        <p class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="1.2s">Front End Developer - Wordpress - Angular</p>
        </div>
        <div class="clearfix"></div>
	</div>
    	 <!-- Carousel -->
</section>

<section id="mywork" class="section">
	<div class="container">
        <div class="row">
            <h2 class="heading wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">My Work</h2>
            <div class="portfolio-grid">
                <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                    <a href="#" data-target="#portfolio1" class="thumbnail hcaption">
                      <img src="resources/assets/images/portfolio/portfolio1-thumb.jpg" alt="Portfolio" title="Desktop Apps" />
                    </a>
                    <div id="portfolio1" class="hide-none hover-text">
                      <h5>Desktop Apps</h5>
                      <p>UI/UX Design</p>
                      	<a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio1.jpg" title="Desktop Apps">
                            <i class="mdicon fullscreen"></i>
                       	</a>
                    </div>
                </div>
                
                <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                    <a href="#" data-target="#portfolio2" class="thumbnail hcaption">
                      <img src="resources/assets/images/portfolio/portfolio2-thumb.jpg" alt="Portfolio" title="Desktop Apps" />
                    </a>
                    <div id="portfolio2" class="hide-none hover-text">
                      <h5>Desktop Apps</h5>
                      <p>UI/UX Design</p>
                      	<a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio2.jpg" title="Desktop Apps">
                            <i class="mdicon fullscreen"></i>
                       	</a>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                    <a href="#" data-target="#portfolio3" class="thumbnail hcaption">
                      <img src="resources/assets/images/portfolio/portfolio3-thumb.jpg" alt="Portfolio" title="Apps icons" />
                    </a>
                    <div id="portfolio3" class="hide-none hover-text">
                      <h5>Apps icons</h5>
                      <p>UI/UX Design</p>
                      <a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio3.jpg" title="Apps icons">
                            <i class="mdicon fullscreen"></i>
                       	</a>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                    <a href="#" data-target="#portfolio4" class="thumbnail hcaption">
                      <img src="resources/assets/images/portfolio/portfolio4-thumb.jpg" alt="Portfolio" title="Admin Themes" />
                    </a>
                    <div id="portfolio4" class="hide-none hover-text">
                      <h5>Admin Themes</h5>
                      <p>UI/UX Design</p>
                      <a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio4.jpg" title="Admin Themes">
                            <i class="mdicon fullscreen"></i>
                       	</a>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                    <a href="#" data-target="#portfolio5" class="thumbnail hcaption">
                      <img src="resources/assets/images/portfolio/portfolio5-thumb.jpg" alt="Portfolio" title="Mobile Apps" />
                    </a>
                    <div id="portfolio5" class="hide-none hover-text">
                      <h5>Mobile Apps</h5>
                      <p>UI/UX Design</p>
                      <a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio5.jpg" title="Mobile Apps">
                            <i class="mdicon fullscreen"></i>
                       	</a>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                    <a href="#" data-target="#portfolio6" class="thumbnail hcaption">
                      <img src="resources/assets/images/portfolio/portfolio6-thumb.jpg" alt="Portfolio" title="Weather Apps" />
                    </a>
                    <div id="portfolio6" class="hide-none hover-text">
                      <h5>Weather Apps</h5>
                      <p>UI/UX Design</p>
                      	<a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio6.jpg" title="Weather Apps">
                            <i class="mdicon fullscreen"></i>
                       	</a>
                    </div>
                </div>
              </div>      
        </div>
    </div>
</section>
<section id="about">
	<div class="sectionIcon wow bounceIn" data-wow-duration="0.8s" data-wow-delay="1s"><i class="fa fa-angle-down"></i></div>
	<div class="container">
        <div class="row">
            <div class="col-md-12 wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">
            	
            	<h2 class="heading">About us</h2>
                <div class="col-md-6">
                <p class="text-left">
            I'm MaterialStrap, a New York based freelance web developer and designer. I passionately move pixels and lines of code to craft clean, responsive, and user-friendly websites. My current weapons of choice are PHP CodeIgniter, Ruby on Rails, jQuery, and MySQL.
            Being both an engineer and designer, I help clients bring their ideas into reality. <a href="#">Contact me</a> today and I would love to hear about your business
          </p>
          </div>
          <div class="col-md-6">
                <p class="text-left">
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
          </p>
          </div>
            </div>
        </div>
    </div>
</section>
<section id="parallax-1" class="bgParallax" data-speed="15">
<div class="color-overlay">
	<div class="container">
    	<div class="row">
        	<div class="col-md-12 wow fadeInUp" data-wow-duration="1s" data-wow-delay="1s">
    			<h2 class="heading">Founder of MaterialStrap!</h2>
                <a href="#" class="btn line-btn btn-lg">My Personal project!</a>
    		</div>
        </div>
    </div>
</div>    
</section>
<section id="skills">
	<div class="container">
    		<h2 class="heading wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Skills</h2>
            <div class="row">
            	<div class="col-md-6">
                	<div class="progress">
                          <div class="progress-bar progress-bar-success wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="0.8s" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%">
                            90% Adobe PhotoShop
                          </div>
                        </div>
                        <div class="progress">
                          <div class="progress-bar progress-bar-info wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.0s" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                            70% jQuery
                          </div>
                        </div>
                        <div class="progress">
                          <div class="progress-bar progress-bar-warning wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.2s" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%">
                            50% PHP
                          </div>
                        </div>
                        <div class="progress">
                          <div class="progress-bar progress-bar-danger wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.4s" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                            70% WordPress
                          </div>
                        </div>
                </div>
                <div class="col-md-6">
                	<div class="progress">
                          <div class="progress-bar progress-bar-success wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="0.9s" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                            60% Angular Js
                          </div>
                        </div>
                        <div class="progress">
                          <div class="progress-bar progress-bar-info wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.1s" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                            70% E-commerce
                          </div>
                        </div>
                        <div class="progress">
                          <div class="progress-bar progress-bar-warning wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.3s" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%">
                            90% Bootstrap
                          </div>
                        </div>
                        <div class="progress">
                          <div class="progress-bar progress-bar-danger wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.5s" role="progressbar" aria-valuenow="86" aria-valuemin="0" aria-valuemax="100" style="width: 86%">
                            86% HTML5
                          </div>
                        </div>
                </div>
            </div>
    </div>
</section>    



<section id="contact">
	<div class="container">
        <div class="row">
            <h2 class="heading wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Contact</h2>
            <div class="col-md-12">
            	<form role="form" id="contact-form" class="contact-form">
                	<div class="row">
                		<div class="col-md-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                  		<div class="form-group">
                            <input type="text" class="form-control" name="Name" autocomplete="off" id="Name" placeholder="Name">
                  		</div>
                  	</div>
                    	<div class="col-md-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                  		<div class="form-group">
                            <input type="email" class="form-control" name="email" autocomplete="off" id="email" placeholder="E-mail">
                  		</div>
                  	</div>
                  	</div>
                  	<div class="row">
                  		<div class="col-md-12 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                  		<div class="form-group">
                            <textarea class="form-control textarea" rows="3" name="Message" id="Message" placeholder="Message"></textarea>
                  		</div>
                  	</div>
                    </div>
                    <div class="row">
                    <div class="col-md-12">
                  <button type="submit" class="btn main-btn pull-right wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">Send a message</button>
                  </div>
                  </div>
                </form>
			</div>
            
        </div>
    </div>
</section>
<section id="info">
	<div class="container">
		<div class="row">
        	<div class="col-md-4">
            		<h4 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Location</h4>
                    <address class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">
                  		<strong>The MaterialStrap Inc.</strong><br>
                  			48800 Main Road, Chakwal<br>
                		</address>
                        <address class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">
                  <abbr title="Phone">P:</abbr> (92) 332-5903076
                  <a href="mailto:#">waqashussain91@gmail.com</a>
                </address>
            </div>
            <div class="col-md-4">
            	<h4 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Social Circle</h4>
                <div class="clearfix"></div>
                <ul class="list-inline social">
                          <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="0.8s"><a href="https://www.facebook.com/mirchu.net" class="fb"><i class="mdicon facebook"></i></a></li>
                          <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.0s"><a href="https://twitter.com/mirchu_net" class="twt"><i class="mdicon twitter"></i></a></li>
                          <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.2s"><a href="https://plus.google.com/+MirchuNet" class="dr"><i class="mdicon google-plus-fill"></i></a></li>
                          <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.4s"><a href="#" class="be"><i class="mdicon linkedin"></i></a></li>
                        </ul>
            </div>
            <div class="col-md-4">
            	<h4 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">About Freelancer</h4>
                <p class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">I'm Freelancer, a New York based freelance web developer and designer. I passionately move pixels and lines of code to craft clean, responsive, and user-friendly websites.</p>
            </div>
        </div>
    </div>
</section>
<a href="#" class="back-to-top"><i class="mdicon up"></i></a>

    <!-- Bootstrap core JavaScript
        ================================================== --> 
    <!-- Placed at the end of the document so the pages load faster --> 
    <script src="resources/assets/js/jquery.min.js"></script> 
    <script src="resources/assets/js/bootstrap.min.js"></script>
    <!-- smooth scrolling -->
    <script src="resources/assets/js/smooth-scroll.js"></script>
    
    <!-- animation scrolling -->
    <script src="resources/assets/js/wow.min.js"></script>
    
    <!-- hover captions -->
    <script src="resources/assets/js/jquery.hcaptions.js"></script>
    
    <!-- hover detail page -->
    <script src="resources/assets/js/nivo-lightbox.min.js"></script>
    
    <!-- Form Validation -->
    <script src="resources/assets/js/bootstrapValidator.min.js"></script>
    
    <!-- animation scrolling -->
    <script src="resources/assets/js/app.min.js"></script>
</body>
</html>