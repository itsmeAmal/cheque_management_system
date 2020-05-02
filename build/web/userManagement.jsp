<%-- 
    Document   : userManagement
    Created on : Apr 29, 2020, 2:21:48 PM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Management</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <form action="#">
            <div style="z-index:10">
                <%@include file="navigationBar.jsp" %>
            </div>
            <div style="position: absolute; left: 20%; top: 15%; width: 60%; height: 80%; background-color: #cccccc; z-index:-1">
            </div>
            <div style="position: fixed; left: 83%; width: 15%; height: 60%; top: 15%; background-color: #3300ff">
                <div style="position: fixed; left: 84%; top: 16%; width: 13%; height: 10%; color: #ffffff; ali">
                    <h4 style="text-align: center">Current user</h4>
                </div>
                <div style="position: fixed; left: 87%; top: 26%; width: 13%; height: 10%; color: #ffffff">
                    <img src="images/manx128.png" alt="Current User" height="128" width="128">
                </div>
                <div style="position: fixed; left: 84%; top: 40%; width: 13%; height: 10%; color: #ffffff; ali">
                    <h3 style="text-align: center">Chamalki</h3>
                </div>
                <div style="position: fixed; left: 84%; top: 45%; width: 13%; height: 10%; color: #ffffff; ali">
                    <h4 style="text-align: center">Logged Time</h4>
                    <h4 style="text-align: center">8.30 am</h4>
                </div>
                <div style="position: fixed; left: 84%; top: 52%; width: 13%; height: 10%; color: #ffffff; ali">
                    <h4 style="text-align: center">Account Type</h4>
                    <h4 style="text-align: center">Admin</h4>
                </div>
            </div>
            <div class="container" style="position: absolute; left: 22%; top: 18%; width: 56%; height: 100%; z-index:-1">
                <h4>Manage Users</h4>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Email</th>
                            <th>User Name</th>
                            <th>User Type</th>
                            <th>Note</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>

                        <tr class="info">
                            <td>test@gmail.com</td>
                            <td>chamalki</td>
                            <td>
                                <div class="form-group" style="position: absolute">
                                    <div class="dropdown">
                                        <div id="user_type">
                                            <select class="form-control" name="user_type">
                                                <option>Admin</option>
                                                <option>Manager</option>
                                                <option>User</option>
                                                <option>Guest Account</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </td>
                            <td>-</td>
                            <td><div>
                                    <button type="button" class="btn btn-info">Status</button>
                                </div></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </form>
    </body>
</html>
