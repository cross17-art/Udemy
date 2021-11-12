package com.company;

public class Task24 {
    public boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int all_floar = 0;
        for (int i = 0; i < bigCount; i++) {
            all_floar += 5;
            if (all_floar > goal) {
                all_floar -= 5;
                break;
            } else if (all_floar == goal) {
                return true;
            }
        }
        for (int i = 0; i < smallCount; i++) {
            if (all_floar == goal) {
                return true;
            }
            all_floar += 1;
        }
        return all_floar == goal;

    }
}

