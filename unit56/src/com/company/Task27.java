package com.company;

import java.util.Scanner;

public class Task27 {
    Scanner scanner = new Scanner(System.in);

    public void ENTER() {
        int count = 0;
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }
        scanner.close();
        System.out.printf("SUM ="+sum+" AVG = "+ Math.round((float) sum / count));
    }

}
