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
                        <input type="submit" name="button" value="Grades"/>
                    </label>
                    <br>
                    <label>
                        <input type="submit" name="button" value="Assignments"/>
                    </label>
                    <br>
                    <label>
                        <input type="submit" name="button" value="Files"/>
                    </label>
                    <br>
                    <label>
                        <input type="submit" name="button" value="People"/>
                    </label>
                </form> 
            </fieldset>
        </div>
        <div class="col-xs-10 bg-1">
            <c:forEach items="${peopletList}" var="people">
                <c:forEach items="${emailList}" var="email">
                    <table>
                        <tr>
                            <td>
                                <c:out value="${people}"/>
                            </td>
                            <td>
                                <c:out value="${email}"/>
                            </td>
                        </tr>
                    </table>
                </c:forEach>
            </c:forEach>
        </div>
    </body>
</html>