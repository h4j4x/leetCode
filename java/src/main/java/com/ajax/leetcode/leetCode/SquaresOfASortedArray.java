package com.ajax.leetcode.leetCode;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int [] squares = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int index = end;
        while (start <= end) {
            int pow1 = nums[start] * nums[start];
            int pow2 = nums[end] * nums[end];
            if (pow1 > pow2) {
                squares[index--] = pow1;
                start++;
            } else {
                squares[index--] = pow2;
                end--;
            }
        }
        return squares;
    }
}
