package com.ajax.leetcode.geeks4geeks.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASimpleFraction {
    public static String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return "";
        }
        int value = numerator / denominator;
        int remainder = numerator % denominator;
        if (remainder == 0) {
            return String.valueOf(value);
        }
        final Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        final List<Integer> values = new ArrayList<>();
        while (remainder != 0
            && !remainderIndexMap.containsKey(remainder)) {
            remainderIndexMap.put(remainder, values.size());
            remainder *= 10;
            int decValue = remainder / denominator;
            remainder = remainder % denominator;
            values.add(decValue);
        }
        int index = remainderIndexMap.getOrDefault(remainder, -1);
        StringBuilder result = new StringBuilder();
        if (index >= 0) {
            for (int i = 0; i < index; i++) {
                result.append(values.get(i));
            }
            result.append("(");
            for (int i = index; i < values.size(); i++) {
                result.append(values.get(i));
            }
            result.append(")");
        } else {
            for (Integer decValue : values) {
                result.append(decValue);
            }
        }
        return value + "." + result;
    }
}
