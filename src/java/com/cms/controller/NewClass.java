/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.controller;

/**
 *
 * @author Chamalki Madushika
 */
public class NewClass {

    private String numberBetweenZeroAndTen(int number) {
        String firstNumberFromLast = "";
        if (number == 0) {
            firstNumberFromLast = "ZERO";
        } else if (number == 1) {
            firstNumberFromLast = "ONE";
        } else if (number == 2) {
            firstNumberFromLast = "TWO";
        } else if (number == 3) {
            firstNumberFromLast = "THREE";
        } else if (number == 4) {
            firstNumberFromLast = "FOUR";
        } else if (number == 5) {
            firstNumberFromLast = "FIVE";
        } else if (number == 6) {
            firstNumberFromLast = "SIX";
        } else if (number == 7) {
            firstNumberFromLast = "SEVEN";
        } else if (number == 8) {
            firstNumberFromLast = "EIGHT";
        } else if (number == 9) {
            firstNumberFromLast = "NINE";
        }
        return firstNumberFromLast;
    }

    private String numberBetweentenAndTwenty(int number) {
        String SecondNumberFromLast = "";
        if (number == 11) {
            SecondNumberFromLast = "ELEVEN";
        } else if (number == 12) {
            SecondNumberFromLast = "TWELVE";
        } else if (number == 13) {
            SecondNumberFromLast = "THIRTEEN";
        } else if (number == 14) {
            SecondNumberFromLast = "FOURTEEN";
        } else if (number == 15) {
            SecondNumberFromLast = "FIFTEEN";
        } else if (number == 16) {
            SecondNumberFromLast = "SIXTEEN";
        } else if (number == 17) {
            SecondNumberFromLast = "SEVENTEEN";
        } else if (number == 18) {
            SecondNumberFromLast = "EIGHTEEN";
        } else if (number == 19) {
            SecondNumberFromLast = "NINETEEN";
        }
        return SecondNumberFromLast;
    }

    private String tenMultiplicationNumbers(int number) {
        String SecondNumberFromLast = "";
        if (number == 2) {
            SecondNumberFromLast = "TWENTY";
        } else if (number == 3) {
            SecondNumberFromLast = "THIRTY";
        } else if (number == 4) {
            SecondNumberFromLast = "FOURTY";
        } else if (number == 5) {
            SecondNumberFromLast = "FIFTY";
        } else if (number == 6) {
            SecondNumberFromLast = "SIXTY";
        } else if (number == 7) {
            SecondNumberFromLast = "SEVENTY";
        } else if (number == 8) {
            SecondNumberFromLast = "EIGHTY";
        } else if (number == 9) {
            SecondNumberFromLast = "NINETY";
        }
        return SecondNumberFromLast;
    }

    private int HUNDRED = 100;

    private int THOUSAND = 1000;

//    private String oneToTwentyNumbersConversion(int number) {
//
//    }
    private String numberToTxtCalculation(int number) {
        int length;
        String numberString = Integer.toString(number);
        length = Integer.toString(number).length();
        String outPut = "";
        if (length == 1) {
            outPut = numberBetweenZeroAndTen(number);
        } else if (length == 2) {
            if (number > 10 && number < 20) {
                outPut = numberBetweentenAndTwenty(number);
            } else if (number > 19 && number < 100) {
                String secondNumber = numberString.substring(1, 2);
                String firstNumber = numberString.substring(0, 1);
                outPut = tenMultiplicationNumbers(Integer.valueOf(firstNumber))
                        + " " + (numberBetweenZeroAndTen(Integer.valueOf(secondNumber)).
                                equalsIgnoreCase("ZERO") ? "" : numberBetweenZeroAndTen(Integer.valueOf(secondNumber)));
            }
        } else if (length == 3) {
            if (number > 10 && number < 20) {
                outPut = numberBetweentenAndTwenty(number);
            } else if (number > 19 && number < 100) {
                String secondNumber = numberString.substring(1, 2);
                String firstNumber = numberString.substring(0, 1);
                outPut = tenMultiplicationNumbers(Integer.valueOf(firstNumber))
                        + " " + (numberBetweenZeroAndTen(Integer.valueOf(secondNumber)).
                                equalsIgnoreCase("ZERO") ? "" : numberBetweenZeroAndTen(Integer.valueOf(secondNumber)));
            } else if (number > 99 && number < 999) {
                String firstNumber = numberString.substring(0, 1);
                String secondNumber = numberString.substring(1, 2);
                String thirdNumber = numberString.substring(2, 3);

            }
        }
        return outPut;
    }

    public static void main(String[] args) {
        NewClass cls = new NewClass();
        String value = cls.numberToTxtCalculation(46);
        System.out.println(value);
    }

}
