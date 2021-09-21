package com.ajax.leetcode.geeks4geeks.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ASimpleFractionTest {
    @Test
    public void test() {
        String value = ASimpleFraction.fractionToDecimal(1, 3);
        Assertions.assertEquals("0.(3)", value);

        value = ASimpleFraction.fractionToDecimal(5, 2);
        Assertions.assertEquals("2.5", value);

        value = ASimpleFraction.fractionToDecimal(10, 2);
        Assertions.assertEquals("5", value);

        value = ASimpleFraction.fractionToDecimal(4, 9);
        Assertions.assertEquals("0.(4)", value);

        value = ASimpleFraction.fractionToDecimal(16, 13);
        Assertions.assertEquals("1.(230769)", value);
    }
}
