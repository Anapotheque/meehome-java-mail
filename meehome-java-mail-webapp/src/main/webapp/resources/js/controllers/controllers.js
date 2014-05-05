'use strict';

var app = angular.module('meehome-java-mail-webapp.controllers', []);

// Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});

app.controller('destinataireListeCtrl', ['$scope', 'destinatairesFactory', 'destinataireFactory', '$location',
	function ($scope, destinatairesFactory, destinataireFactory, $location) {
		
	$scope.edit = function (userId) {
		$location.path('/destinataire-edit/' + userId);
	};
    
	$scope.delete = function (userId) {
		destinataireFactory.delete({ id: userId });
		$scope.destinataires = destinatairesFactory.query();
	};
        
	$scope.create = function () {
		$location.path('/destinataire-create');
	};

	$scope.destinataires = destinatairesFactory.query();
}]);

app.controller('destinataireDetailCtrl', ['$scope', '$routeParams', 'destinataireFactory', '$location',
	function ($scope, $routeParams, destinataireFactory, $location) {

		$scope.update = function () {
			destinataireFactory.update($scope.user);
			$location.path('/destinataire-liste');
		};

		$scope.cancel = function () {
			$location.path('/destinataire-liste');
		};

		$scope.destinataire = destinataireFactory.show({id: $routeParams.id});
	}]);

 app.controller('destinataireCreateCtrl', ['$scope', 'destinatairesFactory', '$location',
	function ($scope, destinatairesFactory, $location) {
	 	
	 	$scope.cancel = function () {
			$location.path('/destinataire-liste');
		};
	 	
		$scope.create = function () {
			destinatairesFactory.create($scope.destinataire);
	 		$location.path('/destinataire-liste');
	 	}
	}]);