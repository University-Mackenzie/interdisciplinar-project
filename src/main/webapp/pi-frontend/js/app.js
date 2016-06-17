function usuarios($scope, $http) {
    $http.get('http://localhost:8080/interdisciplinar-project/usuario/listar').
        success(function (data) {
            $scope.usuarios = data;
        });
}

function alunos($scope, $http) {
    $http.get('http://localhost:8080/interdisciplinar-project/aluno/listar').
        success(function (data) {
            $scope.alunos = data;
        });
}

function function_name(argument) {
	// body...
}