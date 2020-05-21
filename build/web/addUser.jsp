<%-- 
    Document   : addUser
    Created on : Apr 26, 2020, 10:24:01 PM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User Account</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <!-- Google Fonts -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
        <!-- Bootstrap core CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/css/mdb.min.css" rel="stylesheet">

        <!-- JQuery -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/js/mdb.min.js"></script>
    </head>
    <body>
        <%@include file="navigationBar.jsp" %>
        <form action="addUser" method="GET">
            <div style="position: absolute; left: 35%; top: 12%; width: 30%; height: 70%">
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 17%; width: 20%; height: 15px">
                <h4>CREATE USER ACCOUNT</h4>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 25%; width: 20%; height: 15px">
                <input type="text" class="form-control" id="usr" name="usr" placeholder="User Name" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 33%; width: 20%; height: 15px">
                <input type="text" class="form-control" id="email" name="email" placeholder="Email" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 41%; width: 20%; height: 15px">
                <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Password" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 47%; width: 20%; height: 15px">
                <p style="font-size: 12px">Use 8 or more characters with a mix of letters, numbers & symbols</p>
            </div>

            <!-- Default unchecked -->
            <div class="custom-control custom-checkbox" style="position: absolute; left: 40%; top: 56%; width: 50px; height: 10px">
                <input type="checkbox" class="custom-control-input" id="defaultUnchecked">
            </div>
            <div style="position: absolute; left: 41%; top: 55%; width: 17%; height: 30px">
                <label for="defaultUnchecked"><p style="font-size: 14px">To create a User Account, you’ll need to agree to the Terms of Service.</p></label>
            </div>

            <div class="form-group" style="position: absolute; left: 40%; top: 66%; width: 20%; height: 15px">
                <input type="submit" class="btn btn-info" value="Create Account">
            </div>
        </form>
    </body>
</html>
