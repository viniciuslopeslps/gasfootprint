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
    <script type="text/javascript" src="/jquery/jquery.min.js" ></script>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.min.js" ></script>
    <script type="text/javascript" src="/bootstrap-material-design/js/material.min.js" ></script>
    <script type="text/javascript" src="/bootstrap-material-design/js/ripples.min.js" ></script>
</head>
<body>
<h1>Bem-vindo</h1>
<a class="btn btn-raised btn-primary">Primary<div class="ripple-container"></div></a>

<script>
    $.material.init();
</script>
</body>
</html>