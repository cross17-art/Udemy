package com.company;

public class Task8 {

    public double area (double radius){

        if(radius<=0){
            return -1.0;
        }
        return Math.PI * Math.pow(radius,2);
    }

    public double area (double x,double y){

        if(x<=0 || y<=0){
            return -1.0;
        }
        return x*y;
    }


}
