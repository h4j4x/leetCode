package com.ajax.leetcode.geeks4geeks;

import com.ajax.leetcode.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArray0s1s2sTest {
    @Test
    public void test() {
        int[] array = new int[] {0, 2, 1, 2, 0};
        SortArray0s1s2s.sort012(array, array.length);
        Assertions.assertArrayEquals(new int[] {0, 0, 1, 2, 2}, array);

        array = new int[] {0, 1, 0};
        SortArray0s1s2s.sort012(array, array.length);
        Assertions.assertArrayEquals(new int[] {0, 0, 1}, array);

        array = new int[] {2, 1, 2, 0, 1, 2, 2, 2, 1, 1, 0, 0, 1, 2, 1};
        SortArray0s1s2s.sort012(array, array.length);
        Assertions.assertArrayEquals(new int[] {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, array);

        array = IOUtils.readFileIntoIntArray("/geeks4geeks/sortArray0s1s2s.txt");
        SortArray0s1s2s.sort012(array, array.length);
        int[] expected = IOUtils.readFileIntoIntArray("/geeks4geeks/sortArray0s1s2s_result.txt");
        Assertions.assertArrayEquals(expected, array);
    }
}
