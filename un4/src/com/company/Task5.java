package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Task5 {
    public void areEqualDecimalPlaces(double digit1, double digit2) {

        BigDecimal result1 = new BigDecimal(digit1);
        BigDecimal result2 = new BigDecimal(digit2);


        int mult = (int) Math.pow(10, 3);


        if (digit1 >= 0) {
            result1 = result1.setScale(3, RoundingMode.FLOOR);
        } else {
            result1 = result1.setScale(3, RoundingMode.CEILING);
        }

        if (digit2 >= 0) {
            result2 = result2.setScale(3, RoundingMode.FLOOR);
        } else {
            result2 = result2.setScale(3, RoundingMode.CEILING);
        }
//        double re1 = Math.ceil(digit1*mult)/mult;

        System.out.println("res1 " + result1);
//        System.out.println("re1 "+re1);
        System.out.println("res2 " + result2);

        System.out.println(result1.equals(result2));
    }

}
