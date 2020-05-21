/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

import com.cms.daoImpl.chequeDetailDaoImpl;
import com.cms.model.ChequeDetail;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class chequeDetailController {

    public static boolean addChequeDetail(Date currentDate, String chequeNumber, String bank, BigDecimal amount, Date effectiveDate, String clientName, int userId,
            String detail, int accountPayOnly) throws SQLException {
        ChequeDetail chequeDeatail = new ChequeDetail();
        chequeDeatail.setChequeDetailCurrentDate(currentDate);
        chequeDeatail.setChequeDetailChequeNumber(chequeNumber);
        chequeDeatail.setChequeDetailBank(bank);
        chequeDeatail.setChequeDetailAmount(amount);
        chequeDeatail.setChequeDetailEffectiveDate(effectiveDate);
        chequeDeatail.setChequeDetailClientName(clientName);
        chequeDeatail.setChequeDetailUserId(userId);
        chequeDeatail.setChequeDetailDetail(detail);
        chequeDeatail.setChequeDetailAccountPayOnly(accountPayOnly);
        chequeDeatail.setChequeDetailStatus(ChequeDetail.CHEQUE_DETAIL_STATUS_ACTIVE);
        return new chequeDetailDaoImpl().addChequeDetail(chequeDeatail);
    }

    public static ResultSet getAllChequeDetails() throws SQLException {
        return new chequeDetailDaoImpl().getAllChequeDetails();
    }

    public static ResultSet getChequeDetailByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new chequeDetailDaoImpl().getChequeDetailByOneAttribute(attribute, condition, value);
    }

    public static ChequeDetail getChequeDetailByResultSet(ResultSet rset) throws SQLException {
        ChequeDetail chequeDetail = null;
        while (rset.next()) {
            chequeDetail = new ChequeDetail();
            chequeDetail.setChequeDetailId(rset.getInt("cheque_detail_id"));
            chequeDetail.setChequeDetailCurrentDate(rset.getDate("cheque_detail_current_date"));
            chequeDetail.setChequeDetailChequeNumber(rset.getString("cheque_detail_cheque_number"));
            chequeDetail.setChequeDetailBank(rset.getString("cheque_detail_bank"));
            chequeDetail.setChequeDetailAmount(rset.getBigDecimal("cheque_detail_amount"));
            chequeDetail.setChequeDetailEffectiveDate(rset.getDate("cheque_detail_effective_date"));
            chequeDetail.setChequeDetailAccountPayOnly(rset.getInt("cheque_detail_account_pay_only"));
            chequeDetail.setChequeDetailClientName(rset.getString("cheque_detail_client_name"));
            chequeDetail.setChequeDetailUserId(rset.getInt("cheque_detail_user_id"));
            chequeDetail.setChequeDetailStatus(rset.getInt("cheque_detail_status"));
            chequeDetail.setChequeDetailDetail(rset.getString("cheque_detail_detail"));
        }
        return chequeDetail;
    }

    public static ChequeDetail getChequeDetailByChequeDetailId(int chequeDetailId) throws SQLException {
        ResultSet rset = getChequeDetailByOneAttribute("cheque_detail_id", commonConstants.Sql.EQUAL, Integer.toString(chequeDetailId));
        return getChequeDetailByResultSet(rset);
    }

    public static int getchequeCountForToday(String chequeStatus) throws SQLException {
        return new chequeDetailDaoImpl().getchequeCountForToday(chequeStatus);
    }
}
