package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {
    @Test
    public void test() {
        ThirdMaximumNumber executor = new ThirdMaximumNumber();

        int[] input = new int[] {3,2,1};
        int expected = 1;
        int result = executor.thirdMax(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1,2};
        expected = 2;
        result = executor.thirdMax(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {2,2,3,1};
        expected = 1;
        result = executor.thirdMax(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1,2,-2147483648};
        expected = -2147483648;
        result = executor.thirdMax(input);
        Assertions.assertEquals(expected, result);
    }
}
