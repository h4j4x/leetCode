package com.ajax.leetcode.leetCode;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int index2 = 0;
        int len = m + n;
        for (int index1 = 0; index1 < len; index1++) {
            if (index2 >= n) {
                break;
            }
            boolean insert;
            if (nums2[index2] < nums1[index1]) {
                int copyLen = len - 1 - index1;
                if (copyLen >= 0) {
                    System.arraycopy(nums1, index1, nums1, index1 + 1, copyLen);
                }
                insert = true;
            } else {
                insert = index1 >= (m + index2);
            }
            if (insert) {
                nums1[index1] = nums2[index2];
                index2++;
            }
        }
    }
}
