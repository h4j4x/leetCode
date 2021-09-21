package com.ajax.leetcode.geeks4geeks.arrays;

import com.ajax.leetcode.geeks4geeks.arrays.MajorityElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    @Test
    public void test() {
        int[] array = {1, 2, 3};
        int value = MajorityElement.majorityElement(array, array.length);
        Assertions.assertEquals(-1, value);

        array = new int[] {3, 1, 3, 3, 2};
        value = MajorityElement.majorityElement(array, array.length);
        Assertions.assertEquals(3, value);
    }
}
