package com.company;

import java.util.LinkedList;

public class Task23 {
    public LinkedList<Integer> list =new LinkedList<>();

    public void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid");
        }
        getmas(number);
        int currentDigit = 0;
        for (int i = list.size(); i>0;i-- ) {
            currentDigit = list.get(i-1);
            switch (currentDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }
    public void getmas(int number){
        while(number>0){
            list.add(number%10);
            number/=10;
        }
    }

}
