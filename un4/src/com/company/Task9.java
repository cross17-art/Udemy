package com.company;

public class Task9 {

    public void printYearsAndDays(long minutes) {
        if (minutes <= 0) {
            System.out.println("Invalid");
            System.exit(0);
        }


        final long M_day = 60 * 24;
        final long M_year = 60 * 24 * 365;
        int years = (int) Math.floor(minutes / M_year);
        int days = (int) ((minutes - years * M_year) / M_day);
        System.out.println(minutes + "min = " + years + "y and " + days + "d");


    }
}
