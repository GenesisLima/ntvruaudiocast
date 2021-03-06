<!-- <?xml version="1.0" encoding="ISO-8859-1" ?> -->
<?xml version="1.0" encoding="UTF8" ?>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="mirchu team make this design. mirchu web and technology blog">
    <meta name="author" content="Waqas Hussain">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="resources/assets/icons/favicon.ico" rel="icon" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet" />
       <!-- Angular Material style sheet -->
 <link rel="stylesheet" href="resources/assets/css/angular-material.min.css">    
   
  
  
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
<body ng-app="starterApp" >
<!-- Preloader -->
<div id="preloader">
    <div id="status">&nbsp;</div>
</div>

<!-- Fixed navbar -->
<div class="navbar main-menu navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="#" title="Audiocast"><!--  <img src="<c:url value="resources/assets/images/logo.png" />" alt="logo" title="Audiocast" />--></a> </div>
    <div class="navbar-collapse collapse">
      <ul class="nav navbar-nav navbar-right" id="menu">
        <li><a data-scroll data-options="easing: easeOutQuart" href="#banner">Home</a></li>
<!--         <li><a data-scroll data-options="easing: easeOutQuart" href="#mywork">&Uacute;ltimos</a></li> -->       
        <li><a data-scroll data-options="easing: easeOutQuart" href="#novo_programa">Novo Programa</a></li>
<!--                 <li><a data-scroll data-options="easing: easeOutQuart" href="#novo_episodio">Novo Epis&oacute;dio</a></li>         -->
<!--         <li><a data-scroll data-options="easing: easeOutQuart" href="#skills">Skills</a></li> -->
        <li><a data-scroll data-options="easing: easeOutQuart" href="#contact">Contato</a></li>
         <li><a data-scroll data-options="easing: easeOutQuart" href="#about">Sobre</a></li>
      </ul>
    </div>
    <!--/.nav-collapse --> 
  </div>
</div>
<section id="banner" class="section">
	<div class="container">
    	<div class="intro">
    	<h1 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s"><i class="mdicon location-history"></i></h1>
        <h2 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="1.0s">I am <span>Audio</span>cast</h2>
        <p class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="1.2s">Sistema de distribui&ccedil;&atilde;o de conte&uacute;do de &aacute;udio para a Web</p>
        </div>
        <div class="clearfix"></div>
	</div>
    	 <!-- Carousel -->
</section>

<!-- <section id="mywork" class="section"> -->
<!-- 	<div class="container"> -->
<!--         <div class="row"> -->
<!--             <h2 class="heading wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">&Uacute;ltimos Epis&oacute;dios</h2> -->
<!--             <div class="portfolio-grid"> -->
<!--                 <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                     <a href="#" data-target="#portfolio1" class="thumbnail hcaption"> -->
<!--                       <img src="resources/assets/images/portfolio/portfolio1-thumb.jpg" alt="Portfolio" title="Desktop Apps" /> -->
<!--                     </a> -->
<!--                     <div id="portfolio1" class="hide-none hover-text"> -->
<!--                       <h5>Desktop Apps</h5> -->
<!--                       <p>UI/UX Design</p> -->
<!--                       	<a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio1.jpg" title="Desktop Apps"> -->
<!--                             <i class="mdicon fullscreen"></i> -->
<!--                        	</a> -->
<!--                     </div> -->
<!--                 </div> -->
                
