package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test() {
        RemoveDuplicatesFromSortedArray executor = new RemoveDuplicatesFromSortedArray();

        int[] input = new int[] {1,1,2};
        int[] expected = new int[] {1,2,-1};
        int result = executor.removeDuplicates(input);
        Assertions.assertEquals(2, result);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {1};
        expected = new int[] {1};
        result = executor.removeDuplicates(input);
        Assertions.assertEquals(1, result);
        Assertions.assertArrayEquals(expected, input);

        input = new int[] {0,0,1,1,1,2,2,3,3,4};
        expected = new int[] {0,1,2,3,4,-1,-1,-1,-1,-1};
        result = executor.removeDuplicates(input);
        Assertions.assertEquals(5, result);
        Assertions.assertArrayEquals(expected, input);
    }
}
