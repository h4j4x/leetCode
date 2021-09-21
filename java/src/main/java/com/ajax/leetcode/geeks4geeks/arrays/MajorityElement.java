package com.ajax.leetcode.geeks4geeks.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
    public static int majorityElement(int[] a, int size) {
        if (size == 0) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            Integer value = map.getOrDefault(a[i], 0);
            map.put(a[i], value + 1);
        }
        int max = -1;
        int maxCount = 0;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Integer value = map.get(key);
            if (value > maxCount) {
                max = key;
                maxCount = value;
            }
        }
        if (maxCount > size / 2) {
            return max;
        }
        return -1;
    }
}
