package com.ajax.leetcode.devsu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleSequenceTest {
    @Test
    public void test() {
        String value = SimpleSequence.simpleSequenceValue("1");
        Assertions.assertEquals("1", value);

        value = SimpleSequence.simpleSequenceValue("4");
        Assertions.assertEquals("4", value);

        value = SimpleSequence.simpleSequenceValue("5");
        Assertions.assertEquals("3", value);

        value = SimpleSequence.simpleSequenceValue("6");
        Assertions.assertEquals("4", value);

        value = SimpleSequence.simpleSequenceValue("8");
        Assertions.assertEquals("6", value);

        value = SimpleSequence.simpleSequenceValue("9");
        Assertions.assertEquals("5", value);

        value = SimpleSequence.simpleSequenceValue("12");
        Assertions.assertEquals("8", value);

        value = SimpleSequence.simpleSequenceValue("77");
        Assertions.assertEquals("39", value);

        value = SimpleSequence.simpleSequenceValue("545421");
        Assertions.assertEquals("272711", value);

        value = SimpleSequence.simpleSequenceValue("9223372036854775807");
        Assertions.assertEquals("4611686018427387905", value);

        value = SimpleSequence.simpleSequenceValue("4611686018327187");
        Assertions.assertEquals("2305843009163595", value);

        value = SimpleSequence.simpleSequenceValue("81239812739128371");
        Assertions.assertEquals("40619906369564187", value);
    }
}
