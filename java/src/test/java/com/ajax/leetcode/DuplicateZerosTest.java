package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateZerosTest {
    @Test
    public void test() {
        DuplicateZeros executor = new DuplicateZeros();

        int[] input = new int[] {1,0,2,3,0,4,5,0};
        int[] expected = new int[] {1,0,0,2,3,0,0,4};
        executor.duplicateZeros(input);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {1,2,3};
        expected = new int[] {1,2,3};
        executor.duplicateZeros(input);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {1,2,0,3,0};
        expected = new int[] {1,2,0,0,3};
        executor.duplicateZeros(input);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {0,0};
        expected = new int[] {0,0};
        executor.duplicateZeros(input);
        Assertions.assertArrayEquals(expected, input);
    }
}
