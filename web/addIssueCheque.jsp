<%-- 
    Document   : addIssueCheque
    Created on : Apr 27, 2020, 1:44:03 PM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Issue Cheque</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <%@include file="navigationBar.jsp" %>
    </head>
    <body>
        <form action="#">
            <div style="position: absolute; left: 20%; top: 2%; width: 60%; height: 80%; background-color: #cccccc">
            </div>
            <div style="position: absolute; left: 22%; top: 7%; width: 56%; height: 45%; background-color: #99ff99">

            </div>
            <div class="form-group" style="position: absolute; left: 25%; top: 10%; width: 20%; height: 15px">
                <h4>ISSUE CHEQUES</h4>
            </div>

            <div style="position: absolute; left: 25%; top: 15%; width: 20%; height: 15px">
                <h4>Bank</h4>
            </div>
            <div class="form-group" style="position: absolute; left: 25%; top: 20%; width: 15%; height: 15px">
                <div class="dropdown">
                    <div id="exp_month">
                        <select class="form-control" name="bank">
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
            <div style="position: absolute; left: 780px; top: 15%; width: 30%; height: 15px">
                <h4>Cheque Date</h4>
            </div>
            <!------1-->
            <div class="form-group" style="position: absolute; left: 780px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="d1" placeholder="D" required>
            </div>
            <!------2-->
            <div class="form-group" style="position: absolute; left: 830px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="d2" placeholder="D" required>
            </div>
            <!------3-->
            <div class="form-group" style="position: absolute; left: 880px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="m1" placeholder="M" required>
            </div>
            <!------4-->
            <div class="form-group" style="position: absolute; left: 930px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="m2" placeholder="M" required>
            </div>
            <!------5-->
            <div class="form-group" style="position: absolute; left: 980px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="y1" placeholder="Y" required>
            </div>
            <!------6-->
            <div class="form-group" style="position: absolute; left: 1030px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="y2" placeholder="Y" required>
            </div>
            <!------7-->
            <div class="form-group" style="position: absolute; left: 1080px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="y3" placeholder="Y" required>
            </div>
            <!------8-->
            <div class="form-group" style="position: absolute; left: 1130px; top: 20%; width: 40px; height: 15px">
                <input type="text" class="form-control" id="y4" placeholder="Y" required>
            </div>

            <div class="form-group" style="position: absolute; left: 25%; top: 28%; width: 5%; height: 15px">
                <h4>PAY</h4>
            </div>

            <div class="form-group" style="position: absolute; left: 28%; top: 28%; width: 30%; height: 15px">
                <div class="dropdown">
                    <div id="exp_month">
                        <select class="form-control" name="bank">
                            <option>Cargills Food City</option>
                            <option>Leaver Brothers</option>
                            <option>Punchi Banda</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="form-group" style="position: absolute; left: 59%; top: 28%; width: 10%; height: 15px">
                <h4>Or Bearer</h4>
            </div>
            <div class="form-group" style="position: absolute; left: 25%; top: 36%; width: 10%; height: 15px">
                <h4>Rupees...............................................................................</h4>
            </div>
            <div class="form-group" style="position: absolute; left: 57%; top: 36%; width: 10%; height: 15px">
                <h4>Rs:</h4>
            </div>
            <div class="form-group" style="position: absolute; left: 60%; top: 36%; width: 16%; height: 15px">
                <input type="text" class="form-control" id="rs" placeholder="Amount" required>
            </div>

            <div class="form-group" style="position: absolute; left: 1055px; top: 45%; width: 20%; height: 15px">
                <button type="button" class="btn btn-info">Issue Cheque</button>
            </div>
            <div class="form-group" style="position: absolute; left: 35%; top: 45%; width: 15%; height: 15px">
                <input type="text" class="form-control" id="chq_no" placeholder="Cheque Number" required>
            </div>
            <div class="form-group" style="position: absolute; left: 25%; top: 45%; width: 10%; height: 15px">
                <h4>Cheque Number</h4>
            </div>

            <div class="container" style="position: absolute; left: 22%; top: 55%; width: 56%; height: 100%">
                <h5>Cheque History</h5>

                <table class="table">
                    <thead>
                        <tr>
                            <th>Date</th>
                            <th>Cheque Number</th>
                            <th>Bank</th>
                            <th>Amount</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>

                        <tr class="info">
                            <td>2020/10/10</td>
                            <td>226455</td>
                            <td>Nations Trust</td>
                            <td>50000.00</td>
                            <td><div>
                                    <button type="button" class="btn btn-danger">Status</button>
                                </div></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </form>
    </body>
</html>