<!--                 <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                     <a href="#" data-target="#portfolio2" class="thumbnail hcaption"> -->
<!--                       <img src="resources/assets/images/portfolio/portfolio2-thumb.jpg" alt="Portfolio" title="Desktop Apps" /> -->
<!--                     </a> -->
<!--                     <div id="portfolio2" class="hide-none hover-text"> -->
<!--                       <h5>Desktop Apps</h5> -->
<!--                       <p>UI/UX Design</p> -->
<!--                       	<a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio2.jpg" title="Desktop Apps"> -->
<!--                             <i class="mdicon fullscreen"></i> -->
<!--                        	</a> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                     <a href="#" data-target="#portfolio3" class="thumbnail hcaption"> -->
<!--                       <img src="resources/assets/images/portfolio/portfolio3-thumb.jpg" alt="Portfolio" title="Apps icons" /> -->
<!--                     </a> -->
<!--                     <div id="portfolio3" class="hide-none hover-text"> -->
<!--                       <h5>Apps icons</h5> -->
<!--                       <p>UI/UX Design</p> -->
<!--                       <a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio3.jpg" title="Apps icons"> -->
<!--                             <i class="mdicon fullscreen"></i> -->
<!--                        	</a> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                     <a href="#" data-target="#portfolio4" class="thumbnail hcaption"> -->
<!--                       <img src="resources/assets/images/portfolio/portfolio4-thumb.jpg" alt="Portfolio" title="Admin Themes" /> -->
<!--                     </a> -->
<!--                     <div id="portfolio4" class="hide-none hover-text"> -->
<!--                       <h5>Admin Themes</h5> -->
<!--                       <p>UI/UX Design</p> -->
<!--                       <a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio4.jpg" title="Admin Themes"> -->
<!--                             <i class="mdicon fullscreen"></i> -->
<!--                        	</a> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                     <a href="#" data-target="#portfolio5" class="thumbnail hcaption"> -->
<!--                       <img src="resources/assets/images/portfolio/portfolio5-thumb.jpg" alt="Portfolio" title="Mobile Apps" /> -->
<!--                     </a> -->
<!--                     <div id="portfolio5" class="hide-none hover-text"> -->
<!--                       <h5>Mobile Apps</h5> -->
<!--                       <p>UI/UX Design</p> -->
<!--                       <a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio5.jpg" title="Mobile Apps"> -->
<!--                             <i class="mdicon fullscreen"></i> -->
<!--                        	</a> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-md-4 col-sm-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                     <a href="#" data-target="#portfolio6" class="thumbnail hcaption"> -->
<!--                       <img src="resources/assets/images/portfolio/portfolio6-thumb.jpg" alt="Portfolio" title="Weather Apps" /> -->
<!--                     </a> -->
<!--                     <div id="portfolio6" class="hide-none hover-text"> -->
<!--                       <h5>Weather Apps</h5> -->
<!--                       <p>UI/UX Design</p> -->
<!--                       	<a class="nivo-light" data-lightbox-gallery="portfolio" href="resources/assets/images/portfolio/portfolio6.jpg" title="Weather Apps"> -->
<!--                             <i class="mdicon fullscreen"></i> -->
<!--                        	</a> -->
<!--                     </div> -->
<!--                 </div> -->
<!--               </div>       -->
<!--         </div> -->
<!--     </div> -->
<!-- </section> -->
<section id="novo_programa">
	<div class="container">
        <div class="row">
            <h2 class="heading wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Enviar Programa</h2>
            <div class="col-md-12">
            	<form role="form" id="contact-form" class="contact-form" action="/audiocast/upload/file" method="post" enctype="multipart/form-data">
                	<div class="row">
                	             	<div class="col-md-12 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                  		<div class="form-group">                           
                        <select class="form-control" id="sel1" name="name" id="name"  >
                        <option value="Opiniao Pernambuco" selected>Opini&atilde;o Pernambuco</option>
    
  </select>
  </div>
                  	</div>
                		
                  		</div>
                  	</div>
                		<div class="col-md-12 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                  		<div class="form-group">
                            <input type="text" class="form-control" name="topic" autocomplete="off" id="topic" placeholder="Tema">
                  		</div>
                  	</div>
     
<!--                     	<div class="col-md-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                   		<div class="form-group"> -->
<!--                             <input type="email" class="form-control" name="email" autocomplete="off" id="email" placeholder="E-mail"> -->
<!--                   		</div> -->
<!--                   	</div> -->
                  	</div>
                  	<div class="row">
                  		<div class="col-md-12 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                  		<div class="form-group">
                            <textarea class="form-control textarea" rows="3"  name="synopsis" id="synopsis" placeholder="Sinopse" style="height:154px"></textarea>
                  		</div>
                  	</div>
                    </div>
                     
                

                      	<div class="row">
                  		<div class="col-md-12 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">
                  		<div class="form-group">   
<!--                   		<div class="col-md-12 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                   		<div class="form-group"> -->
<!--                   		</div> -->
<!--                   	</div> -->
                            
                           <span style="margin-right:600px;"><md-datepicker  ng-model="myDate" md-placeholder="Enter date"></md-datepicker></span>
                           

                  		             <button type="submit"   class="btn main-btn pull-right wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">Salvar</button>   		                         
                           
                            <label class="btn main-btn pull-right wow bounceIn" style="margin-right:5px;" for="my-file-selector">
                   
