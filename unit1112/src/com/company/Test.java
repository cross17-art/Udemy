package com.company;

public class Test {
    private int digit=1;
    private int digit2=2;
    private int digit3=3;

    public Test(int digit, int digit2, int digit3) {
        this.digit = digit;
        this.digit2 = digit2;
        this.digit3 = digit3;
    }

    public final int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public int getDigit2() {
        return digit2;
    }

    public void setDigit2(int digit2) {
        this.digit2 = digit2;
    }

    public int getDigit3() {
        return digit3;
    }

    public void setDigit3(int digit3) {
        this.digit3 = digit3;
    }
}
