<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>
<head>
    <meta charset="UTF-8">
    <title>Gas foot print</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/bootstrap-material-design/css/bootstrap-material-design.min.css"/>
    <link rel="stylesheet" href="/bootstrap-material-design/css/ripples.min.css"/>
    <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700">
    <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/icon?family=Material+Icons">
    <script type="text/javascript" src="/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/bootstrap-material-design/js/material.min.js"></script>
    <script type="text/javascript" src="/bootstrap-material-design/js/ripples.min.js"></script>
</head>
<body>
<div class="container">
    <br/><br/>
    <div class="jumbotron">
        <h2>Cadastro de Consulmo</h2>
        <form:form commandName="consumption" action="/consumption/save" method="post">
            <div class="form-group label-floating">
                <label class="control-label">Quantidade</label>
                <form:input path="quantity" type="number" cssClass="form-control"/>
                <p class="help-block">Quantity in litters</p>
            </div>
            <div class="sample">
                <div class="form-group">
                    <label class="control-label">Tipo</label>
                    <form:select path="type" cssClass="form-control" items="${types}"/>
                </div>
            </div>
            <button type="submit" class="btn btn-raised btn-default">Salvar</button>
        </form:form>

    </div>
</div>
<script>
    $.material.init();
</script>
</body>
</html>