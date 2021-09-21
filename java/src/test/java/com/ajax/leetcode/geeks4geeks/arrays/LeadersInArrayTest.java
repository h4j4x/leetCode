package com.ajax.leetcode.geeks4geeks.arrays;

import com.ajax.leetcode.IOUtils;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeadersInArrayTest {
    @Test
    public void test() {
        int[] array = new int[] {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> value = LeadersInArray.leaders(array, array.length);
        Assertions.assertArrayEquals(new Integer[] {17, 5, 2}, value.toArray());

        array = new int[] {1, 2, 3, 4, 0};
        value = LeadersInArray.leaders(array, array.length);
        Assertions.assertArrayEquals(new Integer[] {4, 0}, value.toArray());

        array = IOUtils.readFileIntoIntArray("/geeks4geeks/leadersInArray.txt");
        value = LeadersInArray.leaders(array, array.length);
        Assertions.assertArrayEquals(new Integer[] {32763, 32763, 32734, 32722, 32719, 32329, 32305, 30705, 29265}, value.toArray());
    }
}
