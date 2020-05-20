<%-- 
    Document   : addIssueCheque
    Created on : Apr 27, 2020, 1:44:03 PM
    Author     : Chamalki Madushika
--%>

<%@page import="com.cms.controller.chequeDetailController"%>
<%@page import="com.cms.controller.clientController"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Issue Cheque</title>
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
        <%@include file="navigationBar.jsp" %>
        <form action="addIssueCheque" method="post">
            <!--            <div style="position: absolute; left: 20%; top: 12%; width: 60%; height: 80%; background-color: #cccccc">
                        </div>
                        <div style="position: absolute; left: 22%; top: 17%; width: 56%; height: 50%; background-color: #99ff99">
            
                        </div>
                        <div class="form-group" style="position: absolute; left: 25%; top: 20%; width: 20%; height: 15px">
                            <h4>ISSUE CHEQUES</h4>
                        </div>-->


            <!------------------------------------------------------------------>

            <div style="position: absolute; left: 5%; top:  15%; width: 300px; height: 60px">
                <div class="dropdown">
                    <div id="bank">
                        <label for="form3">Bank</label>
                        <select class="form-control" name="bank" id=form3>
                            <option>Bank Of Ceylon</option>
                            <option>Nations Trust</option>
                            <option>People's Bank</option>
                            <option>Commercial Bank</option>
                            <option>Sampath Bank</option>
                            <option>National Savings Bank</option>
                            <option>Seylan Bank</option>
                            <option>Hatton National Bank</option>
                        </select>
                    </div>
                </div>
            </div>

            <!------------------------------------------------------------------>

            <div style="position: absolute; left: 5%; top:  25%; width: 300px; height: 60px" class="md-form">
                <input type="date" name="date" class="form-control" id="form1" required> 
                <label for="form1">Cheque Date</label>
            </div>

            <!------------------------------------------------------------------>

            <div style="position: absolute; left: 5%; top:  35%; width: 300px; height: 60px">
                <%                    ResultSet rset = clientController.getAllClients();
                %>
                <div class="dropdown">
                    <div id="fuel_type">
                        <label for="form7">Client Name</label>
                        <select class="form-control" name="client_name" id=form7>
                            <%
                                while (rset.next()) {
                            %>
                            <option><%=rset.getString("client_detail_name")%></option> 
                            <%
                                }
                            %>
                        </select>
                    </div>
                </div>
            </div>
            <!------------------------------------------------------------------>

            <div style="position: absolute; left: 5%; top:  45%; width: 300px; height: 60px" class="md-form">
                <input type="text" name="amount" class="form-control" id="form2" required> 
                <label for="form2">Amount</label> 
            </div>

            <!------------------------------------------------------------------------>

            <div style="position: absolute; left: 5%; top:  55%; width: 300px; height: 60px" class="md-form">
                <input type="text" name="cheque_no" class="form-control" id="form4" required> 
                <label for="form4">Cheque No</label> 
            </div>

            <!------------------------------------------------------------------------>

            <div style="position: absolute; left: 5%; top:  65%; width: 300px; height: 60px">
                <div class="dropdown">
                    <div id="cheque_type">
                        <label for="form10">Cheque Type</label>
                        <select class="form-control" name="cheque_type" id=form10>
                            <option>Issued</option> 
                            <option>Received</option> 
                        </select>
                    </div>
                </div>
            </div>

            <!------------------------------------------------------------------------>

            <div style="position: absolute; left: 5%; top:  75%; width: 300px; height: 60px" class="md-form">
                <input type="submit" class="btn btn-info" style="width: 120px" value="Save" id="form5">
            </div>

            <!------------------------------------------------------------------------>

            <div style="position: absolute; left: 27%; top: 20%; width: 60%; height: 80%"> 
                <form action="deleteFuelDetail" method="post">
                    <table class="table">
                        <thead class="black white-text">
                            <tr>
                                <th scope="col">Cheque No</th>
                                <th scope="col">Client Name</th>
                                <th scope="col">Cheque Date</th>
                                <th scope="col">Bank</th>
                                <th scope="col">Record Added Date</th>
                                <th scope="col">Amount</th>
                                <th scope="col">Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ResultSet rset2 = chequeDetailController.getAllChequeDetails();
                                while (rset2.next()) {
                            %>
                            <!--cheque_detail_id, , , , 
                            , , cheque_detail_account_pay_only, , 
                            cheque_detail_user_id, , cheque_detail_detail-->
                            <tr>                            
                                <td><%= rset2.getString("cheque_detail_cheque_number")%></td>
                                <td><%= rset2.getString("cheque_detail_client_name")%></td>
                                <td><%= rset2.getDate("cheque_detail_effective_date")%></td>
                                <td><%= rset2.getString("cheque_detail_bank")%></td>
                                <td><%= rset2.getDate("cheque_detail_current_date")%></td>
                                <td><%= rset2.getString("cheque_detail_amount")%></td>
                                <td><%= rset2.getString("cheque_detail_detail")%></td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </form>
            </div>
        </form>
    </body>
</html>
