/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.dao;

import com.cms.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public interface userDao {
    
    boolean addUser(User user)throws SQLException;
    
    ResultSet getAllUsers()throws SQLException;
    
    ResultSet getUserByOneAttribute(String attribute, String condition, String value)throws SQLException;
    
    boolean deleteUser(int userId)throws SQLException;
    
}
