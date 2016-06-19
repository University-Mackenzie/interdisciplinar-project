/**
 * Funcao controller "usuarios".
 */
function usuarios($scope, $http) {
    $http.get('http://localhost:8080/interdisciplinar-project/usuario/listar').
        success(function (data) {
            $scope.usuarios = data;
        });
}

/**
 * Funcao controller "alunos".
 */
function alunos($scope, $http) {
    $http.get('http://localhost:8080/interdisciplinar-project/aluno/listar').
        success(function (data) {
            $scope.alunos = data;
        });
}

/**
 * Funcao para incluir novos Componentes.
 */
function incluirComponente() {
    var id = jQuery("#id").val();
    var nome = jQuery("#nome").val();
    var descricao = jQuery("#descricao").val();
    var img_path = jQuery("#img_path").val();
    var form = {
        id: id,
        nome: nome,
        descricao: descricao,
        img_path: img_path
    }

    var idCliente = $("#idUser").val();
    var json = JSON.stringify(form);

    jQuery.ajax({
        type: "POST",
        url: "http://localhost:8080/componente/incluirNovoComponente/" + tia,
        data: json,
        contentType: "application/json;charset=utf-8",
        success: function (cliente) {

            //Inserir ação após inclusao
        }
    });
}

/**
 * Funcao para incluir novos Monitores.
 */
function incluirUsuario() {
    // var id = jQuery("#idUser").val();
    var nome = jQuery("#nome").val();
    var email = jQuery("#email").val();
    var img_perfil = jQuery("#img_perfil").val();
    var tipo_monitor = jQuery(".tipo_monitor").val();
    var form = {
        nome: nome,
        email: email,
        img_perfil: img_perfil,
        tipo_monitor: tipo_monitor
    }

    // var idUsuario = $("#tia").val();
    var json = JSON.stringify(form);

    jQuery.ajax({
        type: "POST",
        url: "http://localhost:8080/interdisciplinar-project/usuario/incluirNovoUsuario",
        data: json,
        contentType: "application/json;charset=utf-8",
        success: function (nome) {

        	alert("Gravado com Sucesso!");
        }
    });
}

/**
 * FUNÇOES CLASS ALUNOS
 * Funcao para persistir novos Alunos no banco de dados .
 */

//  angular.module('alunos', [])
// .config(function($routeProvider){
//     $routeProvider
//     .when('/', {
//         templateUrl: 'http://localhost:8080/pi-frontend/presenca.jsp'
//     })
//     .when('http://localhost:8080/interdisciplinar-project/aluno/incluirNovoAluno', {
//         templateUrl: 'http://localhost:8080/pi-frontend/aluno/aluno-adicionar.jsp',
//         controller: 'CtrlAdd'
//     })
//     .when('http://localhost:8080/pi-frontend/aluno/:index', {
//         templateUrl: 'http://localhost:8080/pi-frontend/aluno/aluno-editar.jsp',
//         controller: 'CtrlEdit'
//     });
// })
angular
    .module('alunos', [])

    .config(function($routeProvider) {

        $routeProvider
            .when('/', {
                templateUrl: 'http://localhost:8080/pi-frontend/presenca.jsp'
            })
            .when('/pessoa/adicionar', {
                templateUrl: 'adicionar.html',
                controller:  'CtrlAdicionar'
            })
            .when('/aluno/:index', {
                templateUrl: 'http://localhost:8080/pi-frontend/aluno/aluno-editar.jsp',
                controller: 'CtrlEditar'
            });

    })
.controller('alunos', function($scope){
    $scope.alunos = [
              {nome: 'Maria1', email: 'Flopis'},
              {nome: 'Maria2', email: 'Flopis2'},
              {nome: 'Maria3', email: 'Flopis3'},
              {nome: 'Maria4', email: 'Flopis4'}
    ]
})
.controller('CtrlAdd', function($scope){
    $scope.add = function(){
        $scope.alunos.push($scope.aluno);
            // nome: $scope.pessoa.nome,
            // cidade: $scope.pessoa.cidade
        // });

        // $scope.pessoa.nome = "";
        // $scope.pessoa.cidade = "";
        $scope.aluno = "";
        $scope.result = "Registro adicionadodo com sucesso!";
    };
})
.controller('CtrlEdit', function($scope, $routeParams){
    $scope.aluno = $scope.alunos[$routeParams.index];
});

function incluirAluno() {
    var nome = jQuery("#nome").val();
    var email = jQuery("#email").val();
    var form = {
        nome: nome,
        email: email
    }

    var json = JSON.stringify(form);

    jQuery.ajax({
        type: "POST",
        url: "http://localhost:8080/interdisciplinar-project/aluno/incluirNovoAluno",
        data: json,
        contentType: "application/json;charset=utf-8",
        success: function (nome) {

        	alert("success");
        }
    });
}