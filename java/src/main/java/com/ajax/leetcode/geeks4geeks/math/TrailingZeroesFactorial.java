package com.ajax.leetcode.geeks4geeks.math;

public class TrailingZeroesFactorial {
    public static int trailingZeroes(int n){
        int sum = 0;
        while (n > 0) {
            sum += n/5;
            n /= 5;
        }
        return sum;
    }
}
