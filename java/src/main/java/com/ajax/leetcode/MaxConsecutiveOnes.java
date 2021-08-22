package com.ajax.leetcode;

// https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int index = 0;
        boolean hasZero = false;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            hasZero |= value == 0;
            if (value == 0) {
                result = Math.max(result, i - index);
                index = i + 1;
            }
        }
        if (result == 0 && !hasZero) {
            result = nums.length;
        }
        if (index < nums.length) {
            result = Math.max(result, nums.length - index);
        }
        return result;
    }
}
