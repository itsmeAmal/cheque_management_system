/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.dao;

import com.cms.model.Client;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public interface clientDao {

    boolean addClient(Client client) throws SQLException;

    ResultSet getAllClients() throws SQLException;

    ResultSet getClientByOneAttribute(String attribute, String condition, String value) throws SQLException;

    boolean deleteClient(int clientId) throws SQLException;

}
