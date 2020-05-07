/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.servlet;

import com.cms.controller.chequeDetailController;
import com.cms.controller.commonController;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Amal
 */
@WebServlet(name = "addIssueCheque", urlPatterns = {"/addIssueCheque"})
public class addIssueCheque extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            boolean status = false;
            
            String bank = request.getParameter("bank");
            String date1 = request.getParameter("date1");
            String date2 = request.getParameter("date2");
            String date3 = request.getParameter("date3");
            String date4 = request.getParameter("date4");
            String date5 = request.getParameter("date5");
            String date6 = request.getParameter("date6");
            String date7 = request.getParameter("date7");
            String date8 = request.getParameter("date8");

            String clientName = request.getParameter("client_name");
            String paymentAmount = request.getParameter("amount");
            String chequeNo = request.getParameter("cheque_no");
            
            String effectiveDate = date1+date2+"-"+date3+date4+"-"+date5+date6+date7+date8;
            try {
                status = chequeDetailController.addChequeDetail(commonController.getCurrentJavaSqlDate(), chequeNo, bank,
                        commonController.getBigDecimalOrZeroFromString(paymentAmount), commonController.getCurrentJavaSqlDate(), 0, 0, "TestDetail", 0);
                if(status){
                    response.sendRedirect("addIssueCheque.jsp");
                }else{
                    out.write("error...!");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(addIssueCheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
