<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Adicionar</title>
</head>
<body>
    <p>{{result}}</p>
    Nome: <input type="text" name="" ng-model="aluno.nome"/>
    <input type="submit" name="" value="Salvar" ng-click="add()"/>

    <a href="#/">Voltar</a>

</body>
</html>