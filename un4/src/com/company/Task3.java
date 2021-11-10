package com.company;

public class Task3 {
    public boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((barking && hourOfDay >= 0) && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }


}
