package com.ajax.leetcode.geeks4geeks.arrays;

public class RotateArray {
    public static void rotateArr(int[] arr, int d, int n) {
        int left = 0;
        int right = d;
        int extraIndex = 0;
        int[] extra = new int[d];
        while (right < n) {
            if (extraIndex < d) {
                extra[extraIndex++] = arr[left];
            }
            arr[left++] = arr[right++];
        }
        for (int i = left; i < n && extraIndex < d; i++) {
            extra[extraIndex++] = arr[i];
        }
        for (int i = 0; i < extraIndex; i++) {
            arr[left++] = extra[i];
        }
    }
}
