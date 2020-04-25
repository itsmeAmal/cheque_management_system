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
    
    private String selectQuery="select user_id, user_name, user_email, user_password, user_status, user_detail from user";

    @Override
    public void addUser(User user) throws SQLException {
        Connection con=DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into user (user_name, user_email, user_password, user_status, user_detail) values (?,?,?,?,?)");
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getUserEmail());
        ps.setString(3, user.getUserPassword());
        ps.setInt(4, User.USER_STATUS_ACTIVE);
        ps.setString(5, user.getUserDetail());
        ps.executeUpdate();
        ps.close();
        
    }

    @Override
    public ResultSet getAllUsers() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getUserByOneAttribute(String attribute, String condition, String value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(int userId) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
