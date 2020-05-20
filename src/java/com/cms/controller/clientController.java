/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

import com.cms.daoImpl.clientDaoImpl;
import com.cms.model.Client;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class clientController {

    public static boolean addClient(String clientName, String contactNo, String nic, String detail) throws SQLException {
        Client client = new Client();
        client.setClientDetailName(clientName);
        client.setClientDetailContactNo(contactNo);
        client.setClientDetailNic(nic);
        client.setClientDetailDetail(detail);
        client.setClientDetailStatus(Client.CLIENT_STATUS_ACTIVE);
        System.out.println("inside control class ");
        return new clientDaoImpl().addClient(client);
    }

    public static ResultSet getAllClients() throws SQLException {
        return new clientDaoImpl().getAllClients();
    }

    public static ResultSet getClientByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new clientDaoImpl().getClientByOneAttribute(attribute, condition, value);
    }

    public static Client getClientByResultSet(ResultSet rset) throws SQLException {
        Client client = null;
        while (rset.next()) {
            client = new Client();
            client.setClientDetailId(rset.getInt("client_detail_id"));
            client.setClientDetailName(rset.getString("client_detail_name"));
            client.setClientDetailContactNo(rset.getString("client_detail_contact_no"));
            client.setClientDetailStatus(rset.getInt("client_detail_status"));
            client.setClientDetailDetail(rset.getString("client_detail_detail"));
            client.setClientDetailNic(rset.getString("client_detail_nic"));
        }
        return client;
    }

    public static Client getClientByClientId(int clientId) throws SQLException {
        ResultSet rset = getClientByOneAttribute("client_detail_id", commonConstants.Sql.EQUAL, Integer.toString(clientId));
        return getClientByResultSet(rset);
    }
    
    public static boolean changeClientStatus(int clientId, int clientCurrentStatus)throws SQLException{
        return new clientDaoImpl().changeClientStatus(clientId, clientCurrentStatus);
    }
}
