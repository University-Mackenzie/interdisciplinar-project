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
    
