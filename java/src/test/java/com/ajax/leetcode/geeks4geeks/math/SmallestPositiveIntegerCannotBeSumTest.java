package com.ajax.leetcode.geeks4geeks.math;

import com.ajax.leetcode.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestPositiveIntegerCannotBeSumTest {
    @Test
    public void test() {
        long value = SmallestPositiveIntegerCannotBeSum.smallestPositive(new long[] {1, 10, 3, 11, 6, 15}, 6);
        Assertions.assertEquals(2, value);

        value = SmallestPositiveIntegerCannotBeSum.smallestPositive(new long[] {1, 1, 1}, 3);
        Assertions.assertEquals(4, value);

        long[] array = IOUtils.readFileIntoLongArray("/geeks4geeks/smallestPositiveIntegerCannotBeSum.txt");
        value = SmallestPositiveIntegerCannotBeSum.smallestPositive(array, 3);
        Assertions.assertEquals(250171817859L, value);
    }
}
