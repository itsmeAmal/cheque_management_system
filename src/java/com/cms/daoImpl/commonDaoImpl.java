/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.daoImpl;

import com.cms.controller.commonConstants;
import com.cms.controller.commonController;
import com.cms.controller.userController;
import com.cms.dao.commonDao;
import com.cms.databaseConnection.DatabaseConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class commonDaoImpl implements commonDao {

    @Override
    public ResultSet getResultByAttribute(String selectQuery, String attribute, String condition, String value) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        System.out.println(selectQuery + commonConstants.Sql.WHERE + attribute + condition
                + commonConstants.Sql.PARAMETER);
        PreparedStatement ps = con.prepareStatement(selectQuery + commonConstants.Sql.WHERE + attribute + condition
                + commonConstants.Sql.PARAMETER);

        ps.setString(1, value);
        ResultSet rst = ps.executeQuery();
        return rst;
    }

    @Override
    public ResultSet getAllRecords(String selectQuery) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement(selectQuery);
        ResultSet rst = ps.executeQuery();
        return rst;
    }

    public int getUserCount() throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("SELECT count(user_id) as total_users FROM user");
        ResultSet rset = ps.executeQuery();
        int userCount = 0;
        while (rset.next()) {
            userCount = rset.getInt("total_users");
        }
        return userCount;
    }

    public int getClientCount() throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select count(client_detail_id) as client_count from client_detail");
        ResultSet rset = ps.executeQuery();
        int clientCount = 0;
        while (rset.next()) {
            clientCount = rset.getInt("client_count");
        }
        return clientCount;
    }

    public boolean loginValidation(String email, String password) throws SQLException {
        ResultSet rset = userController.getUserByOneAttribute("user_email", commonConstants.Sql.EQUAL, email);
        String rsetPassword = null;
        boolean status = false;
        while (rset.next()) {
            rsetPassword = rset.getString("user_password");
        }
        if (password.equalsIgnoreCase(rsetPassword)) {
            status = true;
        }
        return status;
    }

    public BigDecimal getMonthlyChequeDepositValue(int month) throws SQLException {
        BigDecimal value = BigDecimal.ZERO;
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select month(cheque_detail_effective_date) as cheque_month,"
                + " sum(cheque_detail_amount) as total_amount from cheque_detail where month(cheque_detail_effective_date)=? "
                + " and cheque_detail_detail='Received' group by cheque_month");
        ps.setInt(1, month);
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            value = rset.getBigDecimal("total_amount");
        }
        return value;
    }
}
