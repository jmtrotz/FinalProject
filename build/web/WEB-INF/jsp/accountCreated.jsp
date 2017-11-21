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
    <body>
        <div class="container-fluid bg-1" align="center">
            <fieldset>
                <legend>
                    Login (<font color="red">*</font> = required)
                </legend>
                <h1>Your account has been created! Please try logging in</h1>
                <form action="login.htm">
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
                </form>
            </fieldset>
        </div>
    </body>
</html>