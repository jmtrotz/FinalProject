<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            <a href="grades.jsp"><h3>Grades</h3></a>
            <a href="assignments.jsp"><h3>Assignments</h3></a>
            <a href=""><h3>Files</h3></a>
            <a href="people.jsp"><h3>People</h3></a>
        </div>
        <div class="col-xs-10 bg-1"> 
            <c:forEach items="${assignments.listAssignments(request)}" var="assignment">
                <c:forEach items="${grades.listGrades(request)}" var="grade">
                    <table>
                        <tr>
                            <td>
                                <c:out value="${assignment}"/>
                            </td>
                            <td>
                                <c:out value="${grade}"/>
                            </td>
                        </tr>
                    </table>
                </c:forEach>
            </c:forEach>
        </div>
    </body>
</html>