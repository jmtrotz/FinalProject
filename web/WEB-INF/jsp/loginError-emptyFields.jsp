<%@page contentType = "text/html" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset=UTF-8">
        <title>
            Easel
        </title>
        <link rel = "shortcut icon" href = "images/logo.png"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container-fluid bg-1 text-center">
        <fieldset>
            <legend>
                Login
                (<font color = "red">*</font> = required)
            </legend>
            <img src="images/error.png">
            <h1>Login error: Please fill out all required fields</h1>
            <form action = "login" method = "post">
                <label>
                    <font color = "red">*</font>Username: 
                    <input type = "text" name = "username"/>
                </label>
                <br>
                <label>
                    <font color = "red">*</font>Password: 
                    <input type = "password" name = "password"/>
                </label>
                <br>
                <input type = "submit" value = "Login"/>
                <br>
                Don't have an account? Create one <a href = "createAccount.jsp">here!</a>
            </form>
        </fieldset>
        </div>
    </body>
</html>