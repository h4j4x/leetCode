package com.ajax.leetcode.geeks4geeks;

public class RearrangeArrayAlternately {
    public static void rearrange(int[] arr, int n) {
        int left = -1;
        int right = n;
        int max = arr[n - 1] + 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[--right] % max) * max;
            } else {
                arr[i] += (arr[++left] % max) * max;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }
    }
}
