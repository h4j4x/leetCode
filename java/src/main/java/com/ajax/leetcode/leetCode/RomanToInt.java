package com.ajax.leetcode.leetCode;

import java.util.Map;

public class RomanToInt {
    private static final Map<String, Integer> symbols = Map.of(
        "I", 1,
        "V", 5,
        "X", 10,
        "L", 50,
        "C", 100,
        "D", 500,
        "M", 1000
    );

    public static int romanToInt(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }
        int number = 0;
        int lastValue = 0;
        for (int index = s.length() - 1; index >= 0; index--) {
            String symbol = s.substring(index, index + 1);
            int value = symbols.getOrDefault(symbol, 0);
            if (value >= lastValue) {
                number += value;
            } else {
                number -= value;
            }
            lastValue = value;
        }
        return number;
    }
}
