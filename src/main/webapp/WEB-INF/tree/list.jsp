<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
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
        <table class="table table-striped table-hover ">
            <thead>
            <tr class="info">
                <th>#</th>
                <th>Quantidade</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <h2>Lista de Consumo</h2>
            <c:forEach items="${trees}" var="item">
                <tr>
                    <td><a href="/tree/edit?id=${item.id}">${item.id}</a></td>
                    <td>${item.quantity}</td>
                    <td><a href="/tree/delete?id=${item.id}"><i class="material-icons">delete</i></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script>
    $.material.init();
</script>
</body>
</html>