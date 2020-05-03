/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.daoImpl;

import com.cms.dao.userDao;
import com.cms.databaseConnection.DatabaseConnection;
import com.cms.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class userDaoImpl implements userDao{
    
    private String selectQuery="select user_id, user_name, user_email, user_password, user_status, user_detail, user_type from user";

    @Override
    public boolean addUser(User user) throws SQLException {
        Connection con=DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into user (user_name, user_email, user_password, user_status, user_detail, user_type) values (?,?,?,?,?,?)");
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getUserEmail());
        ps.setString(3, user.getUserPassword());
        ps.setInt(4, User.USER_STATUS_ACTIVE);
        ps.setString(5, user.getUserDetail());
        ps.setInt(6, user.getUserType());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public ResultSet getAllUsers() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getUserByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

    @Override
    public boolean deleteUser(int userId) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from user where user_id=?");
        ps.setInt(1, userId);
        ps.executeUpdate();
        return true;
    }
    
}
