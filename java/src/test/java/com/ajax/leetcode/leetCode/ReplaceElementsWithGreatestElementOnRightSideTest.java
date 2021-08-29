package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceElementsWithGreatestElementOnRightSideTest {
    @Test
    public void test() {
        ReplaceElementsWithGreatestElementOnRightSide executor = new ReplaceElementsWithGreatestElementOnRightSide();

        int[] input = new int[] {17,18,5,4,6,1};
        int[] expected = new int[] {18,6,6,6,1,-1};
        int[] result = executor.replaceElements(input);
        Assertions.assertArrayEquals(expected, result);

        input = new int[] {400};
        expected = new int[] {-1};
        result = executor.replaceElements(input);
        Assertions.assertArrayEquals(expected, result);
    }
}
