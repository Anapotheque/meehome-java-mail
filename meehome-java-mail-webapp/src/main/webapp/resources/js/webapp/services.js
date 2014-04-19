'use strict';

/* Services */

var services = angular.module('meehome-java-mail-webapp.services', ['ngResource']);

services.factory('CommuneFactory', ['$resource',
   function($resource){
	   return $resource('/meehome-java-mail-webapp/rest/communes/:commune', {}, {
		   query: {method:'GET', params:{commune:'commune'}, isArray:false}
   });
}]);