<!--     <input id="my-file-selector" class="form-control " name="file" type="file" style="display:none; " data-wow-duration="1s" data-wow-delay="1s" onchange="$('#path').html($(this).val());" > -->
    <input id="my-file-selector" class="form-control " name="file" type="file" style="display:none; " data-wow-duration="1s" data-wow-delay="1s" >

    Upload
</label>
                 

                  		</div>
                  	</div>
                    </div>
     
                
                </form>
			</div>
            
        </div>
    </div>
</section>



<!-- <section id="parallax-1" class="bgParallax" data-speed="15"> -->
<!-- <div class="color-overlay"> -->
<!-- 	<div class="container"> -->
<!--     	<div class="row"> -->
<!--         	<div class="col-md-12 wow fadeInUp" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--     			<h2 class="heading">Founder of MaterialStrap!</h2> -->
<!--                 <a href="#" class="btn line-btn btn-lg">My Personal project!</a> -->
<!--     		</div> -->
<!--         </div> -->
<!--     </div> -->
<!-- </div>     -->
<!-- </section> -->
<!-- <section id="skills"> -->
<!-- 	<div class="container"> -->
<!--     		<h2 class="heading wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Skills</h2> -->
<!--             <div class="row"> -->
<!--             	<div class="col-md-6"> -->
<!--                 	<div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-success wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="0.8s" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%"> -->
<!--                             90% Adobe PhotoShop -->
<!--                           </div> -->
<!--                         </div> -->
<!--                         <div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-info wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.0s" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%"> -->
<!--                             70% jQuery -->
<!--                           </div> -->
<!--                         </div> -->
<!--                         <div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-warning wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.2s" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%"> -->
<!--                             50% PHP -->
<!--                           </div> -->
<!--                         </div> -->
<!--                         <div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-danger wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.4s" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%"> -->
<!--                             70% WordPress -->
<!--                           </div> -->
<!--                         </div> -->
<!--                 </div> -->
<!--                 <div class="col-md-6"> -->
<!--                 	<div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-success wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="0.9s" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%"> -->
<!--                             60% Angular Js -->
<!--                           </div> -->
<!--                         </div> -->
<!--                         <div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-info wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.1s" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%"> -->
<!--                             70% E-commerce -->
<!--                           </div> -->
<!--                         </div> -->
<!--                         <div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-warning wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.3s" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%"> -->
<!--                             90% Bootstrap -->
<!--                           </div> -->
<!--                         </div> -->
<!--                         <div class="progress"> -->
<!--                           <div class="progress-bar progress-bar-danger wow fadeInLeft" data-wow-duration="0.8s" data-wow-delay="1.5s" role="progressbar" aria-valuenow="86" aria-valuemin="0" aria-valuemax="100" style="width: 86%"> -->
<!--                             86% HTML5 -->
<!--                           </div> -->
<!--                         </div> -->
<!--                 </div> -->
<!--             </div> -->
<!--     </div> -->
<!-- </section>     -->



<!-- <section id="contact"> -->
<!-- 	<div class="container"> -->
<!--         <div class="row"> -->
<!--             <h2 class="heading wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Contato</h2> -->
<!--             <div class="col-md-12"> -->
<!--             	<form role="form" id="contact-form" class="contact-form"> -->
<!--                 	<div class="row"> -->
<!--                 		<div class="col-md-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                   		<div class="form-group"> -->
<!--                             <input type="text" class="form-control" name="Name" autocomplete="off" id="Name" placeholder="Name"> -->
<!--                   		</div> -->
<!--                   	</div> -->
<!--                     	<div class="col-md-6 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                   		<div class="form-group"> -->
<!--                             <input type="email" class="form-control" name="email" autocomplete="off" id="email" placeholder="E-mail"> -->
<!--                   		</div> -->
<!--                   	</div> -->
<!--                   	</div> -->
<!--                   	<div class="row"> -->
<!--                   		<div class="col-md-12 wow bounceIn" data-wow-duration="1s" data-wow-delay="1s"> -->
<!--                   		<div class="form-group"> -->
<!--                             <textarea class="form-control textarea" rows="3" name="Message" id="Message" placeholder="Message"></textarea> -->
<!--                   		</div> -->
<!--                   	</div> -->
<!--                     </div> -->
<!--                     <div class="row"> -->
<!--                     <div class="col-md-12"> -->
<!--                   <button type="submit" class="btn main-btn pull-right wow bounceIn" data-wow-duration="1s" data-wow-delay="1s">Send a message</button> -->
<!--                   </div> -->
<!--                   </div> -->
<!--                 </form> -->
<!-- 			</div> -->
            
