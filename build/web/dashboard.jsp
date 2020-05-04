<%-- 
    Document   : dashboard
    Created on : May 1, 2020, 10:42:04 PM
    Author     : Chamalki Madushika
--%>

<%@page import="com.cms.controller.chequeDetailController"%>
<%@page import="com.cms.controller.userController"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.cms.controller.commonController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
    </head>
    <body>
        <div style="position: fixed; left: 0px; top: 0px; width: 100%; height: 100px"; z-index:9999>
            <%@include file="navigationBar.jsp" %>
        </div>
        <!--9-->
        <div style="position: fixed; left: 0%; top: 6%; width: 100%; height: 100%; background-color: #ffffff; z-index:-1"></div>
        <!--10-->
        <div style="position: fixed; left: 0%; top: 6%; width: 17%; height: 100%; background-color: rgba(0, 0, 0, 0.5); z-index:-1">
            <div style="position: absolute; left: 30%; top: 10%; width: 128px; height: 128px">
                <img src="images/manx128.png" alt="Current User" height="128" width="128" style="vertical-align:middle"></div>
        </div>
        <!--11-->
        <div style="position: fixed; left: 20%; top: 12%; width: 15%; height: 100px; background-color: rgba(0, 128, 255, 0.5); z-index:-1">
            <h3 style="position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; ">Current</br> Users</h3></div>
        <div style="position: fixed; left: 20%; top: 12%; width: 4%; height: 100px; background-color: rgba(0, 128, 255, 0.5); z-index:-1"></div>

        <!--1-->
        <div style="position: absolute; left: 40%; top: 12%; width: 15%; height: 100px; background-color: rgba(0, 204, 0, 0.5)">
            <h3 style="position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; ">Registered</br> Users</h3>
        </div>
        <div style="position: absolute; left: 40%; top: 12%; width: 4%; height: 100px; background-color: rgba(0, 204, 0, 0.5)">
            <%
                int registeredUsers = commonController.getUserCount();
            %>
            <h1 style="position: absolute; left: 40%; top: 10%; width: 70%; height: 100px; "><b><%=registeredUsers%></b></h1>
                    <%
                    %>
        </div>

        <!--2-->
        <div style="position: absolute; left: 60%; top: 12%; width: 15%; height: 100px; background-color: rgba(255, 0, 0, 0.5)">
            <h3 style="position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; ">Registered</br> Clients</h3>
        </div>
        <div style="position: absolute; left: 60%; top: 12%; width: 4%; height: 100px; background-color: rgba(255, 0, 0, 0.5)">
            <%
                int registeredClients = commonController.getClientCount();
            %>
            <h1 style="position: absolute; left: 40%; top: 10%; width: 70%; height: 100px; "><b><%=registeredClients%></b></h1>
                    <%
                    %>
        </div>

        <!--3-->
        <div style="position: absolute; left: 80%; top: 12%; width: 15%; height: 100px; background-color: rgba(255, 128, 0, 0.5)">
            <h3 style="position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; ">Cheques dated</br> for today</h3>
        </div>
        <div style="position: absolute; left: 80%; top: 12%; width: 4%; height: 100px; background-color: rgba(255, 128, 0, 0.5)"></div>

        <!--4-->

        <%
            ResultSet rset = userController.getAllUsers();
            int i = 0;
        %>
        <div style="position: absolute; left: 20%; top: 35%; width: 30%; height: 40%; background-color: rgba(153, 204, 255, 0.5)">
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">User Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Status</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rset.next()) {
                    %>
                    <tr>
                        <th scope="row"><%= ++i%></th>
                        <td><%=rset.getString("user_name")%></td>
                        <td><%=rset.getString("user_email")%></td>
                        <td>
                            <%
                                if (rset.getInt("user_status") == 1) {
                            %>
                            <input type="submit" class="btn btn-primary" value="ACTIVE" style="width: 120px" >
                            <%
                            } else if (rset.getInt("user_status") == 0) {
                            %>
                            <input type="submit" class="btn btn-danger" value="INACTIVE" style="width: 120px" >
                            <%
                                }
                            %>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
        <!--5-->
        <%
            ResultSet rset2 = chequeDetailController.getAllChequeDetails();
        %>
        <div style="position: absolute; left: 55%; top: 35%; width: 30%; height: 40%; background-color: #cc0033">
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Cheque No</th>
                        <th scope="col">Date</th>
                        <th scope="col">Status</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>3215</td>
                        <td>2020/10/10</td>
                        <td>Pending</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <!--6-->
        <div style="position: absolute; left: 40%; top: 15%; width: 20%; height: 15px"></div>
        <!--7-->
        <div style="position: absolute; left: 40%; top: 15%; width: 20%; height: 15px"></div>
        <!--8-->
        <div style="position: absolute; left: 40%; top: 15%; width: 20%; height: 15px"></div>
    </body>
</html>
