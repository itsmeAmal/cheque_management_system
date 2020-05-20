/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

import com.cms.daoImpl.loginDetailDaoImpl;
import com.cms.model.LoginDetail;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class loginDetailController {
    
    public static void addLoginDetail(int userId, String detail)throws SQLException{
        LoginDetail loginDetail = new LoginDetail();
        loginDetail.setLoginDetailUserId(userId);
        loginDetail.setLoginDetailDetail(detail);
        new loginDetailDaoImpl().addLoginDetail(loginDetail);
    }
    
    public static ResultSet getAllLoginDetails()throws SQLException{
        return new loginDetailDaoImpl().getAllLoginDetails();
    }
    
    public static ResultSet getLoginDetailByOneAttribute(String attribute, String condition, String value)throws SQLException{
        return new loginDetailDaoImpl().getLoginDetailByOneAttribute(attribute, condition, value);
    }
    
    public static LoginDetail getLoginDetailByResultSet(ResultSet rset)throws SQLException{
        LoginDetail loginDetail = null;
        while (rset.next()) {            
            loginDetail = new LoginDetail();
            loginDetail.setLoginDetailId(rset.getInt("login_detail_id"));
            loginDetail.setLoginDetailLoginDate(rset.getTimestamp("login_detail_login_date"));
            loginDetail.setLoginDetailUserId(rset.getInt("login_detail_user_id"));
            loginDetail.setLoginDetailLogoutDate(rset.getTimestamp("login_detail_logout_date"));
            loginDetail.setLoginDetailStatus(rset.getInt("login_detail_status"));
            loginDetail.setLoginDetailDetail(rset.getString("login_detail_detail"));
        }
        return loginDetail;
    }
    
    public static LoginDetail getLoginDetailByLoginDetailId(int loginDetailId)throws SQLException{
        ResultSet rset = getLoginDetailByOneAttribute("login_detail_id", commonConstants.Sql.EQUAL, Integer.toString(loginDetailId));
        return getLoginDetailByResultSet(rset);
    }
    
}
