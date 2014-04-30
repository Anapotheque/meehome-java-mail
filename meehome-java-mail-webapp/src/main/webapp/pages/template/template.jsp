<!DOCTYPE HTML>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <tiles:insertAttribute name="meta" />
    </head>
    <body>
    	<div class="wrapper">
    	    <header>
	            <tiles:insertAttribute name="header" />
	        </header>
	        <div class="element">
	            <section>
	            	<tiles:insertAttribute name="section" />
	            </section>
	        </div>
	        <footer>
	            <tiles:insertAttribute name="footer" />
	        </footer>
        </div>
        
        <!-- JAVASCRIPT -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
		<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
        
    </body>
</html>