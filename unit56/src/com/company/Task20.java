package com.company;

public class Task20 {
    public int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int diver = 0;
        int i = 1;
        while (i < first && i < second) {
            if (first % i == 0 & second % i == 0) {
                diver = i;
            }
            i++;
        }

        return diver;
    }

}
