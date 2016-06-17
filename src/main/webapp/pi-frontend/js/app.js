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
        url: "/componente/incluirNovoComponente/" + tia,
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
    var id = jQuery("#idUser").val();
    var nome = jQuery("#nome").val();
    var email = jQuery("#email").val();
    var img_perfil = jQuery("#img_perfil").val();
    var tipo_monitor = jQuery("#tipo_monitor").val();
    var form = {
        tia: tia,
        nome: nome,
        email: email,
        img_perfil: img_perfil,
        tipo_monitor: tipo_monitor
    }

    var idUsuario = $("#tia").val();
    var json = JSON.stringify(form);

    jQuery.ajax({
        type: "POST",
        url: "/usuario/incluirNovoUsuario/" + tia,
        data: json,
        contentType: "application/json;charset=utf-8",
        success: function (usuario) {

        	//Inserir ação após inclusao
        }
    });
}

/**
 * Funcao para incluir novos Alunos.
 */
function incluirAluno() {
    var id = jQuery("#id").val();
    var nome = jQuery("#nome").val();
    var tia = jQuery("#tia").val();
    var form = {
        id: id,
        nome: nome,
        tia: tia
    }

    var idAluno = $("#idAluno").val();
    var json = JSON.stringify(form);

    jQuery.ajax({
        type: "POST",
        url: "/aluno/incluirNovoAluno/" + tia,
        data: json,
        contentType: "application/json;charset=utf-8",
        success: function (aluno) {

        	//Inserir ação após inclusao
        }
    });
}