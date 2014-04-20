'use strict';

// Declare app level module which depends on filters, and services
angular.module('meehome-java-mail-webapp', ['meehome-java-mail-webapp.filters', 'meehome-java-mail-webapp.services', 'meehome-java-mail-webapp.directives', 'meehome-java-mail-webapp.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: '/meehome-java-mail-webapp/pages/diffusion/view.html', controller: 'ListeDiffusionControlleur'});
        $routeProvider.when('/:id', {templateUrl: '/meehome-java-mail-webapp/pages/diffusion/view.html', controller: 'ListeDiffusionControlleur'});
        $routeProvider.otherwise({redirectTo: '/:id'});
    }]);
