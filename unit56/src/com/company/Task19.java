package com.company;

public class Task19 {
    public boolean hasSameLastDigit(int first, int second, int third) {
        if (valid(first) || valid(second) || valid(third)) {
            return false;
        }
        return (first % 10 == second % 10) || (first % 10 == third % 10) || (second % 10 == third % 10);
    }

    public static boolean valid(int digit) {
        return digit >= 10 && digit <= 1000?false:true;
    }


}
