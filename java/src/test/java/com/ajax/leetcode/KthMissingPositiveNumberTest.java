package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthMissingPositiveNumberTest {
    @Test
    public void test() {
        int[] arr = new int[] {2,3,4,7,11};
        int k = 5;
        int expected = 9;
        int result = KthMissingPositiveNumber.findKthPositive(arr, k);
        Assertions.assertEquals(expected, result);

        arr = new int[] {1,2,3,4};
        k = 2;
        expected = 6;
        result = KthMissingPositiveNumber.findKthPositive(arr, k);
        Assertions.assertEquals(expected, result);

        arr = new int[] {8};
        k = 2;
        expected = 2;
        result = KthMissingPositiveNumber.findKthPositive(arr, k);
        Assertions.assertEquals(expected, result);

        arr = new int[] {8};
        k = 20;
        expected = 21;
        result = KthMissingPositiveNumber.findKthPositive(arr, k);
        Assertions.assertEquals(expected, result);
    }
}
