'use strict';

angular.module('meehome-java-mail-webapp-accueil', [
	'meehome-java-mail-webapp-accueil.services',
	'meehome-java-mail-webapp-accueil.controllers'
	])
	.config(function ($routeProvider, $httpProvider) {
	    
		// Accueil
		$routeProvider.when('/accueil', {templateUrl: '/meehome-java-mail-webapp/pages/content/accueil/accueil.jsp'});
		
	    // Redirection accueil
	    $routeProvider.otherwise({redirectTo: '/accueil'});
	    
	    /* CORS... */
	    /* http://stackoverflow.com/questions/17289195/angularjs-post-data-to-external-rest-api */
	    $httpProvider.defaults.useXDomain = true;
	    delete $httpProvider.defaults.headers.common['X-Requested-With'];
	
	});

angular.module('meehome-java-mail-webapp-destinataires', [
	'meehome-java-mail-webapp-destinataires.services',
	'meehome-java-mail-webapp-destinataires.controllers'
	])
	.config(function ($routeProvider, $httpProvider) {
	    
		// Gestion des destinataires
		$routeProvider.when('/destinataire-liste', {templateUrl: '/meehome-java-mail-webapp/pages/content/destinataire/liste.jsp', controller: 'destinataireListeCtrl'});
	    $routeProvider.when('/destinataire-update/:id', {templateUrl: '/meehome-java-mail-webapp/pages/content/destinataire/create.jsp', controller: 'destinataireUpdateCtrl'});
	    $routeProvider.when('/destinataire-create', {templateUrl: '/meehome-java-mail-webapp/pages/content/destinataire/create.jsp', controller: 'destinataireCreateCtrl'});
	    $routeProvider.when('/destinataire-import', {templateUrl: '/meehome-java-mail-webapp/pages/content/destinataire/import.jsp', controller: 'destinataireImportCtrl'});
	    
	    // Redirection accueil
	    $routeProvider.otherwise({redirectTo: '/destinataire-liste'});
	    
	    /* CORS... */
	    /* http://stackoverflow.com/questions/17289195/angularjs-post-data-to-external-rest-api */
	    $httpProvider.defaults.useXDomain = true;
	    delete $httpProvider.defaults.headers.common['X-Requested-With'];
	
	});