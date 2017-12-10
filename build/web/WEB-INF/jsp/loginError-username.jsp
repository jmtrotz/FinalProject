<!--
    Page displayed if the username entered into the login form doesn't exist in the database
    Class: CT406
    Date: 11/29/17
    Authors: Jeffrey Trotz & William Varner
    Version: 1.0
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div class="container-fluid" align="center">
            <fieldset>
                <img src="images/error.png">
                <h1>Login error: Username does not exist</h1>
                <form action="login.htm">
                    <img src="images/formLogo.png" width="190" height="56">
                    <label>
                        <font color="red">*</font>Username: 
                        <input type="text" name="username"/>
                    </label>
                    <br>
                    <label>
                        <font color="red">*</font>Password: 
                        <input type="password" name="password"/>
                    </label>
                    <br>
                    <input type="submit" value="Login"/>
                    <br>
                    Don't have an account?<br>
                    Create one <a href="createAccount.jsp">here!</a>
                </form> 
            </fieldset>
        </div>
    </body>
</html>