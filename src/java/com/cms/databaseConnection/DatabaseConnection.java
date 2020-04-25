/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chamalki Madushika
 */
public class DatabaseConnection {

    private DatabaseConnection(){
    }
    
    private static String databaseName = "cheque_management_system";
    private static String url = "jdbc:mysql://localhost:3306/cheque_management_system";
    private static String user = "root";
    private static String password = "1234";

    private static Connection con = null;

    public static Connection getDatabaseConnection() throws SQLException {
        if (con == null) {
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
            }
        }
        return con;
    }

}
