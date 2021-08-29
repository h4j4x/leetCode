package com.ajax.leetcode.geeks4geeks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrailingZeroesFactorialTest {
    @Test
    public void test() {
        int value = TrailingZeroesFactorial.trailingZeroes(4);
        Assertions.assertEquals(0, value);

        value = TrailingZeroesFactorial.trailingZeroes(5);
        Assertions.assertEquals(1, value);

        value = TrailingZeroesFactorial.trailingZeroes(9);
        Assertions.assertEquals(1, value);

        value = TrailingZeroesFactorial.trailingZeroes(10);
        Assertions.assertEquals(2, value);

        value = TrailingZeroesFactorial.trailingZeroes(19);
        Assertions.assertEquals(3, value);

        value = TrailingZeroesFactorial.trailingZeroes(20);
        Assertions.assertEquals(4, value);

        value = TrailingZeroesFactorial.trailingZeroes(100);
        Assertions.assertEquals(24, value);

        value = TrailingZeroesFactorial.trailingZeroes(384);
        Assertions.assertEquals(94, value);
    }
}
