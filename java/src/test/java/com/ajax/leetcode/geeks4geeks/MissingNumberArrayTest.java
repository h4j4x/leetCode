package com.ajax.leetcode.geeks4geeks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberArrayTest {
    @Test
    public void test() {
        int value = MissingNumberArray.missingNumber(new int[]{1,2,3,5}, 5);
        Assertions.assertEquals(4, value);

        value = MissingNumberArray.missingNumber(new int[]{1,2,3,4,5,6,7,8,10}, 10);
        Assertions.assertEquals(9, value);

        value = MissingNumberArray.missingNumber(new int[]{1,2,3,4,5,6,7,8,9}, 10);
        Assertions.assertEquals(10, value);

        value = MissingNumberArray.missingNumber(new int[]{2,3,4,5,6,7,8,9,10}, 10);
        Assertions.assertEquals(1, value);
    }
}
