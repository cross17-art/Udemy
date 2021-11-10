package com.company;

public class Task2 {
    public void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes > 0) {
            final int  KILOBytes_dash_MEGAByrets = 1024;
            int megabytes = (int) Math.floor(kiloBytes/1024);
            int remaining = kiloBytes%KILOBytes_dash_MEGAByrets;
            System.out.printf(kiloBytes+"KB ="+megabytes+" MB "+ remaining+" KB");
        } else {
            System.out.println("Invalid");
        }
    }
}
