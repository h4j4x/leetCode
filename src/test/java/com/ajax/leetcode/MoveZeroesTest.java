package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {
    @Test
    public void test() {
        MoveZeroes executor = new MoveZeroes();

        int[] input = new int[] {0,1,0,3,12};
        int[] expected = new int[] {1,3,12,0,0};
        executor.moveZeroes(input);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {0};
        expected = new int[] {0};
        executor.moveZeroes(input);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {1,0,2,3,0};
        expected = new int[] {1,2,3,0,0};
        executor.moveZeroes(input);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {0,2,3,0};
        expected = new int[] {2,3,0,0};
        executor.moveZeroes(input);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {0,0,2,3};
        expected = new int[] {2,3,0,0};
        executor.moveZeroes(input);
        Assertions.assertArrayEquals(expected, input);
    }
}
