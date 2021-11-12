package com.company;

public class Task18 {

        public boolean hasSharedDigit(int first, int second) {

            if ((first < 10 || second > 99) || (first > 99 || second < 10)) {
                return false;
            }

            int realNumB = second;

            while (first > 0) {
                int numFDig = first % 10;
                while (second > 0) {
                    int numSDig = second % 10;
                    if (numFDig == numSDig) {
                        return true;
                    }
                    second = second / 10;
                }
                first = first / 10;
                second = realNumB;
            }

            return false;
        }
    }



