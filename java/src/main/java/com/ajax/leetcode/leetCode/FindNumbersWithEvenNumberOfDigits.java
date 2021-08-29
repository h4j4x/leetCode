package com.ajax.leetcode.leetCode;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            int digits = 0;
            int value = num;
            while (value > 0) {
                digits++;
                value /= 10;
            }
            if (digits % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
