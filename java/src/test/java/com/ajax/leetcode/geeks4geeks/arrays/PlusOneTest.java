package com.ajax.leetcode.geeks4geeks.arrays;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneTest {
    @Test
    public void test() {
        List<Integer> array = List.of(1, 2, 4);
        Integer[] expected = { 1, 2, 5 };
        List<Integer> result = PlusOne.increment(array, array.size());
        Assertions.assertArrayEquals(expected, result.toArray(new Integer[0]));

        array = List.of(9, 9, 9);
        expected = new Integer[] { 1, 0, 0, 0 };
        result = PlusOne.increment(array, array.size());
        Assertions.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }
}
