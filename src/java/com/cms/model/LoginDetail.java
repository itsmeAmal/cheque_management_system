/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.model;

import java.sql.Timestamp;

/**
 *
 * @author Chamalki Madushika
 */
public class LoginDetail {
    
    public static int LOGIN_DETAIL_STATUS_ACTIVE=1;
    public static int LOGIN_DETAIL_STATUS_INACTIVE=0;
    
    private int loginDetailId;
    private Timestamp loginDetailLoginDate;
    private int loginDetailUserId;
    private Timestamp loginDetailLogoutDate;
    private int loginDetailStatus;
    private String loginDetailDetail;

    /**
     * @return the loginDetailId
     */
    public int getLoginDetailId() {
        return loginDetailId;
    }

    /**
     * @param loginDetailId the loginDetailId to set
     */
    public void setLoginDetailId(int loginDetailId) {
        this.loginDetailId = loginDetailId;
    }

    /**
     * @return the loginDetailLoginDate
     */
    public Timestamp getLoginDetailLoginDate() {
        return loginDetailLoginDate;
    }

    /**
     * @param loginDetailLoginDate the loginDetailLoginDate to set
     */
    public void setLoginDetailLoginDate(Timestamp loginDetailLoginDate) {
        this.loginDetailLoginDate = loginDetailLoginDate;
    }

    /**
     * @return the loginDetailUserId
     */
    public int getLoginDetailUserId() {
        return loginDetailUserId;
    }

    /**
     * @param loginDetailUserId the loginDetailUserId to set
     */
    public void setLoginDetailUserId(int loginDetailUserId) {
        this.loginDetailUserId = loginDetailUserId;
    }

    /**
     * @return the loginDetailLogoutDate
     */
    public Timestamp getLoginDetailLogoutDate() {
        return loginDetailLogoutDate;
    }

    /**
     * @param loginDetailLogoutDate the loginDetailLogoutDate to set
     */
    public void setLoginDetailLogoutDate(Timestamp loginDetailLogoutDate) {
        this.loginDetailLogoutDate = loginDetailLogoutDate;
    }

    /**
     * @return the loginDetailStatus
     */
    public int getLoginDetailStatus() {
        return loginDetailStatus;
    }

    /**
     * @param loginDetailStatus the loginDetailStatus to set
     */
    public void setLoginDetailStatus(int loginDetailStatus) {
        this.loginDetailStatus = loginDetailStatus;
    }

    /**
     * @return the loginDetailDetail
     */
    public String getLoginDetailDetail() {
        return loginDetailDetail;
    }

    /**
     * @param loginDetailDetail the loginDetailDetail to set
     */
    public void setLoginDetailDetail(String loginDetailDetail) {
        this.loginDetailDetail = loginDetailDetail;
    }
}
