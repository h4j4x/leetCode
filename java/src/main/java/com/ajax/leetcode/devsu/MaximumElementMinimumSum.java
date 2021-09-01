package com.ajax.leetcode.devsu;

import java.util.HashMap;
import java.util.Map;

public class MaximumElementMinimumSum {
    public static int maximumElementMinimumSum(int[] numbers) {
        int sum = 0;
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int number : numbers) {
            sum += number;
            Integer numberQuantity = numbersMap.getOrDefault(number, 0);
            numbersMap.put(number, numberQuantity + 1);
        }
        int maxNumber = Integer.MIN_VALUE;
        int minSum = sum + 1;
        String numbersStr = "";
        for (int number : numbers) {
            String numberStr = ";" + number + ";";
            if (!numbersStr.contains(numberStr)) {
                Integer numberQuantity = numbersMap.getOrDefault(number, 0);
                int numberSum = sum - (number * numberQuantity);
                if (numberSum <= minSum) {
                    minSum = numberSum;
                    maxNumber = Math.max(maxNumber, number);
                }
                numbersStr += numberStr;
            }
        }
        return maxNumber;
    }
}
