<!DOCTYPE HTML>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="fr">
    <head>
        <tiles:insertAttribute name="meta" />
    </head>
    <body>
    	<div class="page">
	    	<div class="container">
	    	
	    		<!-- HEADER DU SITE -->
	    	    <header><tiles:insertAttribute name="header" /></header>
	    	    
	    	    <!-- BREADCRUMBS DU SITE -->
	    	    <nav><tiles:insertAttribute name="breadcrumbs" /></nav>
	            
	            <!-- CONTENU DU SITE -->
	            <section>
	            	
	            	<div class="panel panel-default">
						<div class="panel-heading"><tiles:getAsString name="content-header" /></div>
						<div class="panel-body">
				    		<tiles:insertAttribute name="content" />
				    	</div>
					</div>
					
	            </section>
			</div>
	    
	    	<!-- FOOTER DU SITE -->
	    	<footer><tiles:insertAttribute name="footer" /></footer>
        </div>
        
        <!-- JAVASCRIPT -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
		<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
        
    </body>
</html>