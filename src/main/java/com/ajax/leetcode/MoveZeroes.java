package com.ajax.leetcode;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && k < 0) {
                k = i;
            }
            if (nums[i] != 0 && k >= 0) {
                nums[k] = nums[i];
                nums[i] = 0;
                k++;
            }
        }
    }
}
