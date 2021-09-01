package com.ajax.leetcode.geeks4geeks;

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

        unsorted = new int[]{
            4, 5, 1, 2, 2, 3, 0,
        };
        expected = new int[]{
            0, 1, 2, 2, 3, 4, 5,
        };
        sorted = QuickSort.quicksort(unsorted);
        Assertions.assertArrayEquals(expected, sorted);

        unsorted = new int[]{
            1, 10, 3, 11, 6, 15,
        };
        expected = new int[]{
            1, 3, 6, 10, 11, 15,
        };
        sorted = QuickSort.quicksort(unsorted);
        Assertions.assertArrayEquals(expected, sorted);
    }
}
