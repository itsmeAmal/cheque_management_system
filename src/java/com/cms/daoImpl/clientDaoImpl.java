/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.daoImpl;

import com.cms.dao.clientDao;
import com.cms.databaseConnection.DatabaseConnection;
import com.cms.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class clientDaoImpl implements clientDao{
    
    private String selectQuery="select client_detail_id, client_detail_name, client_detail_contact_no, client_detail_status, client_detail_detail from client";

    @Override
    public void addClient(Client client) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into client (client_detail_name, client_detail_contact_no, client_detail_status, client_detail_detail) "
                + "values (?,?,?,?)");
        ps.setString(1, client.getClientDetailName());
        ps.setString(2, client.getClientDetailContactNo());
        ps.setInt(3, Client.CLIENT_STATUS_ACTIVE);
        ps.setString(4, client.getClientDetailDetail());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public ResultSet getAllClients() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getClientByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

    @Override
    public boolean deleteClient(int clientId) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from client_detail where client_detail_id=?");
        ps.setInt(1, clientId);
        ps.executeUpdate();
        return true;
    }
    
}
