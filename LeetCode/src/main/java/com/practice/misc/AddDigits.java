package com.practice.misc;

public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int n = num % 9;
        return  n == 0 ? 9 : n;
    }
}

