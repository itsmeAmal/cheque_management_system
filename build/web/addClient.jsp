<%-- 
    Document   : addClient
    Created on : Apr 27, 2020, 11:18:07 AM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Client Account</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <%@include file="navigationBar.jsp" %>
    </head>
    <body>
        <form action="#">
            <div style="position: absolute; left: 35%; top: 2%; width: 30%; height: 80%; background-color: #cccccc">
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 7%; width: 20%; height: 15px">
                <h4>CREATE CLIENT ACCOUNT</h4>
            </div>

            <div class="form-group" style="position: absolute; left: 40%; top: 15%; width: 20%; height: 15px">

                <input type="text" class="form-control" id="clnt" placeholder="Client Name" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 23%; width: 20%; height: 15px">

                <input type="text" class="form-control" id="contact_no" placeholder="Contact No" required>
            </div>
            
            <div class="form-group" style="position: absolute; left: 40%; top: 31%; width: 20%; height: 15px">

                <input type="text" class="form-control" id="nic" placeholder="NIC">
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 39%; width: 20%; height: 15px">

                <input type="text" class="form-control" id="note" placeholder="Note">
            </div>
            

            <div class="form-group" style="position: absolute; left: 40%; top: 50%; width: 20%; height: 15px">
                <button type="button" class="btn btn-info">Create Account</button>
            </div>



        </form>
    </body>
</html>
