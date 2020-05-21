/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.daoImpl;

import com.cms.controller.commonController;
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
public class chequeDetailDaoImpl implements chequeDetailDao {

    private String selectQuery = "select cheque_detail_id, cheque_detail_current_date, cheque_detail_cheque_number, cheque_detail_bank, "
            + "cheque_detail_amount, cheque_detail_effective_date, cheque_detail_account_pay_only, cheque_detail_client_name, "
            + "cheque_detail_user_id, cheque_detail_status, cheque_detail_detail from cheque_detail";

    @Override
    public boolean addChequeDetail(ChequeDetail chequeDetail) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into cheque_detail (cheque_detail_current_date, cheque_detail_cheque_number,"
                + " cheque_detail_bank, cheque_detail_amount, cheque_detail_effective_date, cheque_detail_account_pay_only, cheque_detail_client_name,"
                + " cheque_detail_user_id, cheque_detail_status, cheque_detail_detail) values (?,?,?,?,?,?,?,?,?,?)");
        ps.setDate(1, chequeDetail.getChequeDetailCurrentDate());
        ps.setString(2, chequeDetail.getChequeDetailChequeNumber());
        ps.setString(3, chequeDetail.getChequeDetailBank());
        ps.setBigDecimal(4, chequeDetail.getChequeDetailAmount());
        ps.setDate(5, chequeDetail.getChequeDetailEffectiveDate());
        ps.setInt(6, chequeDetail.getChequeDetailAccountPayOnly());
        ps.setString(7, chequeDetail.getChequeDetailClientName());
        ps.setInt(8, chequeDetail.getChequeDetailUserId());
        ps.setInt(9, ChequeDetail.CHEQUE_DETAIL_STATUS_ACTIVE);
        ps.setString(10, chequeDetail.getChequeDetailDetail());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public ResultSet getAllChequeDetails() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getChequeDetailByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

    @Override
    public boolean deleteChequeDetail(int chequeDetailId) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from cheque_detail where cheque_detail_id=?");
        ps.setInt(1, chequeDetailId);
        ps.executeUpdate();
        return true;
    }

    public int getchequeCountForToday(String chaqueStatus) throws SQLException {
        int chequeDatedForToday = 0;
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("SELECT count(cheque_detail_id) as cheques_count from cheque_detail where cheque_detail_effective_date=? and "
                + "cheque_detail_detail=?");
        ps.setDate(1, commonController.getCurrentJavaSqlDate());
        ps.setString(2, chaqueStatus);
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            chequeDatedForToday = rset.getInt("cheques_count");
        }
        return chequeDatedForToday;
    }

}
