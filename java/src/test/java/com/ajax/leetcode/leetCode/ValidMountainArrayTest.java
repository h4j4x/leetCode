package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {
    @Test
    public void test() {
        ValidMountainArray executor = new ValidMountainArray();

        int[] input = new int[] {2,1};
        boolean result = executor.validMountainArray(input);
        Assertions.assertFalse(result);

        input = new int[] {3,5,5};
        result = executor.validMountainArray(input);
        Assertions.assertFalse(result);

        input = new int[] {0,2,3,3,5,2,1,0};
        result = executor.validMountainArray(input);
        Assertions.assertFalse(result);

        input = new int[] {0,1,2,3,4,5,6,7,8,9};
        result = executor.validMountainArray(input);
        Assertions.assertFalse(result);

        input = new int[] {9,8,7,6,5,4,3,2,1,0};
        result = executor.validMountainArray(input);
        Assertions.assertFalse(result);

        input = new int[] {0,3,2,1};
        result = executor.validMountainArray(input);
        Assertions.assertTrue(result);

        input = new int[] {0,2,3,4,5,2,1,0};
        result = executor.validMountainArray(input);
        Assertions.assertTrue(result);
    }
}
