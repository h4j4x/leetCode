package com.ajax.leetcode.geeks4geeks;

public class EquilibriumPoint {
    public static int equilibriumPoint(long[] arr, int n) {
        if (arr.length == 1) {
            return 1;
        }
        int leftIndex = -1;
        int rightIndex = arr.length;
        long leftSum = 0;
        long rightSum = 0;
        while (leftIndex < rightIndex) {
            if (leftSum < rightSum) {
                leftSum += arr[++leftIndex];
            } else {
                rightSum += arr[--rightIndex];
            }
            if (rightIndex - leftIndex == 2
                && leftSum == rightSum) {
                return leftIndex + 2;// 1 based expected index
            }
        }
        return -1;
    }
}
