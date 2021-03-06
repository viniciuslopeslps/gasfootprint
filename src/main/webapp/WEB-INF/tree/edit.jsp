<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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

<%@ include file="/WEB-INF/base/nav.jsp" %>

<div class="container">
    <br/><br/>
    <div class="jumbotron">
        <h2>Cadastro de árvores</h2>
        <form:form commandName="tree" action="/tree/save" method="post">
            <form:hidden path="id"/>
            <div class="form-group label-floating">
                <label class="control-label">Quantidade</label>
                <form:input path="quantity" type="number" cssClass="form-control"/>
                <p class="help-block">Quantidade de árvores plantadas</p>
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