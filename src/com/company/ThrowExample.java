package com.company;

public class ThrowExample {
    public static int getAreaValue(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Value of 'x' or 'y' is negative: x =" + x + "y" + y);
        }
        return x * y;
    }
}
