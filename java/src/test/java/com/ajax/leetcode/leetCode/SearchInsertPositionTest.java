package com.ajax.leetcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {
    @Test
    public void test() {
        int[] nums = new int[]{1,3,5,6};
        int value = SearchInsertPosition.searchInsert(nums, 5);
        Assertions.assertEquals(2, value);

        value = SearchInsertPosition.searchInsert(nums, 2);
        Assertions.assertEquals(1, value);

        value = SearchInsertPosition.searchInsert(nums, 7);
        Assertions.assertEquals(4, value);

        value = SearchInsertPosition.searchInsert(nums, 0);
        Assertions.assertEquals(0, value);
    }
}
