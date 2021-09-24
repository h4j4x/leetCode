package com.ajax.leetcode.geeks4geeks.arrays;

public class AlternatePositiveAndNegative {
    public static void rearrange(int[] arr, int n) {
        int[] pos = new int[n];
        int posLen = 0;
        int[] neg = new int[n];
        int negLen = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[posLen++] = arr[i];
            } else {
                neg[negLen++] = arr[i];
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        int i = 0;
        while (posIndex < posLen && negIndex < negLen) {
            if (i % 2 == 0) {
                arr[i++] = pos[posIndex++];
            } else {
                arr[i++] = neg[negIndex++];
            }
        }
        while (posIndex < posLen) {
            arr[i++] = pos[posIndex++];
        }
        while (negIndex < negLen) {
            arr[i++] = neg[negIndex++];
        }
    }
}
