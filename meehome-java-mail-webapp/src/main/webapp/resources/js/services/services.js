'use strict';

var services = angular.module('meehome-java-mail-webapp-destinataires.services', ['ngResource']);

services.factory('destinatairesFactory', function ($resource) {
    return $resource('/meehome-java-mail-webapp/rest/destinataireRestService', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('destinataireFactory', function ($resource) {
    return $resource('/meehome-java-mail-webapp/rest/destinataireRestService/:id', {}, {
        show: { method: 'GET' },
        update: { method: 'PUT', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});