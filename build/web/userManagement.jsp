<%-- 
    Document   : userManagement
    Created on : Apr 29, 2020, 2:21:48 PM
    Author     : Chamalki Madushika
--%>

<%@page import="com.cms.controller.userController"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Management</title>
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
        <div style="z-index:20">
            <%@include file="navigationBar.jsp" %>
        </div>
        <div style="position: fixed; left: 0px; top: 0px; width: 100%; height: 100%; z-index:-1">
            <!--<img src="images/background-blur-clean-clear-531880.jpg">-->
        </div>
        <div style="position: absolute; left: 10%; top: 15%; width: 80%; height: 80%; background-color: white; z-index:-1; border-radius: 20px">
        </div>
        <%                ResultSet rset = userController.getAllUsers();

        %>
        <div class="container" style="position: absolute; left: 12%; top: 18%; width: 76%; height: 100%; z-index:-1">
            <h4>Manage Users</h4>
            <table class="table">
                <thead>
                    <tr style="background-color: #000000; color: white">
                        <th>Email</th>
                        <th>User Name</th>
                        <th>User Role</th>
                        <th>Update Role</th>
                        <th>Status</th>
                        <th>Update As</th>
                    </tr>
                </thead>
                <tbody>

                    <%                        while (rset.next()) {
                    %>
                    <tr class="info table-bordered" style="background-color: white">
                <form action="updateUserAsActiveOrInactive" method="post">
                    <td><%= rset.getString("user_email")%>
                        <input type="hidden" value="<%= rset.getInt("user_id")%>" name="hiddenUserId">
                        <input type="hidden" value="<%= rset.getInt("user_status")%>" name="hiddenUserStatus">
                    </td>
                    <td><%= rset.getString("user_name")%></td>
                    <%
                        String currentUserType = "";
                        if (rset.getInt("user_type") == User.USER_TYPE_ADMIN) {
                            currentUserType = "Admin";
                        } else if (rset.getInt("user_type") == User.USER_TYPE_MANAGER) {
                            currentUserType = "Manager";
                        } else if (rset.getInt("user_type") == User.USER_TYPE_USER) {
                            currentUserType = "User";
                        } else if (rset.getInt("user_type") == User.USER_TYPE_GUEST) {
                            currentUserType = "Guest";
                        }
                    %>
                    <td><%= currentUserType%></td>
                    <td style="width: 170px;">
                        <div class="form-group" >
                            <div class="dropdown">
                                <div id="user_type">
                                    <select class="form-control" name="user_type">
                                        <option>--</option>
                                        <option value=<%= User.USER_TYPE_ADMIN%>>Admin</option>
                                        <option value=<%= User.USER_TYPE_MANAGER%>>Manager</option>
                                        <option value=<%= User.USER_TYPE_USER%>>User</option>
                                        <option value=<%= User.USER_TYPE_GUEST%>>Guest Account</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </td>
                    <td><div>
                            <%
                                HttpSession ses1 = request.getSession();
                                ses1.setAttribute("hiddenUserId", Integer.toString(rset.getInt("user_id")));
                                ses1.setAttribute("hiddenUserCurrentStatus", Integer.toString(rset.getInt("user_status")));
                            %>
                            <%
                                if (rset.getInt("user_status") == User.USER_STATUS_ACTIVE) {
                            %>
                            <input type="submit"  style="width: 150px" value="Deactivate User" name="btn_inactive_user" class="form-control btn-danger m-0 px-3">
                            <%
                            } else {
                            %>
                            <input type="submit"  style="width: 150px" value="Activate User" name="btn_active_user" class="form-control  btn-default m-0 px-3">
                            <%
                                }
                            %>
                        </div></td>
                    <td>   
                        <input type="submit" value="Update" name="btn_update_user" class="form-control  btn-warning m-0 px-3">
                    </td>
                </form>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </body>
</html>
