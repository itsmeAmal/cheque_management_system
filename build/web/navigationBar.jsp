<%-- 
    Document   : navigationBar
    Created on : Apr 30, 2020, 8:17:34 PM
    Author     : Chamalki Madushika
--%>

<%@page import="com.cms.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
        <%
            HttpSession ses = request.getSession();
            User user = (User) ses.getAttribute("loggedUser");
        %>
        <nav class="navbar card text-white bg-info mb-3 fixed-top navbar-expand-lg navbar-dark pink scrolling-navbar ">
            <a class="navbar-brand" href="dashboard.jsp"><strong>C M S DASHBOARD<span class="sr-only">(current)</span></strong></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <%
                        if (user.getUserType() == User.USER_TYPE_ADMIN || user.getUserType() == User.USER_TYPE_MANAGER) {
                    %>
                    <li class="nav-item">
                        <a class="nav-link" href="userManagement.jsp">Manage Users </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="clientManagement.jsp">Manage Clients</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="addIssueCheque.jsp">Manage Cheques</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="addUser.jsp">Add Users</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="addClient.jsp">Add Clients</a>
                    </li>
                    <%
                    } else if (user.getUserType() == User.USER_TYPE_USER || user.getUserType() == User.USER_TYPE_GUEST) {
                    %>
                    <li class="nav-item">
                        <a class="nav-link" href="addIssueCheque.jsp">Manage Cheques</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="addClient.jsp">Add Clients</a>
                    </li>
                    <%
                    }
                    %>

                </ul>
                <ul class="navbar-nav nav-flex-icons">
                    <li class="nav-item">
                        <a class="nav-link"><i class="fab fa-facebook-f"></i></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"><i class="fab fa-twitter"></i></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"><i class="fab fa-instagram"></i></a>
                    </li>
                </ul>

                <ul class="navbar-nav nav-flex-icons" style="position: absolute; left: 80%; top: 58%; width: 300px; height: 60px;">
                    <li class="nav-item">
                        <%
                            if (user != null) {
                        %>
                    <li><a href="#" style="color: #ffffff"><span class="glyphicon glyphicon-log-in"></span><b>Hi, <%=user.getUserName()%></b> </a></li>
                                <%
                                    } else {
                                        response.sendRedirect("login.jsp");
                                    }
                                %>
                    </li>
                </ul>
                <ul class="navbar-nav nav-flex-icons" style="position: absolute; left: 90%; top: 58%; width: 300px; height: 60px;">
                    <li class="nav-item">
                    <li><a href="login.jsp" style="color: #ffffff"><span class="glyphicon glyphicon-log-in"></span><b>Log out</b> </a></li>
                    </li>
                </ul>
            </div>
        </nav>
    </body>
</html>

