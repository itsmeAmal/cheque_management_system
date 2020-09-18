<%-- 
    Document   : clientManagement
    Created on : Apr 30, 2020, 7:56:42 PM
    Author     : Chamalki Madushika
--%>

<%@page import="com.cms.model.Client"%>
<%@page import="com.cms.controller.clientController"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Management</title>
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
        </div>
        <div style="position: absolute; left: 10%; top: 15%; width: 80%; height: 80%; z-index:-1; border-radius: 20px">
        </div>
        <div class="container" style="position: absolute; left: 12%; top: 17%; width: 76%; height: 100%; z-index:-1">
            <h4>Manage Clients</h4>
            <table class="table">
                <thead>
                    <%                        ResultSet rset = clientController.getAllClients();
                    %>
                    <tr style="background-color: #000000; color: white">
                        <th>Client Name</th>
                        <th>NIC</th>
                        <th>Contact No</th>
                        <th>Note</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rset.next()) {
                    %>
                    <tr class="info" style="height: 40px; top: 0px;">
                <form action="updateClientAsActiveOrInactive" method="post">
                    <td>
                        <%= rset.getString("client_detail_name")%>
                        <input type="hidden" value="<%= rset.getInt("client_detail_status")%>" name="hid_client_cur_status">
                        <input type="hidden" value="<%= rset.getInt("client_detail_id")%>" name="hid_client_id">
                    </td>
                    <td>
                        <%= rset.getString("client_detail_nic")%>
                    </td>
                    <td><%= rset.getString("client_detail_contact_no")%></td>
                    <td><%= rset.getString("client_detail_detail")%></td>
                    <td style="position: relative; width: 100px;">
                            <%
                                if (rset.getInt("client_detail_status") == Client.CLIENT_STATUS_ACTIVE) {
                            %>
                            <input type="submit" style="width: 150px; height: 50px; top: 0px; left: 0px;" value="Deactivate Client" name="btn_inactive_client" class="form-control btn-danger m-0 px-3">

                            <%
                            } else {
                            %>
                            <input type="submit"  style="width: 150px; height: 50px; top: 0px; left: 0px;" value="Activate Client" name="btn_active_client" class="form-control  btn-default m-0 px-3">
                            <%
                                }
                            %>
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
