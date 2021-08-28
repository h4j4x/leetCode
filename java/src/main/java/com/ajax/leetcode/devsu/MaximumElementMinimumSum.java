package com.ajax.leetcode.devsu;

public class MaximumElementMinimumSum {
    public static int maximumElementMinimumSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int maxNumber = Integer.MIN_VALUE;
        int minSum = sum + 1;
        String numbersStr = "";
        for (int number : numbers) {
            String numberStr = ";" + number + ";";
            if (!numbersStr.contains(numberStr)) {
                int numberSum = sum - number;
                if (numberSum < minSum) {
                    minSum = numberSum;
                    maxNumber = Math.max(maxNumber, number);
                }
                numbersStr += numberStr;
            }
        }
        return maxNumber;
    }
}
