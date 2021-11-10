package com.company;

public class Task1 {
    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }else {
            return Math.round(kilometersPerHour/1.609344);
        }
    }



    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour>0){
            long milperhour  = toMilesPerHour(kilometersPerHour);
            System.out.printf("%f km/h = %d mi/h",kilometersPerHour,milperhour);
        }else{
            System.out.println("wrong enter");
        }
    }



}
