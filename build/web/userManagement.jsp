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
            <div style="position: absolute; left: 20%; top: 2%; width: 60%; height: 80%; background-color: #cccccc">
            </div>
            <div class="container" style="position: absolute; left: 22%; top: 5%; width: 56%; height: 100%">
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
                                        <div id="exp_month">
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
