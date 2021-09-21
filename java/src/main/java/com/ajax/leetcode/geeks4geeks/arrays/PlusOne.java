package com.ajax.leetcode.geeks4geeks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static List<Integer> increment(List<Integer> array, int n) {
        Integer[] result = array.toArray(new Integer[0]);
        int next = 1;
        for (int i = n - 1; i >= 0; i--) {
            int value = (result[i] + next) % 10;
            next = ((result[i] + next) - value) / 10;
            result[i] = value;
            if (next == 0) {
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(result));
        if (next > 0) {
            list.add(0, next % 10);
        }
        return list;
    }
}
