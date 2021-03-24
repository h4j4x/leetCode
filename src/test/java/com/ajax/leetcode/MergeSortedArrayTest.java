package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    @Test
    public void test() {
        MergeSortedArray executor = new MergeSortedArray();

        int[] nums1 = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n = 3;
        int[] expected = new int[] {1,2,2,3,5,6};
        executor.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);

        nums1 = new int[] {1};
        m = 1;
        nums2 = new int[0];
        n = 0;
        expected = new int[] {1};
        executor.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);

        nums1 = new int[] {3,5,7,8,0,0,0,0};
        m = 4;
        nums2 = new int[] {1,2,4,6};
        n = 4;
        expected = new int[] {1,2,3,4,5,6,7,8};
        executor.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);

        nums1 = new int[] {2,3,4,5,0,0,0,0};
        m = 4;
        nums2 = new int[] {1,6,7,8};
        n = 4;
        expected = new int[] {1,2,3,4,5,6,7,8};
        executor.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);

        nums1 = new int[] {4,0,0,0,0,0};
        m = 1;
        nums2 = new int[] {1,2,3,5,6};
        n = 5;
        expected = new int[] {1,2,3,4,5,6};
        executor.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);

        nums1 = new int[] {-1,0,0,3,3,3,0,0,0};
        m = 6;
        nums2 = new int[] {1,2,2};
        n = 3;
        expected = new int[] {-1,0,0,1,2,2,3,3,3};
        executor.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }
}
