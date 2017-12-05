<!--
    Page displayed after a successful login
    Class: CT406
    Date: 11/29/17
    Authors: Jeffrey Trotz & William Varner
    Version: 1.0
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Easel</title>
        <link rel="shortcut icon" href="images/logo.png"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container-fluid bg-1 text-center">
            <div class="row">
                <c:forEach items="${classList}" var="class">
                    <div class="col-xs-4">
                        <a href="class.jsp">
                            <img src="images/folder.png" class="img-circle">
                        </a>
                        <h3><c:out value="${class}"/></h3>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>