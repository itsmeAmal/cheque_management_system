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
public class clientDaoImpl implements clientDao {

    private String selectQuery = "select client_detail_id, client_detail_name, client_detail_contact_no, client_detail_status, client_detail_detail, client_detail_nic from client_detail";

    @Override
    public boolean addClient(Client client) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into client_detail (client_detail_name, client_detail_contact_no, client_detail_status, client_detail_detail, client_detail_nic) "
                + "values (?,?,?,?,?)");
        ps.setString(1, client.getClientDetailName());
        ps.setString(2, client.getClientDetailContactNo());
        ps.setInt(3, Client.CLIENT_STATUS_ACTIVE);
        ps.setString(4, client.getClientDetailDetail());
        ps.setString(5, client.getClientDetailNic());
        ps.executeUpdate();
        ps.close();
        return true;
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
    
    public boolean changeClientStatus(int clientId, int clientCurrentStatus)throws SQLException{
        int clientStatus = 0;
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update client_detail set client_detail_status=? where client_detail_id=?");
        if (clientCurrentStatus==Client.CLIENT_STATUS_ACTIVE) {
            clientStatus = Client.CLIENT_STATUS_INACTIVE;
            System.out.println("if");
        }else if(clientCurrentStatus==Client.CLIENT_STATUS_INACTIVE){
            clientStatus = Client.CLIENT_STATUS_ACTIVE;
            System.out.println("else");
        }
        ps.setInt(1, clientStatus);
        ps.setInt(2, clientId);
        ps.executeUpdate();
        return true;
    }

}
