package com.ajax.leetcode.geeks4geeks.math;

public class NthNaturalNumber {
    // 1,2,3,4,5,6,7,8,10...
    public static long findNth(long n) {
        long number = n;
        int factor = 0;
        long value = 0;
        while (number > 0) {
            long reminder = number % 9;
            value += reminder * Math.pow(10.0, factor++);
            number /= 9;
        }
        return value;
    }
}
