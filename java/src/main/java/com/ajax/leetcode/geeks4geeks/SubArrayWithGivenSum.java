package com.ajax.leetcode.geeks4geeks;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        while (left <= arr.length && right <= arr.length && sum != s) {
            if (sum < s) {
                if (right < arr.length) {
                    sum += arr[right];
                }
                right++;
            } else if (sum > s) {
                if (left < arr.length) {
                    sum -= arr[left];
                }
                left++;
            }
        }
        if (sum == s) {
            list.add(left + 1);
            list.add(right);
        } else {
            list.add(-1);
        }
        return list;
    }
}
