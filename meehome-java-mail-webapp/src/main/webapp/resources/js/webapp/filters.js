'use strict';

/* Filters */

angular.module('meehome-java-mail-webapp.filters', []).
  filter('interpolate', ['version', function(version) {
    return function(text) {
      return String(text).replace(/\%VERSION\%/mg, version);
    }
  }]);
