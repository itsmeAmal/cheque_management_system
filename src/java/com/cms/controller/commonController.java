/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

import com.cms.daoImpl.commonDaoImpl;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class commonController {

    public static int getUserCount() throws SQLException {
        return new commonDaoImpl().getUserCount();
    }

    public static int getClientCount() throws SQLException {
        return new commonDaoImpl().getClientCount();
    }

    public static boolean loginValidation(String email, String password) throws SQLException {
        return new commonDaoImpl().loginValidation(email, password);
    }

}
