<!--
    Page to login to view a list of classmates
    Class: CT406
    Date: 12/7/17
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
        <div class="col-xs-2 bg-2">
            <fieldset>
                <form action="menuItems.htm">
                    <label>
                        <button type="submit" name="button" value="Home">
                            <img src="images/home.jpg"/>
                        </button>
                    </label>
                    <br>
                    <label>
                        <button type="submit" name="button" value="Grades">
                            <img src="images/grades.png"/>
                        </button>
                    </label>
                    <br>
                    <label>
                        <button type="submit" name="button" value="Files">
                            <img src="images/files.png"/>
                        </button>
                    </label>
                    <br>
                    <label>
                        <button type="submit" name="button" value="People">
                            <img src="images/people.png"/>
                        </button>
                    </label>
                </form>
            </fieldset>
        </div>
        <div class="col-xs-10 bg-1">
            <center>
                <table class="table">
                    <tr>
                        <th scope="col">
                            <h1>Name</h1>
                        </th>
                        <th scope="col">
                            <h1>Email</h1>
                        </th>
                    </tr>
                    <c:forEach items="${peopleMap}" var="people">
                        <tr>
                            <td scope="row">
                                <h1><c:out value="${people.key}"/></h1>
                            </td>
                            <td scope="row">
                                <h1><c:out value="${people.value}"/></h1>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </center>
        </div>
    </body>
</html>