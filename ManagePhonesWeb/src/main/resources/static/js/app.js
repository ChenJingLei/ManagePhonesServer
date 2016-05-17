'use strict';

/* App Module */

var phoneSystemApp = angular.module('phoneSystemApp', [
  'ngRoute',
  'phoneSystemControllers'
]);

phoneSystemApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/main', {
        templateUrl: 'partials/main.html',
        controller: 'PhoneListCtrl'
      }).
      when('/add', {
        templateUrl: 'partials/add.html',
        controller: 'PhoneDetailCtrl'
      }).
      when('/find', {
        templateUrl: 'partials/find.html',
        controller: 'PhoneListCtrl'
      }).
      otherwise({
        // redirectTo: '/main'
      });
  }]);
