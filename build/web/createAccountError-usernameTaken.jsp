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
        <fieldset>
            <legend>
                Create Account
                (<font color = "red">*</font> = required)
            </legend>
            <img src="images/error.png">
            <h1>Error creating account: Username is already in use</h1>
           <form action = "createAccount" method = "post">
                <label>
                    <font color = "red">*</font>Student ID: 
                    <input type = "text" name = "studentID"/>
                </label>
                <br>
                <label>
                    <font color = "red">*</font>First Name: 
                    <input type = "text" name = "firstName"/>
                </label>
                <br>
                <label>
                    <font color = "red">*</font>Last Name: 
                    <input type = "text" name = "lastName"/>
                </label>
                <br>
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
                <label>
                    <font color = "red">*</font>Confirm Password: 
                    <input type = "password" name = "confirmPassword"/>
                </label>
                <br>
                <label>
                    Class 1: 
                    <select id = "classes1" name = "class1">
                        <option selected value = "null">
                            None
                        </option>
                        <option value = "cs225">
                            CS 225
                        </option>
                        <option value = "cs230">
                            CS 230
                        </option>
                        <option value = "cs316">
                            CS 316
                        </option>
                        <option value = "ct376">
                            CT 376
                        </option>
                        <option value = "ct406">
                            CT 406
                        </option>
                        <option value = "se321">
                            SE 321
                        </option>
                        <option value = "se458">
                            SE 458
                        </option>
                    </select>
                </label>
                <br>
                <label>
                    Class 2: 
                    <select id = "classes2" name = "class2">
                        <option selected value = "null">
                            None
                        </option>
                        <option value = "cs225">
                            CS 225
                        </option>
                        <option value = "cs230">
                            CS 230
                        </option>
                        <option value = "cs316">
                            CS 316
                        </option>
                        <option value = "ct376">
                            CT 376
                        </option>
                        <option value = "ct406">
                            CT 406
                        </option>
                        <option value = "se321">
                            SE 321
                        </option>
                        <option value = "se458">
                            SE 458
                        </option>
                    </select>
                </label>
                <br>
                <label>
                    Class 3: 
                    <select id = "classes3" name = "class3">
                        <option selected value = "null">
                            None
                        </option>
                        <option value = "cs225">
                            CS 225
                        </option>
                        <option value = "cs230">
                            CS 230
                        </option>
                        <option value = "cs316">
                            CS 316
                        </option>
                        <option value = "ct376">
                            CT 376
                        </option>
                        <option value = "ct406">
                            CT 406
                        </option>
                        <option value = "se321">
                            SE 321
                        </option>
                        <option value = "se458">
                            SE 458
                        </option>
                    </select>
                </label>
                <br>
                <label>
                     Class 4: 
                    <select id = "classes4" name = "class4">
                        <option selected value = "null">
                            None
                        </option>
                        <option value = "cs225">
                            CS 225
                        </option>
                        <option value = "cs230">
                            CS 230
                        </option>
                        <option value = "cs316">
                            CS 316
                        </option>
                        <option value = "ct376">
                            CT 376
                        </option>
                        <option value = "ct406">
                            CT 406
                        </option>
                        <option value = "se321">
                            SE 321
                        </option>
                        <option value = "se458">
                            SE 458
                        </option>
                    </select>
                </label>
                <br>
                <label>
                    Class 5: 
                    <select id = "classes5" name = "class5">
                        <option selected value = "null">
                            None
                        </option>
                        <option value = "cs225">
                            CS 225
                        </option>
                        <option value = "cs230">
                            CS 230
                        </option>
                        <option value = "cs316">
                            CS 316
                        </option>
                        <option value = "ct376">
                            CT 376
                        </option>
                        <option value = "ct406">
                            CT 406
                        </option>
                        <option value = "se321">
                            SE 321
                        </option>
                        <option value = "se458">
                            SE 458
                        </option>
                    </select>
                </label>
                <br>
                <label>
                    Class 6: 
                    <select id = "classes6" name = "class6">
                        <option selected value = "null">
                            None
                        </option>
                        <option value = "cs225">
                            CS 225
                        </option>
                        <option value = "cs230">
                            CS 230
                        </option>
                        <option value = "cs316">
                            CS 316
                        </option>
                        <option value = "ct376">
                            CT 376
                        </option>
                        <option value = "ct406">
                            CT 406
                        </option>
                        <option value = "se321">
                            SE 321
                        </option>
                        <option value = "se458">
                            SE 458
                        </option>
                    </select>
                </label>
                <br>
                <label>
                    Class 7: 
                    <select id = "classes7" name = "class7">
                        <option selected value = "null">
                            None
                        </option>
                        <option value = "cs225">
                            CS 225
                        </option>
                        <option value = "cs230">
                            CS 230
                        </option>
                        <option value = "cs316">
                            CS 316
                        </option>
                        <option value = "ct376">
                            CT 376
                        </option>
                        <option value = "ct406">
                            CT 406
                        </option>
                        <option value = "se321">
                            SE 321
                        </option>
                        <option value = "se458">
                            SE 458
                        </option>
                    </select>
                </label>
                <br>
                <input type = "submit" value = "Create Account"/>
            </form>
        </fieldset>
    </body>
</html>