/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

import com.cms.daoImpl.userDaoImpl;
import com.cms.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class userController {

    public static boolean addUser(String userName, String email, String password, String detail, int type) throws SQLException {
        User user = new User();
        user.setUserName(userName);
        user.setUserEmail(email);
        user.setUserPassword(password);
        user.setUserDetail(detail);
        user.setUserType(type);
        user.setUserStatus(User.USER_STATUS_ACTIVE);
        return new userDaoImpl().addUser(user);
    }

    public static ResultSet getAllUsers() throws SQLException {
        return new userDaoImpl().getAllUsers();
    }

    public static ResultSet getUserByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new userDaoImpl().getUserByOneAttribute(attribute, condition, value);
    }

    public static User getUserByResultSet(ResultSet rset) throws SQLException {
        User user = null;
        while (rset.next()) {
            user = new User();
            user.setUserId(rset.getInt("user_id"));
            user.setUserName(rset.getString("user_name"));
            user.setUserEmail(rset.getString("user_email"));
            user.setUserPassword(rset.getString("user_password"));
            user.setUserStatus(rset.getInt("user_status"));
            user.setUserDetail(rset.getString("user_detail"));
            user.setUserType(rset.getInt("user_type"));
        }
        return user;
    }

    public static User getUserByUserId(int userId) throws SQLException {
        ResultSet rset = getUserByOneAttribute("user_id", commonConstants.Sql.EQUAL, Integer.toString(userId));
        return getUserByResultSet(rset);
    }

    public static User getUserByUserEmail(String email) throws SQLException {
        ResultSet rset = getUserByOneAttribute("user_email", commonConstants.Sql.EQUAL, email);
        return getUserByResultSet(rset);
    }
    
    public static boolean changeUserStatus(int userId, int userCurrentStatus)throws SQLException{
        return new userDaoImpl().changeUserStatus(userId, userCurrentStatus);
    }
    
    public static boolean changeUserType(int userId, String userType)throws SQLException{
        return new userDaoImpl().changeUserType(userId, userType);
    }
}
