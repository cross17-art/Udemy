package com.company;

public class Task4 {
    public boolean isLeapYear(int year) {
        if (1 <= year && year <= 9999){

            return ((year % 4 == 0) && (year % 100 != 0) || ((year % 100 == 0) && (year % 400 == 0)));
        }
        else{
            return false;
        }
    }
}
