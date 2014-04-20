'use strict';

/* Controllers */

var app = angular.module('meehome-java-mail-webapp.controllers', []);

//Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});

app.controller('ListeDiffusionControlleur', ['$scope', 'ListeDiffusionFactory', function ($scope, ListeDiffusionFactory) {
	ListeDiffusionFactory.get({}, function (ListeDiffusionFactory) {
        $scope.nom = ListeDiffusionFactory.nom;
        $scope.prenom = ListeDiffusionFactory.prenom;
        $scope.mail = ListeDiffusionFactory.mail;
    })
}]);
