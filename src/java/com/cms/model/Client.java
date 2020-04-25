/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.model;

/**
 *
 * @author Chamalki Madushika
 */
public class Client {
 
    private int clientDetailId;
    private String clinetDetailName;
    private String clientDetailContactNo;
    private int clientDetailStatus;
    private String clientDetailDetail;

    /**
     * @return the clientDetailId
     */
    public int getClientDetailId() {
        return clientDetailId;
    }

    /**
     * @param clientDetailId the clientDetailId to set
     */
    public void setClientDetailId(int clientDetailId) {
        this.clientDetailId = clientDetailId;
    }

    /**
     * @return the clinetDetailName
     */
    public String getClinetDetailName() {
        return clinetDetailName;
    }

    /**
     * @param clinetDetailName the clinetDetailName to set
     */
    public void setClinetDetailName(String clinetDetailName) {
        this.clinetDetailName = clinetDetailName;
    }

    /**
     * @return the clientDetailContactNo
     */
    public String getClientDetailContactNo() {
        return clientDetailContactNo;
    }

    /**
     * @param clientDetailContactNo the clientDetailContactNo to set
     */
    public void setClientDetailContactNo(String clientDetailContactNo) {
        this.clientDetailContactNo = clientDetailContactNo;
    }

    /**
     * @return the clientDetailStatus
     */
    public int getClientDetailStatus() {
        return clientDetailStatus;
    }

    /**
     * @param clientDetailStatus the clientDetailStatus to set
     */
    public void setClientDetailStatus(int clientDetailStatus) {
        this.clientDetailStatus = clientDetailStatus;
    }

    /**
     * @return the clientDetailDetail
     */
    public String getClientDetailDetail() {
        return clientDetailDetail;
    }

    /**
     * @param clientDetailDetail the clientDetailDetail to set
     */
    public void setClientDetailDetail(String clientDetailDetail) {
        this.clientDetailDetail = clientDetailDetail;
    }
    
}
