package com.ajax.leetcode.devsu;

import java.math.BigInteger;

public class SimpleSequence {
    // 1,2,3,4,3,4,5,6,5,6,7,8...
    public static String simpleSequenceValue(String n) {
        BigInteger original = new BigInteger(n);
        BigInteger four = BigInteger.valueOf(4);
        BigInteger value = new BigInteger(n);
        while (value.remainder(four).compareTo(BigInteger.ZERO) != 0) {
            value = value.add(BigInteger.ONE);
        }
        BigInteger times = value.divide(four).subtract(BigInteger.ONE).multiply(BigInteger.TWO);
        return original.subtract(times).toString();
    }
}
