package com.ajax.leetcode.geeks4geeks.arrays;

import com.ajax.leetcode.IOUtils;
import com.ajax.leetcode.geeks4geeks.arrays.SubArrayWithGivenSum;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubArrayWithGivenSumTest {
    @Test
    public void test() {
        int[] array = new int[] {1, 2, 3, 7, 5};
        ArrayList<Integer> list = SubArrayWithGivenSum.subarraySum(array, array.length, 12);
        Assertions.assertArrayEquals(new Integer[] {2, 4}, list.toArray());

        array = new int[] {1,2,3,4,5,6,7,8,9,10};
        list = SubArrayWithGivenSum.subarraySum(array, array.length, 15);
        Assertions.assertArrayEquals(new Integer[] {1, 5}, list.toArray());

        array = new int[] {1,1,1,3,8,10};
        list = SubArrayWithGivenSum.subarraySum(array, array.length, 10);
        Assertions.assertArrayEquals(new Integer[] {6, 6}, list.toArray());

        array = new int[] {1,2,3,4,5};
        list = SubArrayWithGivenSum.subarraySum(array, array.length, 1);
        Assertions.assertArrayEquals(new Integer[] {1, 1}, list.toArray());

        array = new int[] {1,1,3,4,5};
        list = SubArrayWithGivenSum.subarraySum(array, array.length, 2);
        Assertions.assertArrayEquals(new Integer[] {1, 2}, list.toArray());

        array = new int[] {2,1,3,4,5};
        list = SubArrayWithGivenSum.subarraySum(array, array.length, 9);
        Assertions.assertArrayEquals(new Integer[] {4, 5}, list.toArray());

        array = IOUtils.readFileIntoIntArray("/geeks4geeks/subArrayWithGivenSum.txt");
        list = SubArrayWithGivenSum.subarraySum(array, array.length, 252576);
        Assertions.assertArrayEquals(new Integer[] {12433, 12433}, list.toArray());
    }
}
