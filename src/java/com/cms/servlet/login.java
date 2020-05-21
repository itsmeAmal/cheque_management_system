/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.servlet;

import com.cms.controller.commonController;
import com.cms.controller.loginDetailController;
import com.cms.controller.userController;
import com.cms.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Amal
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

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
            User curUser = null;
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            HttpSession session = request.getSession();
            try {
                boolean status = commonController.loginValidation(email, password);
                if (status) {
                    curUser = userController.getUserByUserEmail(email);
                    session.setAttribute("loggedEmail", email);
                    session.setAttribute("loggedUser", curUser);
                    //---------------------------------------------
                    String browserDetails = request.getHeader("User-Agent");
                    String userAgent = browserDetails;
                    String user = userAgent.toLowerCase();

                    String os = "";
                    String browser = "";

                    //=================OS=======================
                    if (userAgent.toLowerCase().indexOf("windows") >= 0) {
                        os = "Windows";
                    } else if (userAgent.toLowerCase().indexOf("mac") >= 0) {
                        os = "Mac";
                    } else if (userAgent.toLowerCase().indexOf("x11") >= 0) {
                        os = "Unix";
                    } else if (userAgent.toLowerCase().indexOf("android") >= 0) {
                        os = "Android";
                    } else if (userAgent.toLowerCase().indexOf("iphone") >= 0) {
                        os = "IPhone";
                    } else {
                        os = "UnKnown, More-Info: " + userAgent;
                    }
                    //===============Browser===========================
                    if (user.contains("msie")) {
                        String substring = userAgent.substring(userAgent.indexOf("MSIE")).split(";")[0];
                        browser = substring.split(" ")[0].replace("MSIE", "IE") + "-" + substring.split(" ")[1];
                    } else if (user.contains("safari") && user.contains("version")) {
                        browser = (userAgent.substring(userAgent.indexOf("Safari")).split(" ")[0]).split("/")[0] + "-" + (userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
                    } else if (user.contains("opr") || user.contains("opera")) {
                        if (user.contains("opera")) {
                            browser = (userAgent.substring(userAgent.indexOf("Opera")).split(" ")[0]).split("/")[0] + "-" + (userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
                        } else if (user.contains("opr")) {
                            browser = ((userAgent.substring(userAgent.indexOf("OPR")).split(" ")[0]).replace("/", "-")).replace("OPR", "Opera");
                        }
                    } else if (user.contains("chrome")) {
                        browser = (userAgent.substring(userAgent.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
                    } else if ((user.indexOf("mozilla/7.0") > -1) || (user.indexOf("netscape6") != -1) || (user.indexOf("mozilla/4.7") != -1) || (user.indexOf("mozilla/4.78") != -1) || (user.indexOf("mozilla/4.08") != -1) || (user.indexOf("mozilla/3") != -1)) {
                        //browser=(userAgent.substring(userAgent.indexOf("MSIE")).split(" ")[0]).replace("/", "-");
                        browser = "Netscape-?";

                    } else if (user.contains("firefox")) {
                        browser = (userAgent.substring(userAgent.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
                    } else if (user.contains("rv")) {
                        browser = "IE-" + user.substring(user.indexOf("rv") + 3, user.indexOf(")"));
                    } else {
                        browser = "UnKnown, More-Info: " + userAgent;
                    }

                    loginDetailController.addLoginDetail(curUser.getUserId(), " User " + curUser.getUserName() + " - " + " browser " + browser + " - " + " os " + os);

                    if (curUser.getUserStatus() == User.USER_STATUS_ACTIVE) {
                        response.sendRedirect("dashboard.jsp");
                    } else {
                        response.sendRedirect("login.jsp");
                    }

                } else {
                    response.sendRedirect("login.jsp");
                }
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
