package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfNAndItsDoubleExistTest {
    @Test
    public void test() {
        CheckIfNAndItsDoubleExist executor = new CheckIfNAndItsDoubleExist();

        int[] input = new int[] {10,2,5,3};
        boolean result = executor.checkIfExist(input);
        Assertions.assertTrue(result);

        input = new int[] {7,1,14,11};
        result = executor.checkIfExist(input);
        Assertions.assertTrue(result);

        input = new int[] {3,1,7,11};
        result = executor.checkIfExist(input);
        Assertions.assertFalse(result);
    }
}
