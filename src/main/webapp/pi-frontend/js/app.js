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
    var logradouro = jQuery("#id").val();
    var numero = jQuery("#nome").val();
    var complemento = jQuery("#descricao").val();
    var cep = jQuery("#img_path").val();
    var form = {
        logradouro: logradouro,
        numero: numero,
        complemento: complemento,
        cep: cep
    }

    var idCliente = $("#idCliente").val();
    var json = JSON.stringify(form);

    jQuery.ajax({
        type: "POST",
        url: "/loja/clientes/incluirNovoEndereco/" + idCliente + ".html",
        data: json,
        contentType: "application/json;charset=utf-8",
        success: function (cliente) {
            jQuery.ajax({
                type: "POST",
                url: "/loja/pedidos/selecionarDadosEntrega/" + cliente.id + "/" + cliente.enderecos[0].idEndereco + ".html",
                success: function () {
                    jQuery.ajax({
                        type: "POST",
                        url: "/loja/pedidos/selecionarPagamento/1.html",
                        success: function () {
                            jQuery.ajax({
                                type: "POST",
                                url: "/loja/pedidos/concluirPedido.html",
                                success: function (codigoPedido) {
                                    window.location.href = "/loja/pedidos/gerarBoleto/" + codigoPedido + ".html";
                                }
                            });
                        }
                    });
                }
            });
        }
    });
}