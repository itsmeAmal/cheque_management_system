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
    </head>
    <body>
        <form action="#">
            <div style="position: absolute; left: 20%; top: 2%; width: 60%; height: 80%; background-color: #cccccc">
            </div>
            <div class="form-group" style="position: absolute; left: 25%; top: 7%; width: 20%; height: 15px">
                <h4>ISSUE CHEQUES</h4>
            </div>

            <div class="form-group" style="position: absolute; left: 25%; top: 15%; width: 15%; height: 15px">
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
            <div class="form-group" style="position: absolute; left: 40%; top: 23%; width: 20%; height: 15px">

                <input type="text" class="form-control" id="email" placeholder="Email" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 31%; width: 20%; height: 15px">

                <input type="password" class="form-control" id="pwd" placeholder="Password" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 37%; width: 20%; height: 15px">
                <h6>Use 8 or more characters with a mix of letters, numbers & symbols</h6>
            </div>

            <!-- Default unchecked -->
            <div class="custom-control custom-checkbox" style="position: absolute; left: 40%; top: 46%; width: 50px; height: 10px">
                <input type="checkbox" class="custom-control-input" id="defaultUnchecked">

            </div>
            <div style="position: absolute; left: 41%; top: 45%; width: 17%; height: 30px">
                <label for="defaultUnchecked"><h6>To create a User Account, you’ll need to agree to the Terms of Service.</h6></label>
            </div>

            <div class="form-group" style="position: absolute; left: 40%; top: 56%; width: 20%; height: 15px">
                <button type="button" class="btn btn-info">Create Account</button>
            </div>



        </form>
    </body>
</html>
