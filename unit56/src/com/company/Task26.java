package com.company;

public class Task26 {
    public  void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid");
            return;
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i == 0 || i == number - 1) || ((j == 0) || (j == number - 1))) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else if (j == number - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
