 <%-- 
    Document   : activeUsers_menu
    Created on : May 16, 2020, 6:31:12 PM
    Author     : Amal
--%>

<%@page import="com.cms.controller.userController"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

        <style>
            .my-custom-scrollbar {
                position: relative;
                height: 200px;
                overflow: auto;
            }
            .table-wrapper-scroll-y {
                display: block;
            }
        </style>

    </head>
    <body>
        <%
            ResultSet rset4 = userController.getAllUsers();
            int i = 0;
        %>
        <div style="position: absolute; left: 20%; top: 30%; width: 30%; height: 5%">
            <h4 style="color: #000000"><b>Billing History</b></h4>
        </div>
        <div style="position: absolute; left: 20%; top: 35%; width: 37%; height: 10%">
            <div class="table-wrapper-scroll-y my-custom-scrollbar">
                <table class="table table-bordered table-striped mb-0">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col"><i class="fas fa-image mr-2 grey-text" aria-hidden="true"></i>Date</th>
                            <th scope="col"><i class="fas fa-book mr-2 grey-text" aria-hidden="true"></i>Bill No</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            while (rset4.next()) {
                        %>
                        <tr>
                            <th scope="row"></th>
                            <td>2020/10/20</td>
                            <td>1002001</td>

                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
