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
    <body>
    	
    	<header>
    		<div class="container">  
            	<div class="row">	
    	    		<div class="col-md-12">
    	    			
    	    			<!-- HEADER DU SITE -->
    	    			<tiles:insertAttribute name="header" />
    	    			
    	    			<!-- CAROUSEL -->
						<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" >
							
							<div class="carousel-inner">
								<div class="item active">
							     	<h1>Gestion des e-mails</h1>
							     	<p>Vous pouvez gerer vos mail depuis cette inteface</p>
								</div>
							    
								<div class="item">
							  	  	<h1>Gestion des destinataires</h1>
								    <p>Vous pouvez gerer votre liste de diffusion depuis cette interface</p>
								</div>
							    
								<div class="item">
								  	<h1>Gestion des e-mails</h1>
								   	<p>Vous pouvez gerer vos mail depuis cette inteface</p>
								</div>
							    
							</div>
						</div>
					</div>
				</div>
			</div>
		</header>
			
		<section class="page">
    	
			<div class="container">
				
				<!-- BREADCRUMBS DU SITE -->
    	    	<div class="row">	
    	    		<div class="col-md-12">
    	    		  	<tiles:insertAttribute name="breadcrumbs" />
					</div>
    	    	</div>
            	
            	<div class="row">
			    	<tiles:insertAttribute name="content" />
<!-- 			    	 <div ng-view=""></div> -->
				</div>
				
			</div>
	   
	    	<!-- FOOTER DU SITE -->
	    	<footer>
	    		<div class="row">
	    			<div class="col-md-12">
	    				<tiles:insertAttribute name="footer" />
	    			</div>
	    		</div>
	    	</footer>
	    	
    	 </section>
	    	
        
        <!-- JAVASCRIPT -->
        <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        
<!--         <script src="angular-file-upload-shim.min.js"></script>  -->
        
        <script src="/meehome-java-mail-webapp/resources/angularJS/angular.min.js"></script>
        <script src="/meehome-java-mail-webapp/resources/angularJS/angular-resource.min.js"></script>
        <script src="/meehome-java-mail-webapp/resources/angularJS/angular-cookies.min.js"></script>
     	<script src="/meehome-java-mail-webapp/resources/angularJS/angular-sanitize.min.js"></script>
     	
<!--      	<script src="angular-file-upload.min.js"></script> -->
        
        <script src="/meehome-java-mail-webapp/resources/js/app.js"></script>
        <script src="/meehome-java-mail-webapp/resources/js/controllers/controllers.js"></script>
        <script src="/meehome-java-mail-webapp/resources/js/services/services.js"></script>
        
    </body>
</html>