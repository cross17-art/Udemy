package com.company;

public class Task16 {

    public int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1;
        }
        int firstnumber =0;
        int last_number = number%10;
        while (number>0){
            firstnumber=number;
            number/=10;
        }
        return firstnumber+last_number;
//        return (number%10 + number/(int)Math.pow(10,digitCount));
    }
}
