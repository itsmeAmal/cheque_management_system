<%-- 
    Document   : clientManagement
    Created on : Apr 30, 2020, 7:56:42 PM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Management</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <%@include file="navigationBar.jsp" %>
    </head>
    <body>
        <form action="#">
            <div style="position: absolute; left: 20%; top: 2%; width: 60%; height: 80%; background-color: #cccccc">
            </div>
            <div class="container" style="position: absolute; left: 22%; top: 5%; width: 56%; height: 100%">
                <h4>Manage Clients</h4>

                <table class="table">
                    <thead>
                        <tr>
                            <th>Client Name</th>
                            <th>NIC</th>
                            <th>Contact No</th>
                            <th>Note</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>

                        <tr class="info">
                            <td>chamalki</td>
                            <td>976532082v</td>
                            <td>0775318642</td>
                            <td>Test Note</td>
                            <td><div>
                                    <button type="button" class="btn btn-danger">Active</button>
                                </div></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </form>
    </body>
</html>
