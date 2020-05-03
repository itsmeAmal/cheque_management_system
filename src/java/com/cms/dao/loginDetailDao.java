/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.dao;

import com.cms.model.ChequeDetail;
import com.cms.model.LoginDetail;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public interface loginDetailDao {
    
    void addLoginDetail(LoginDetail loginDetail)throws SQLException;
    
    ResultSet getAllLoginDetails()throws SQLException;
    
    ResultSet getLoginDetailByOneAttribute(String attribute, String condition, String value)throws SQLException;
    
    boolean deleteLoginDetail(int loginDetailId)throws SQLException;
}
