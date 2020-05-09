<%@page import="com.cms.controller.commonController"%>
<%@page import="java.math.BigDecimal"%>
<!DOCTYPE HTML>
<html>
    <head>
        <%
            BigDecimal janValue = BigDecimal.ZERO;
            BigDecimal febValue = BigDecimal.ZERO;
            BigDecimal marValue = BigDecimal.ZERO;
            BigDecimal aprValue = BigDecimal.ZERO;
            BigDecimal mayValue = BigDecimal.ZERO;
            BigDecimal junValue = BigDecimal.ZERO;
            BigDecimal julValue = BigDecimal.ZERO;
            BigDecimal augValue = BigDecimal.ZERO;
            BigDecimal sepValue = BigDecimal.ZERO;
            BigDecimal octValue = BigDecimal.ZERO;
            BigDecimal novValue = BigDecimal.ZERO;
            BigDecimal decValue = BigDecimal.ZERO;

            janValue = commonController.getMonthlyChequeDepositValue(1);
            febValue = commonController.getMonthlyChequeDepositValue(2);
            marValue = commonController.getMonthlyChequeDepositValue(3);
            aprValue = commonController.getMonthlyChequeDepositValue(4);
            mayValue = commonController.getMonthlyChequeDepositValue(5);
            junValue = commonController.getMonthlyChequeDepositValue(6);
            julValue = commonController.getMonthlyChequeDepositValue(7);
            augValue = commonController.getMonthlyChequeDepositValue(8);
            sepValue = commonController.getMonthlyChequeDepositValue(9);
            octValue = commonController.getMonthlyChequeDepositValue(10);
            novValue = commonController.getMonthlyChequeDepositValue(11);
            decValue = commonController.getMonthlyChequeDepositValue(12);
        %>
        <script>
            window.onload = function () {
                var chart = new CanvasJS.Chart("chartContainer", {
                    animationEnabled: true,
                    exportEnabled: true,
                    theme: "light2", // "light1", "light2", "dark1", "dark2"
                    title: {
                        text: "Annual Cheque Deposits Over Dates"
                    },
                    data: [{
                            type: "column", //change type to bar, line, area, pie, etc, column
                            //indexLabel: "{y}", //Shows y value on all Data Points
                            indexLabelFontColor: "#5A5757",
                            indexLabelFontSize: 16,
                            indexLabelPlacement: "outside",
                            dataPoints: [

                                {x: 10, y: <%= janValue%>, indexLabel: "Jan"},
                                {x: 20, y: <%= febValue%>, indexLabel: "Feb"},
                                {x: 30, y: <%= marValue%>, indexLabel: "Mar"},
                                {x: 40, y: <%= aprValue%>, indexLabel: "Apr"},
                                {x: 50, y: <%= mayValue%>, indexLabel: "May"},
                                {x: 60, y: <%= junValue%>, indexLabel: "Jun"},
                                {x: 70, y: <%= julValue%>, indexLabel: "Jul"},
                                {x: 80, y: <%= augValue%>, indexLabel: "Aug"},
                                {x: 90, y: <%= sepValue%>, indexLabel: "Sep"},
                                {x: 100, y: <%= octValue%>, indexLabel: "Oct"},
                                {x: 110, y: <%= novValue%>, indexLabel: "Nov"},
                                {x: 120, y: <%= decValue%>, indexLabel: "Dec"}
                            ]
                        }]
                });
                chart.render();
            }
        </script>
    </head>
    <body>
        <div id="chartContainer"  style="position: absolute; left: 20%; top: 60%;  height: 300px; width: 30%;"></div>
        <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
    </body>
</html>