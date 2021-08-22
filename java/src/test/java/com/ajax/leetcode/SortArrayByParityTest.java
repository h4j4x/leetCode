package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayByParityTest {
    @Test
    public void test() {
        SortArrayByParity executor = new SortArrayByParity();

        int[] input = new int[] {3,1,2,4};
        int[] expected = new int[] {2,4,3,1};
        int[] result = executor.sortArrayByParity(input);
        Assertions.assertArrayEquals(expected, result);

        input = new int[] {3,2,1,4,5};
        expected = new int[] {2,4,1,3,5};
        result = executor.sortArrayByParity(input);
        Assertions.assertArrayEquals(expected, result);
    }
}
