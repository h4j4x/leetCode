package com.ajax.leetcode.geeks4geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void test() {
        for (int x = 0; x < 10; x++) {
            int len = ((int) (Math.random() * 1000) + 1);
            List<Integer> unsortedList = new ArrayList<>(len);
            int[] expected = new int[len];
            for (int i = 0; i < len; i++) {
                unsortedList.add(i + 1);
                expected[i] = i + 1;
            }
            Collections.shuffle(unsortedList);
            int[] unsorted = new int[len];
            for (int i = 0; i < len; i++) {
                unsorted[i] = unsortedList.get(i);
            }
            int[] sorted = QuickSort.quicksort(unsorted);
            Assertions.assertArrayEquals(expected, sorted);
        }
    }
}
