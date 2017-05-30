angular.module('app').service('mainService', function($http){
	
	this.search = function(routNum, acctNum){
		return $http.get('/api/' + routNum + '/' + acctNum)
	}
	
})