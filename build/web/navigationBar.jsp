<%-- 
    Document   : navigationBar
    Created on : Apr 30, 2020, 8:17:34 PM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse" style="position: fixed; width: 100%; background-color: #000000">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"> C M S </a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">DASHBOARD</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Add / Register<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Register Users</a></li>
                            <li><a href="#">Add Cheque Details</a></li>
                            <li><a href="#">Register Clients</a></li>
                        </ul>
                    </li>
                    <li><a class="dropdown-toggle" data-toggle="dropdown" href="#">Manage<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Manage User Accounts</a></li>
                            <li><a href="#">Manage Cheques</a></li>
                            <li><a href="#">Manage Client Details</a></li>
                        </ul>

                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
            </div>
        </nav>
    </body>
</html>

