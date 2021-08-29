package com.ajax.leetcode.leetCode;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            boolean found = false;
            int index = result.size();
            for (int j = index; j < nums.length; j++) {
                if (nums[j] == i) {
                    nums[j] = nums[index];
                    nums[index] = i;
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(i);
            }
        }
        return result;
    }
}
