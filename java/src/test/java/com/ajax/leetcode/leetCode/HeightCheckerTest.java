package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeightCheckerTest {
    @Test
    public void test() {
        HeightChecker executor = new HeightChecker();

        int[] input = new int[] {1,1,4,2,1,3};
        int expected = 3;
        int result = executor.heightChecker(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {5,1,2,3,4};
        expected = 5;
        result = executor.heightChecker(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1,2,3,4,5};
        expected = 0;
        result = executor.heightChecker(input);
        Assertions.assertEquals(expected, result);
    }
}
