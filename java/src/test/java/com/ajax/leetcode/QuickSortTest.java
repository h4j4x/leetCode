package com.ajax.leetcode;

import com.ajax.leetcode.geeks4geeks.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void test() {
        int[] unsorted = new int[]{
            4, 7, 1, 9, 10, -23, 0,
        };
        int[] expected = new int[]{
            -23, 0, 1, 4, 7, 9, 10,
        };
        int[] sorted = QuickSort.quicksort(unsorted);
        Assertions.assertArrayEquals(expected, sorted);
    }
}
