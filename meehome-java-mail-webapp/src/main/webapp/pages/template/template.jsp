<!DOCTYPE HTML>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="fr">
    <head>
        
        <title>Webapp - Gestion mail</title>
		<meta charset="utf-8" />
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<!-- CSS -->
		<link rel="stylesheet" href="http://necolas.github.io/normalize.css/3.0.1/normalize.css" />
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css" />
		<link rel="stylesheet" href="/meehome-java-mail-webapp/resources/css/meehome-java-mail.css" />
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" >
        
    </head>
    <body ng-app="meehome-java-mail-webapp">
    	<div class="page">
	    	
	    	<div class="container">  
	    	
	    		<!-- HEADER DU SITE -->
	    	    <div class="row">	
		    	    <div class="col-md-12">
		    	    	<tiles:insertAttribute name="header" />
		    	    </div>
		    	</div>
	            
            	
            	
            	<!-- CAROUSEL -->
            	<div class="row">	
    	    		<div class="col-md-12">
		            	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
							  <!-- Indicators -->
							  <ol class="carousel-indicators">
							    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
							    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
							    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
							  </ol>
							
							  <!-- Wrapper for slides -->
							  <div class="carousel-inner">
							    <div class="item active">
							      <img src="/meehome-java-mail-webapp/resources/img/carousel/1.jpg" alt="ALT TEST">
							      <div class="carousel-caption">
							        TEST CONTENU
							      </div>
							    </div>
							    
							    <div class="item">
							      <img src="/meehome-java-mail-webapp/resources/img/carousel/2.jpg" alt="ALT TEST">
							      <div class="carousel-caption">
							        TEST CONTENU
							      </div>
							    </div>
							    
							    <div class="item">
							      <img src="/meehome-java-mail-webapp/resources/img/carousel/3.jpg" alt="ALT TEST">
							      <div class="carousel-caption">
							        TEST CONTENU
							      </div>
							    </div>
							    
							  </div>
							
							</div>
					</div>
				</div>
				
				<!-- BREADCRUMBS DU SITE -->
    	    	<div class="row">	
    	    		<div class="col-md-12">
    	    		  	<tiles:insertAttribute name="breadcrumbs" />
					</div>
    	    	</div>
            	
            	<div class="row">
<%-- 			    	<tiles:insertAttribute name="content" /> --%>
			    	
			    	 <div ng-view=""></div>
			    	
				</div>
				
			</div>
	    	
	    	<!-- FOOTER DU SITE -->
<!-- 	    	<footer> -->
<!-- 	    		<div class="row"> -->
<!-- 	    			<div class="col-md-12"> -->
<!-- 	    				<tiles:insertAttribute name="footer" /> -->
<!-- 	    			</div> -->
<!-- 	    		</div> -->
<!-- 	    	</footer> -->
        </div>
        
        <!-- JAVASCRIPT -->
        <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        
        <script src="/meehome-java-mail-webapp/resources/angularJS/angular.min.js"></script>
        <script src="/meehome-java-mail-webapp/resources/angularJS/angular-resource.min.js"></script>
        <script src="/meehome-java-mail-webapp/resources/angularJS/angular-cookies.min.js"></script>
     	<script src="/meehome-java-mail-webapp/resources/angularJS/angular-sanitize.min.js"></script>
        
        <script src="/meehome-java-mail-webapp/resources/js/app.js"></script>
        <script src="/meehome-java-mail-webapp/resources/js/controllers/controllers.js"></script>
        <script src="/meehome-java-mail-webapp/resources/js/services/services.js"></script>
        
    </body>
</html>