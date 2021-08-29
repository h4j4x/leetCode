package com.ajax.leetcode.leetCode;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] ordered = new int[heights.length];
        System.arraycopy(heights, 0, ordered, 0, heights.length);
        Arrays.sort(ordered);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (ordered[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
