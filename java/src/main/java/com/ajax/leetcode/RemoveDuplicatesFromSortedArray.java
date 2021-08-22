package com.ajax.leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int length = nums.length;
        while (i < length - 1) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[length - 1] = -1;
                length--;
            } else {
                i++;
            }
        }
        return length;
    }
}
