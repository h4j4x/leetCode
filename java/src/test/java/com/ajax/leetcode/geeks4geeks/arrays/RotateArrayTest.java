package com.ajax.leetcode.geeks4geeks.arrays;

import com.ajax.leetcode.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {
    @Test
    public void test() {
        int[] array = {1,2,3,4,5};
        RotateArray.rotateArr(array, 2, array.length);
        Assertions.assertArrayEquals(new int[] {3,4,5,1,2}, array);

        array = new int[] {2,4,6,8,10,12,14,16,18,20};
        RotateArray.rotateArr(array, 3, array.length);
        Assertions.assertArrayEquals(new int[] {8, 10, 12, 14, 16, 18, 20, 2, 4, 6}, array);

        array = new int[] {1,2,3,4,5,6,7,8,9,10};
        RotateArray.rotateArr(array, 8, array.length);
        Assertions.assertArrayEquals(new int[] {9, 10, 1, 2, 3, 4, 5, 6, 7, 8}, array);

        array = IOUtils.readFileIntoIntArray("/geeks4geeks/rotateArray.txt");
        RotateArray.rotateArr(array, 69, array.length);// 77 69
        int[] expected = IOUtils.readFileIntoIntArray("/geeks4geeks/rotateArray_result.txt");
        Assertions.assertArrayEquals(expected, array);
    }
}
