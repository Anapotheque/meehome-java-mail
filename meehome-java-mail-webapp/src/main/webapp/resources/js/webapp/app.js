'use strict';

// Declare app level module which depends on filters, and services
angular.module('meehome-java-mail-webapp', ['meehome-java-mail-webapp.filters', 'meehome-java-mail-webapp.services', 'meehome-java-mail-webapp.directives', 'meehome-java-mail-webapp.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: '/meehome-java-mail-webapp/view/communes.jsp', controller: 'CommunesControlleur'});
        $routeProvider.when('/:commune', {templateUrl: '/meehome-java-mail-webapp/view/communes.jsp', controller: 'CommunesControlleur'});
        $routeProvider.otherwise({redirectTo: '/:commune'});
    }]);
