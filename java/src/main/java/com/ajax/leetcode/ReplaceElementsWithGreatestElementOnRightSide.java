package com.ajax.leetcode;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int len = arr.length;
        int[] result = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            result[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return result;
    }
}
