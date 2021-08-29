package com.ajax.leetcode.leetCode;

// https://leetcode.com/problems/third-maximum-number/
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long emptyValue = Long.MIN_VALUE;
        long[] maxs = new long[] {nums[0], emptyValue, emptyValue};
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            insertValue(value, maxs);
        }
        if (maxs[maxs.length - 1] != emptyValue) {
            return (int) maxs[maxs.length - 1];
        }
        return (int) maxs[0];
    }

    private void insertValue(long value, long[] arr) {
        long theValue = value;
        for (int i = 0; i < arr.length; i++) {
            if (theValue > arr[i]) {
                long temp = arr[i];
                arr[i] = theValue;
                theValue = temp;
            }
            if (theValue == arr[i]) {
                break;
            }
        }
    }
}
