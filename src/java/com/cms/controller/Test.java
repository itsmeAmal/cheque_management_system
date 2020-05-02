/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chamalki Madushika
 */
public class Test {
    
    
    public static void main(String[] args) {
        try {
            userController.addUser("chamalki", "gachamalki@gmail.com", "chamalki123", "Test", 1);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
