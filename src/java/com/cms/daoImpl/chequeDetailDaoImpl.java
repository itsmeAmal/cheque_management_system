/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.daoImpl;

import com.cms.dao.chequeDetailDao;
import com.cms.databaseConnection.DatabaseConnection;
import com.cms.model.ChequeDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class chequeDetailDaoImpl implements chequeDetailDao{
    
    private String selectQuery="select cheque_detail_id, cheque_detail_current_date, cheque_detail_cheque_number, cheque_detail_bank, "
            + "cheque_detail_amount, cheque_detail_effective_date, cheque_detail_account_pay_only, cheque_detail_client_id, "
            + "cheque_detail_user_id, cheque_detail_status, cheque_detail_detail from chequeDetail";

    @Override
    public void addChequeDetail(ChequeDetail chequeDetail) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into chequeDetail (cheque_detail_current_date, cheque_detail_cheque_number,"
                + " cheque_detail_bank, cheque_detail_amount, cheque_detail_effective_date, cheque_detail_account_pay_only, cheque_detail_client_id,"
                + " cheque_detail_user_id, cheque_detail_status, cheque_detail_detail) values (?,?,?,?,?,?,?,?,?,?)");
        ps.setDate(1, chequeDetail.getChequeDetailCurrentDate());
        ps.setString(2, chequeDetail.getChequeDetailChequeNumber());
        ps.setString(3, chequeDetail.getChequeDetailBank());
        ps.setBigDecimal(4, chequeDetail.getChequeDetailAmount());
        ps.setDate(5, chequeDetail.getChequeDetailEffectiveDate());
        ps.setInt(6, chequeDetail.getChequeDetailAccountPayOnly());
        ps.setInt(7, chequeDetail.getChequeDetailClientId());
        ps.setInt(8, chequeDetail.getChequeDetailUserId());
        ps.setInt(9, ChequeDetail.CHEQUE_DETAIL_STATUS_ACTIVE);
        ps.setString(10, chequeDetail.getChequeDetailDetail());
        ps.executeUpdate();
        ps.close();
        
    }

    @Override
    public ResultSet getAllChequeDetails() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getChequeDetailByOneAttribute(String attribute, String condition, String value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteChequeDetail(int chequeDetailId) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