<!--         </div> -->
<!--     </div> -->
<!-- </section> -->
<section id="about">
	<div class="sectionIcon wow bounceIn" data-wow-duration="0.8s" data-wow-delay="1s"><i class="fa fa-angle-down"></i></div>
	<div class="container">
        <div class="row">
            <div class="col-md-12 wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">
            	
            	<h2 class="heading">Sobre o Sistema</h2>
                <div class="col-md-6">
                <p class="text-left">
                Mussum Ipsum, cacilds vidis litro abertis. Todo mundo vê os porris que eu tomo, mas ninguém vê os tombis que eu levo! in elementis mé pra quem é amistosis quis leo. A ordem dos tratores não altera o pão duris Viva Forevis aptent taciti sociosqu ad litora torquent
          </p>
          </div>
          <div class="col-md-6">
                <p class="text-left">
Mussum Ipsum, cacilds vidis litro abertis. Si num tem leite então bota uma pinga aí cumpadi! Atirei o pau no gatis, per gatis num morreus. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Posuere libero varius. Nullam a nisl ut ante blandit hendrerit. Aenean sit amet nisi.          </p>
          </div>
            </div>
        </div>
    </div>
</section>
<section id="info">
	<div class="container">
		<div class="row">
        	<div class="col-md-4">
            		<h4 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">NTVRU</h4>
                    <address class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">
                  		<strong>N&uacute;cleo de TV e R&aacute;dio Universt&aacute;ria.</strong><br>
                  			Av. Norte, 64;<br>
                		</address>
                        <address class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">
                  <abbr title="Phone">Fone:</abbr> +55 81 38795438
                  <a href="mailto:#">genesis.lima@ufpe.com</a>
                </address>
            </div>
            <div class="col-md-4">
            	<h4 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Feedback</h4>
                <div class="clearfix"></div>
                <ul class="list-inline social">
<!--                           <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="0.8s"><a href="https://www.facebook.com/mirchu.net" class="fb"><i class="mdicon facebook"></i></a></li> -->
<!--                           <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.0s"><a href="https://twitter.com/mirchu_net" class="twt"><i class="mdicon twitter"></i></a></li> -->
                           <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.2s"><a href="#" class="be"><i class="material-icons">important_devices</i></a></li>
                           <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.4s"><a href="#" class="be"><i class="material-icons">g_translate</i></a></li> 
                           <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.4s"><a href="https://150.161.93.3/projects/ntvru-rod" target="_blank" class="be "> <i class="material-icons md-48">bug_report</i></a></li>
                           <li class="wow bounceIn" data-wow-duration="1.0s" data-wow-delay="1.4s"><a href="http://150.161.93.4/ntvruwiki/index.php/Audiocast" target="_blank" class="be "><i class="material-icons">explore</i></a></li>
                               
                        </ul>
            </div>
            <div class="col-md-4">
            	<h4 class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Sobre o Departamento.</h4>
                <p class="wow fadeInUp" data-wow-duration="0.8s" data-wow-delay="0.8s">Departamento de Tecnologia da informa&ccedil;&atilde;o e Comunica&ccedil;&atilde;o do N&uacute;cleo de TV e R&aacute;dio Universit&aacute;ria.
</p>
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
  <!-- Angular Material requires Angular.js Libraries -->
  <script src="resources/assets/js/angular.min.js"></script>
  <script src="resources/assets/js/angular-animate.min.js"></script>
  <script src="resources/assets/js/angular-aria.min.js"></script>
  <script src="resources/assets/js/angular-messages.min.js"></script>
  
  <!-- Angular Material Library -->
  <script src="resources/assets/js/angular-material.min.js">
  <script src="resources/assets/js/angular-route.js"></script>
  
  <!-- Moment.js -->
    <script src="resources/assets/js/moment-with-locales.js"></script>
        <script src="resources/assets/js/moment.js"></script>
    
  
   <script type="text/javascript">    
    /**
     * You must include the dependency on 'ngMaterial' 
     */
  var app = angular.module('starterApp', ['ngMaterial']);
    angular.module("myApp", ["ngRoute"]);
    app.config(function($mdDateLocaleProvider) {
    	  $mdDateLocaleProvider.formatDate = function(date) {
    		    return moment(date).format('DD-MM-YYYY');
    		  };
    		});
  
  </script>
</body>
</html>