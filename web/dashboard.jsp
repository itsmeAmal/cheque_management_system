<%-- 
    Document   : dashboard
    Created on : May 1, 2020, 10:42:04 PM
    Author     : Chamalki Madushika
--%>

<%@page import="com.cms.model.User"%>
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
        <style>
            @-webkit-keyframes spin {
                0% { -webkit-transform: rotate(0deg); }
                100% { -webkit-transform: rotate(360deg); }
            }

            @keyframes spin {
                0% { transform: rotate(0deg); }
                100% { transform: rotate(360deg); }
            }

            /* Add animation to "page content" */
            .animate-bottom {
                position: relative;
                -webkit-animation-name: animatebottom;
                -webkit-animation-duration: 1s;
                animation-name: animatebottom;
                animation-duration: 1s
            }

            @-webkit-keyframes animatebottom {
                from { bottom:-100px; opacity:0 } 
                to { bottom:0px; opacity:1 }
            }

            @keyframes animatebottom { 
                from{ bottom:-100px; opacity:0 } 
                to{ bottom:0; opacity:1 }
            }

            .zoom {
                padding: 10px;
                /*background-color: green;*/
                transition: transform .2s; /* Animation */
                width: 90px;
                height: 90px;
                margin: 0 auto;
            }

            .zoom:hover {
                transform: scale(1.5); /* (150% zoom - Note: if the zoom is too large, it will go outside of the viewport) */
            }
            .no-js #loader { display: none;  }
            .js #loader { display: block; position: absolute; left: 100px; top: 0; }
            .se-pre-con {
                position: fixed;
                left: 0px;
                top: 0px;
                width: 100%;
                height: 100%;
                z-index: 9999;
                background: url(https://smallenvelop.com/wp-content/uploads/2014/08/Preloader_11.gif) center no-repeat #fff;
            }
        </style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.js"></script>
        <script>
            $(window).load(function () {
                // Animate loader off screen
                $(".se-pre-con").fadeOut("slow");
                ;
            });
        </script>

    </head>
    <body> 
        <div style="position: fixed; left: 0px; top: 0px; width: 100%; height: 100px; z-index:999">
            <%@include file="navigationBar.jsp" %>
        </div>
        <div class="se-pre-con"></div>
        <!--9-->
        <div style="position: fixed; left: 0%; top: 6%; width: 100%; height: 100%; background-color: #ffffff; z-index:-1"></div>
        <!--10-->
        <div style="position: fixed; left: 6px; top: 6%; width: 17%; height: 95%; background-color: rgba(0, 0, 0, 0.5); z-index:-1">
        </div>
        <!--//-------------------->
        <!--11-->
        <div style="position: absolute; left: 20%; top: 8%; width: 15%; height: 80px; background-color: rgba(26, 163, 255, 0.5); z-index:-1; border-radius: 20px;">
            <h4 style="position: absolute; left: 40%; align-content: center; padding-top: 6%">Current</br> Users</h4></div>
        <div style="position: absolute; left: 20%; top: 8%; width: 4%; height: 80px; background-color: rgba(26, 163, 255, 0.5); z-index:-1; border-radius: 20px;" class="zoom"></div>

        <!--1-->
        <div style="position: absolute; left: 40%; top: 8%; width: 15%; height: 80px; background-color: rgba(26, 163, 255, 0.5); border-radius: 20px;">
            <h4 style="position: absolute; left: 40%; align-content: center; padding-top: 6% ">Registered</br> Users</h4>
        </div>
        <div style="position: absolute; left: 40%; top: 8%; width: 4%; height: 80px; background-color: rgba(26, 163, 255, 0.5); border-radius: 20px;" class="zoom">
            <%                int registeredUsers = commonController.getUserCount();
            %>
            <h1 style="position: absolute; left: 40%; top: 5%; width: 70%; height: 100px; "><b><%=registeredUsers%></b></h1>
                    <%
                    %>
        </div>

        <!--2-->
        <div style="position: absolute; left: 60%; top: 8%; width: 15%; height: 80px; background-color: rgba(26, 163, 255, 0.5); border-radius: 20px;">
            <h4 style="position: absolute; left: 40%; align-content: center; padding-top: 6% ">Registered</br> Clients</h4>
        </div>
        <div style="position: absolute; left: 60%; top: 8%; width: 4%; height: 80px; background-color: rgba(26, 163, 255, 0.5); border-radius: 20px;" class="zoom">
            <%
                int registeredClients = commonController.getClientCount();
            %>
            <h1 style="position: absolute; left: 40%; top: 5%; width: 70%; height: 100px; "><b><%=registeredClients%></b></h1>
                    <%
                    %>
        </div>
        <!--3-->
        <div style="position: absolute; left: 80%; top: 8%; width: 16%; height: 80px; background-color: rgba(26, 163, 255, 0.5); border-radius: 20px;">
            <h4 style="position: absolute; left: 40%; align-content: center; padding-top: 6% ">Cheques dated</br> for today</h4>
        </div>
        <div style="position: absolute; left: 80%; top: 8%; width: 4%; height: 80px; background-color: rgba(26, 163, 255, 0.5); border-radius: 20px;" class="zoom"></div>
        <!--4-->
        <div style="position: absolute; left: 20%; top: 35%; width: 80%; height: 5px">
        </div>

        <%
            ResultSet rset = userController.getAllUsers();
            int i = 0;
        %>
        <div style="position: absolute; left: 20%; top: 19%; width: 30%; height: 5%">
            <h4 style="color: #999999"><b># Activate / Deactivate Users</b></h4>
        </div>
        <div style="position: absolute; left: 20%; top: 25%; width: 30%; height: 40%">
            <!--background-color: rgba(26, 163, 255)-->
            <table class="table table-bordered table-dark">
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
                            <input type="submit" class="btn btn-primary" value="DEACTIVATE" style="width: 120px" >
                            <%
                            } else if (rset.getInt("user_status") == 0) {
                            %>
                            <input type="submit" class="btn btn-danger" value="ACTIVATE" style="width: 120px" >
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
        <div style="position: absolute; left: 55%; top: 19%; width: 30%; height: 5%">
            <h4 style="color: #999999"><b># Cheque Details</b></h4>
        </div>
        <div style="position: absolute; left: 55%; top: 25%; width: 30%; height: 40%">  
            <!--background-color: rgba(26, 163, 255)-->
            <%
                ResultSet rset3 = chequeDetailController.getAllChequeDetails();
            %>
            <table class="table table-bordered table-dark">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Cheque No</th>
                        <th scope="col">Date</th>
                        <th scope="col">Received/Issued</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        int chequeOrderNumber = 0;
                        while (rset3.next()) {


                    %>
                    <tr>
                        <th scope="row"><%= ++chequeOrderNumber%></th>
                        <td><%=rset3.getString("cheque_detail_cheque_number")%></td>
                        <td><%=rset3.getDate("cheque_detail_effective_date")%></td>
                        <td>Received</td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
        <!--6-->
        <div style="position: absolute; left: 40%; top: 15%; width: 20%; height: 15px"></div>
        <!--7-->
        <%@include file="barChart.jsp" %>
    </body>
</html>
