/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

import com.cms.daoImpl.commonDaoImpl;
import com.cms.model.User;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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

    public static java.sql.Date getCurrentJavaSqlDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }

    public static java.sql.Time getCurrentJavaSqlTime() {
        java.util.Date date = new java.util.Date();
        return new java.sql.Time(date.getTime());
    }

    public static BigDecimal getBigDecimalOrZeroFromString(String value) {
        if (value != null) {
            value = value.replaceAll(",", "");
        }
        if (isBigDecimal(value)) {
            return new BigDecimal(value);
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static boolean isBigDecimal(String value) {
        try {
            if (value != null) {
                value = value.replaceAll(",", "");
            }
            new BigDecimal(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static BigDecimal getMonthlyChequeDepositValue(int month) throws SQLException {
        return new commonDaoImpl().getMonthlyChequeDepositValue(month);
    }

    public static int getUserIntTypeByUserStringType(String userTypeString) {
        int userTypeInt = 0;
        if (userTypeString.equalsIgnoreCase("Admin")) {
            userTypeInt = User.USER_TYPE_ADMIN;
        } else if (userTypeString.equalsIgnoreCase("Manager")) {
            userTypeInt = User.USER_TYPE_MANAGER;
        } else if (userTypeString.equalsIgnoreCase("User")) {
            userTypeInt = User.USER_TYPE_USER;
        } else if (userTypeString.equalsIgnoreCase("Guest Account")) {
            userTypeInt = User.USER_TYPE_GUEST;
        }
        return userTypeInt;
    }

    public static Date getSqlDateByString(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return new Date(format.parse(date).getTime());
    }

}
