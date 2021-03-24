package com.ajax.leetcode;

// https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int missing = 1;
        int index = 0;
        int positive = 1;
        int left = k;
        while (left > 0 && index < arr.length) {
            int value = arr[index];
            if (value != positive) {
                missing = positive;
                left--;
            } else {
                index++;
            }
            positive++;
        }
        if (left > 0) {
            return positive + left - 1;
        }
        return missing;
    }
}
