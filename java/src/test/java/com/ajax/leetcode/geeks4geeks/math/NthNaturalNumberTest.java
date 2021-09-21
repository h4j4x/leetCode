package com.ajax.leetcode.geeks4geeks.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NthNaturalNumberTest {
    @Test
    public void test() {
        long value = NthNaturalNumber.findNth(8);
        Assertions.assertEquals(8, value);

        value = NthNaturalNumber.findNth(9);
        Assertions.assertEquals(10, value);

        value = NthNaturalNumber.findNth(27);
        Assertions.assertEquals(30, value);

        value = NthNaturalNumber.findNth(82);
        Assertions.assertEquals(101, value);

        value = NthNaturalNumber.findNth(10000021409L);
        Assertions.assertEquals(27726721438L, value);
    }
}
