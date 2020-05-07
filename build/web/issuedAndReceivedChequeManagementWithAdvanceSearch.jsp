<%-- 
    Document   : issuedAndReceivedChequeManagementWithAdvanceSearch
    Created on : Apr 30, 2020, 8:28:34 PM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Issued/Received Cheque Management</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <%@include file="navigationBar.jsp" %>
    </head>
    <body>
        <form action="#">
            <div style="position: absolute; left: 20%; top: 12%; width: 60%; height: 80%; background-color: #cccccc; z-index:-1">
            </div>
            <div style="position: absolute; left: 20%; top: 10%; width: 60%; height: 10%; background-color: #ffffff; z-index:-1">
                <div style="position: absolute; left: 2%; top: 40%; width: 15%; height: 10%;  z-index:-1">
                    <h5>Search by Name : </h5>
                </div>
                <div style="position: absolute; left: 15%; top: 40%; width: 20%; height: 10%">
                    <input type="text" class="form-control" id="search_by_name" placeholder="Search by Name" required>
                </div>
                <div style="position: absolute; left: 36%; top: 40%; width: 20%; height: 10%">
                    <button type="button" class="btn btn-primary">Search</button>
                </div>
                <div style="position: absolute; left: 46%; top: 40%; width: 20%; height: 10%">
                    <select class="form-control" name="cheque_type">
                        <option>Issued Cheques</option>
                        <option>Received Cheques</option>
                    </select>
                </div>
                <div style="position: absolute; left: 68%; top: 40%; width: 20%; height: 10%">
                    <button type="button" class="btn btn-primary">Filter by Status</button>
                </div>
                <div style="position: absolute; left: 92%; top: 40%; width: 20%; height: 10%">
                    <button type="button" class="btn btn-warning">Reset</button>
                </div>
            </div>

            <div class="container" style="position: absolute; left: 22%; top: 25%; width: 56%; height: 100%">
                <h4>Manage Issued Received Cheques</h4>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Date</th>
                            <th>Client Name</th>
                            <th>Cheque Number</th>
                            <th>Amount</th>
                            <th>Current Status</th>
                            <th>Issued/Received By</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="info">
                            <td>2020/05/01</td>
                            <td>chamalki</td>
                            <td>123456789</td>
                            <td>60000.00</td>
                            <td><div>
                                    <button type="button" class="btn btn-info">Status</button>
                                </div></td>
                            <td></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </form>
    </body>
</html>
