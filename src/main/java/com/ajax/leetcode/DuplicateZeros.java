package com.ajax.leetcode;

// https://leetcode.com/problems/duplicate-zeros/
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int[] next = new int[arr.length * 2];
        int nextLength = -1;
        int nextIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value == 0 || nextLength >= 0) {
                nextIndex++;
                if (value == 0) {
                    next[++nextLength] = 0;
                }
                next[++nextLength] = value;
            }
            if (nextIndex >= 0) {
                arr[i] = next[nextIndex];
            }
        }
    }
}
