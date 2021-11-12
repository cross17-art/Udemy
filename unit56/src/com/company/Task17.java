package com.company;

public class Task17 {
    public int getEvenDigitSum (int number){
        if(number<0)return -1;

        int sum = 0;
        int digit = 0;
        while(number!=0) {
            digit = number%10;
            if (digit!=0 && digit%2==0) {
                sum+=digit;
            }
            number/=10;
        }
        return sum;
    }
}
