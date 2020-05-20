/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.model;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Chamalki Madushika
 */
public class ChequeDetail {
    
    public static int CHEQUE_DETAIL_ACCOUNT_PAY_ONLY=1;
    public static int CHEQUE_DETAIL_NOT_ACCOUNT_PAY=0;
    
    public static int CHEQUE_DETAIL_STATUS_ACTIVE=1;
    public static int CHEQUE_DETAIL_STATUS_INACTIVE=0;

    private int chequeDetailId;
    private Date chequeDetailCurrentDate;
    private String chequeDetailChequeNumber;
    private String chequeDetailBank;
    private BigDecimal chequeDetailAmount;
    private Date chequeDetailEffectiveDate;
    private int chequeDetailAccountPayOnly;
    private String chequeDetailClientName;
    private int chequeDetailUserId;
    private int chequeDetailStatus;
    private String chequeDetailDetail;

    /**
     * @return the chequeDetailId
     */
    public int getChequeDetailId() {
        return chequeDetailId;
    }

    /**
     * @param chequeDetailId the chequeDetailId to set
     */
    public void setChequeDetailId(int chequeDetailId) {
        this.chequeDetailId = chequeDetailId;
    }

    /**
     * @return the chequeDetailCurrentDate
     */
    public Date getChequeDetailCurrentDate() {
        return chequeDetailCurrentDate;
    }

    /**
     * @param chequeDetailCurrentDate the chequeDetailCurrentDate to set
     */
    public void setChequeDetailCurrentDate(Date chequeDetailCurrentDate) {
        this.chequeDetailCurrentDate = chequeDetailCurrentDate;
    }

    /**
     * @return the chequeDetailChequeNumber
     */
    public String getChequeDetailChequeNumber() {
        return chequeDetailChequeNumber;
    }

    /**
     * @param chequeDetailChequeNumber the chequeDetailChequeNumber to set
     */
    public void setChequeDetailChequeNumber(String chequeDetailChequeNumber) {
        this.chequeDetailChequeNumber = chequeDetailChequeNumber;
    }

    /**
     * @return the chequeDetailBank
     */
    public String getChequeDetailBank() {
        return chequeDetailBank;
    }

    /**
     * @param chequeDetailBank the chequeDetailBank to set
     */
    public void setChequeDetailBank(String chequeDetailBank) {
        this.chequeDetailBank = chequeDetailBank;
    }

    /**
     * @return the chequeDetailAmount
     */
    public BigDecimal getChequeDetailAmount() {
        return chequeDetailAmount;
    }

    /**
     * @param chequeDetailAmount the chequeDetailAmount to set
     */
    public void setChequeDetailAmount(BigDecimal chequeDetailAmount) {
        this.chequeDetailAmount = chequeDetailAmount;
    }

    /**
     * @return the chequeDetailEffectiveDate
     */
    public Date getChequeDetailEffectiveDate() {
        return chequeDetailEffectiveDate;
    }

    /**
     * @param chequeDetailEffectiveDate the chequeDetailEffectiveDate to set
     */
    public void setChequeDetailEffectiveDate(Date chequeDetailEffectiveDate) {
        this.chequeDetailEffectiveDate = chequeDetailEffectiveDate;
    }

    /**
     * @return the chequeDetailAccountPayOnly
     */
    public int getChequeDetailAccountPayOnly() {
        return chequeDetailAccountPayOnly;
    }

    /**
     * @param chequeDetailAccountPayOnly the chequeDetailAccountPayOnly to set
     */
    public void setChequeDetailAccountPayOnly(int chequeDetailAccountPayOnly) {
        this.chequeDetailAccountPayOnly = chequeDetailAccountPayOnly;
    }

    /**
     * @return the chequeDetailUserId
     */
    public int getChequeDetailUserId() {
        return chequeDetailUserId;
    }

    /**
     * @param chequeDetailUserId the chequeDetailUserId to set
     */
    public void setChequeDetailUserId(int chequeDetailUserId) {
        this.chequeDetailUserId = chequeDetailUserId;
    }

    /**
     * @return the chequeDetailStatus
     */
    public int getChequeDetailStatus() {
        return chequeDetailStatus;
    }

    /**
     * @param chequeDetailStatus the chequeDetailStatus to set
     */
    public void setChequeDetailStatus(int chequeDetailStatus) {
        this.chequeDetailStatus = chequeDetailStatus;
    }

    /**
     * @return the chequeDetailDetail
     */
    public String getChequeDetailDetail() {
        return chequeDetailDetail;
    }

    /**
     * @param chequeDetailDetail the chequeDetailDetail to set
     */
    public void setChequeDetailDetail(String chequeDetailDetail) {
        this.chequeDetailDetail = chequeDetailDetail;
    }

    /**
     * @return the chequeDetailClientName
     */
    public String getChequeDetailClientName() {
        return chequeDetailClientName;
    }

    /**
     * @param chequeDetailClientName the chequeDetailClientName to set
     */
    public void setChequeDetailClientName(String chequeDetailClientName) {
        this.chequeDetailClientName = chequeDetailClientName;
    }
    
}
