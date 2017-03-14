<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <div class="form-group label-floating">
            <label class="control-label" for="focusedInput1">Nome:</label>
            <input class="form-control" id="focusedInput1" type="text">
        </div>
        <div class="form-group label-floating">
            <label for="222" class="control-label">Quantidade</label>
            <input type="number" class="form-control" id="222">
            <p class="help-block">You should really write something here</p>
        </div>
        <div class="sample">
            <div class="form-group">
                <label for="s1">Tipo de consulmo</label>
                <select id="s1" class="form-control">
                    <c:forEach items="${consumptions}" var="item">
                        <option value="${item}">${item}</option>
                    </c:forEach>
                </select>
            </div>
        </div>


    </div>
</div>
<script>
    $.material.init();
</script>
</body>
</html>