/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.daoImpl;

import com.cms.dao.loginDetailDao;
import com.cms.databaseConnection.DatabaseConnection;
import com.cms.model.LoginDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class loginDetailDaoImpl implements loginDetailDao{
    
    private String selectQuery = "select login_detail_id, login_detail_login_date, login_detail_user_id, login_detail_logout_date, login_detail_status, login_detail_detail from login_detail";

    @Override
    public void addLoginDetail(LoginDetail loginDetail) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into login_detail ( login_detail_user_id, login_detail_status,"
                + " login_detail_detail) values (?,?,?)");
        ps.setInt(1, loginDetail.getLoginDetailUserId());
        ps.setInt(2, LoginDetail.LOGIN_DETAIL_STATUS_ACTIVE);
        ps.setString(3, loginDetail.getLoginDetailDetail());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public ResultSet getAllLoginDetails() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getLoginDetailByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

    @Override
    public boolean deleteLoginDetail(int loginDetailId) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from login_detail where login_detail_id=?");
        ps.setInt(1, loginDetailId);
        ps.executeUpdate();
        return true;
    }
    
}
