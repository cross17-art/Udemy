package com.company;

import java.util.LinkedList;

public class Task22 {
    public boolean isPerfecrNumber(int number) {
        if(number<1)return false;

        int sum = 0;
        for (int i = 1;i<number;i++){
            if(number%i==0 && i!=number){
                sum+=i;
            }
        }

        return sum==number;
    }
}
