package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    @Test
    public void test() {
        RemoveElement executor = new RemoveElement();

        int[] input = new int[] {3,2,2,3};
        int[] expected = new int[] {2,2,3,3};
        int result = executor.removeElement(input, 3);
        Assertions.assertEquals(2, result);
        Assertions.assertArrayEquals(expected, input);
    }
}
