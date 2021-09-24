package com.ajax.leetcode.geeks4geeks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlternatePositiveAndNegativeTest {
    @Test
    public void test() {
        int[] array = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int[] expected = {9, -2, 4, -1, 5, -5, 0, -3, 2};
        AlternatePositiveAndNegative.rearrange(array, array.length);
        Assertions.assertArrayEquals(expected, array);

        array = new int[] {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        expected = new int[] {5, -5, 2, -2, 4, -8, 7, 1, 8, 0};
        AlternatePositiveAndNegative.rearrange(array, array.length);
        Assertions.assertArrayEquals(expected, array);
    }
}
