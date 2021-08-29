package com.ajax.leetcode.leetCode;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindAllNumbersDisappearedInArrayTest {
    @Test
    public void test() {
        FindAllNumbersDisappearedInArray executor = new FindAllNumbersDisappearedInArray();

        int[] input = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> expected = List.of(5, 6);
        List<Integer> result = executor.findDisappearedNumbers(input);
        Assertions.assertEquals(expected, result);

        input = new int[] {1,1};
        expected = List.of(2);
        result = executor.findDisappearedNumbers(input);
        Assertions.assertEquals(expected, result);
    }
}
