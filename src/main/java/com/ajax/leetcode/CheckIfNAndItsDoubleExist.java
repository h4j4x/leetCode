package com.ajax.leetcode;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == 2 * n) {
                    return true;
                }
            }
        }
        return false;
    }
}
