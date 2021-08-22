package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {
    @Test
    public void test() {
        int[] input = new int[] {1,1,0,1,1,1};
        int expected = 3;
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1};
        expected = 1;
        result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1,1,1};
        expected = 3;
        result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1,1,1,0,1,1,1,1,0,1};
        expected = 4;
        result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {0};
        expected = 0;
        result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {0,0,0};
        expected = 0;
        result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        Assertions.assertEquals(expected, result);
    }
}
