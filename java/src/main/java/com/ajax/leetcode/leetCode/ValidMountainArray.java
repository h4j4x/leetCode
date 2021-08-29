package com.ajax.leetcode.leetCode;

// https://leetcode.com/problems/valid-mountain-array/
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) {
            return false;
        }
        int factor = 1;
        int last = arr[0];
        int i = 1;
        while (i < len) {
            int expected = Integer.compare(arr[i], last);
            if (expected != factor) {
                if (i == 1 || factor == -1) {
                    return false;
                }
                factor = -1;
            } else {
                last = arr[i++];
            }
        }
        return factor == -1;
    }
}
