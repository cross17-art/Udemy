package com.company;

public class Task15 {
    public boolean isPalindrome(int number) {


        number = number < 0 ? number * -1 : number;

        String str_number = String.valueOf(number);
        String revers = "";
        for (int i = str_number.length(); i > 0; i--) {
            revers += str_number.charAt(i - 1);
        }
        return str_number.equals(revers);
    }


}

