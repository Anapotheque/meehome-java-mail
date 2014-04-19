'use strict';

/* Directives */


angular.module('meehome-java-mail-webapp.directives', []).
  directive('appVersion', ['version', function(version) {
    return function(scope, elm, attrs) {
      elm.text(version);
    };
  }]);
