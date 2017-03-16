<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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

<div class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Gas Foot Print</a>
        </div>
        <div class="navbar-collapse collapse navbar-inverse-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/consumption/list">Consumos</a></li>
                <li><a href="/tree/list">Árvores</a></li>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <div class="jumbotron">
        <h2>Gas foot print</h2>
        <p>O serviço que ajuda você a ficar em dia com o meio ambiente.</p>
    </div>
    <br/><br/>
    <div class="row">
        <div class="col-md-4">
            <h3 class="text-center">Lista consumo</h3>
            <div class="list-group">
                <c:forEach items="${mainConsumptions}" var="item">
                    <div class="list-group-item">
                        <div class="btn btn-danger btn-fab">
                            <i class="material-icons">sentiment_dissatisfied</i>
                        </div>
                        <div class="row-content">
                            <div class="least-content">${item.createdAt}</div>
                            <h4 class="list-group-item-heading">${item.quantity} litros</h4>

                            <p class="list-group-item-text">${item.type}</p>
                        </div>
                    </div>
                    <div class="list-group-separator"></div>
                </c:forEach>
            </div>
        </div>
        <div class="col-md-offset-1 col-md-2">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Árvores necessárias</h3>
                </div>
                <div class="panel-body">
                    ${needed}
                </div>
            </div>
        </div>
        <div class="col-md-offset-1 col-md-4">
            <h3 class="text-center">Lista árvores</h3>
            <div class="list-group">
                <c:forEach items="${mainTrees}" var="item">
                    <div class="list-group-item">
                        <div class="btn btn-success btn-fab">
                            <i class="material-icons">mood</i>
                        </div>
                        <div class="row-content">
                            <div class="least-content">${item.createdAt}</div>
                            <h4 class="list-group-item-heading">${item.quantity} árvores</h4>
                        </div>
                    </div>
                    <div class="list-group-separator"></div>
                </c:forEach>
            </div>
        </div>
    </div>

</div>
<script>
    $.material.init();
</script>
</body>
</html>