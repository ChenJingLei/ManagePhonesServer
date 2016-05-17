'use strict';

/* Controllers */

var phoneSystemControllers = angular.module('phoneSystemControllers', []);

phoneSystemControllers.controller('PhoneListCtrl', ['$scope', '$http',
    function ($scope, $http) {
        $http.get('/phones/getAll').success(function (data) {
            $scope.phones = data;
        });

        $scope.deleteById = function (id) {
            $http.get('/phones/deleteById/' + id).success(function (data) {
                if (data == "true") {
                    alert("删除成功");
                } else {
                    alert("删除失败");
                }
            });
        };

        $scope.setPhone = function (phone) {
            $scope.phone = phone;
        }

        $scope.updateOne = function (phone) {
            $http({
                url: "/phones/updateOne",
                method: "post",
                data: phone
            }).success(function (data) {
                $('#updateModal').modal('toggle');
                if (data  == "true") {
                    alert("更新成功");
                } else {
                    alert("更新失败");
                }

            })
        }

        $scope.AddOne = function (phone) {
            $http({
                url: "/phones/updateOne",
                method: "post",
                data: phone
            }).success(function (data) {
                if (data  == "true") {
                    alert("添加成功");
                    $scope.phone.imei = '';
                    $scope.phone.name = '';
                    $scope.phone.type = '';
                    $scope.phone.color = '';
                    $scope.phone.price = '';

                } else {
                    alert("添加失败");
                }

            })
        }
    }]
);
