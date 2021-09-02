package com.ajax.leetcode.geeks4geeks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquilibriumPointTest {
    @Test
    public void test() {
        long[] array = new long[] {1, 3, 5, 2, 2};
        int value = EquilibriumPoint.equilibriumPoint(array, array.length);
        Assertions.assertEquals(3, value);

        array = new long[] {1};
        value = EquilibriumPoint.equilibriumPoint(array, array.length);
        Assertions.assertEquals(1, value);
    }
}
