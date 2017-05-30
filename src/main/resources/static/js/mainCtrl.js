angular.module('app').controller('mainCtrl', function($scope, mainService){
	
	$scope.search = function(routNum,acctNum){
		mainService.search(routNum,acctNum).then(function(response){
			$scope.results = response.data;
		})
	}
})