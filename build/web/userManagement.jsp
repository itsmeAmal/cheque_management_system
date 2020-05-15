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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div style="z-index:20">
            <%@include file="navigationBar.jsp" %>
        </div>
        <div style="position: fixed; left: 0px; top: 0px; width: 100%; height: 100%; z-index:-1">
            <img src="images/background-blur-clean-clear-531880.jpg">
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

                    <%                            while (rset.next()) {
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
                    <td>
                        <div class="form-group" style="position: absolute">
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
                            <input type="submit" class="btn btn-info" style="width: 120px" value="Inactive User" name="btn_inactive_user">
                            <%
                            } else {
                            %>
                            <input type="submit" class="btn btn-danger" style="width: 120px" value="Active User" name="btn_active_user">
                            <%
                                }
                            %>
                        </div></td>
                    <td>   
                        <input type="submit" class="btn btn-primary" value="Update" name="btn_update_user">
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
