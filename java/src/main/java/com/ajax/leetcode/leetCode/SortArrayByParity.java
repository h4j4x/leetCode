package com.ajax.leetcode.leetCode;

// https://leetcode.com/problems/sort-array-by-parity/
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] arr) {
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && k < 0) {
                k = i;
            }
            if (arr[i] % 2 == 0 && k >= 0) {
                int value = arr[k];
                arr[k] = arr[i];
                arr[i] = value;
                k++;
            }
        }
        return arr;
    }
}
