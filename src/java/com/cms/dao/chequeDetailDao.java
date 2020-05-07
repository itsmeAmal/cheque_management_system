/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.dao;

import com.cms.model.ChequeDetail;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public interface chequeDetailDao {
    
    boolean addChequeDetail(ChequeDetail chequeDetail)throws SQLException;
    
    ResultSet getAllChequeDetails()throws SQLException;
    
    ResultSet getChequeDetailByOneAttribute(String attribute, String condition, String value)throws SQLException;
    
    boolean deleteChequeDetail(int chequeDetailId)throws SQLException;
    
}
