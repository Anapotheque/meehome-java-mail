'use strict';

/* Services */

var services = angular.module('meehome-java-mail-webapp.services', ['ngResource']);

services.factory('ListeDiffusionControlleur', ['$resource',
   function($resource){
	   return $resource('/meehome-java-mail-webapp/rest/listeDiffusionRestService/:id', {}, {
		   query: {method:'GET', params:{id:'id'}, isArray:false}
   });
}]);