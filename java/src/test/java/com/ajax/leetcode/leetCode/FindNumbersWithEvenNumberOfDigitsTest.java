package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {
    @Test
    public void test() {
        int[] input = new int[] {12,345,2,6,7896};
        int expected = 2;
        int result = FindNumbersWithEvenNumberOfDigits.findNumbers(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {555,901,482,1771};
        expected = 1;
        result = FindNumbersWithEvenNumberOfDigits.findNumbers(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1};
        expected = 0;
        result = FindNumbersWithEvenNumberOfDigits.findNumbers(input);
        Assertions.assertEquals(expected, result);

        input = new int[0];
        expected = 0;
        result = FindNumbersWithEvenNumberOfDigits.findNumbers(input);
        Assertions.assertEquals(expected, result);
    }
}
