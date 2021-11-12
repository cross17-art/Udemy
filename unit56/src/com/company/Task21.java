package com.company;

public class Task21 {

    public void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid");
            System.exit(1);
        }
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(number / i);
            }
            i++;
        }

    }

}
