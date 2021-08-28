package com.ajax.leetcode.devsu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumElementMinimumSumTest {
    @Test
    public void test() {
        int[] numbers = new int[]{1,2,3,3,3,3,4,5,6,6};
        int max = MaximumElementMinimumSum.maximumElementMinimumSum(numbers);
        Assertions.assertEquals(6, max);

        numbers = new int[]{4,10,0,-2,10,-3,-9,0,6,10,6,10,-5,10,7,-10,-9,1,-2,-8,-10,9,-4,-9,5,1,-4,-10,2,-8,1,10,9,-1,0,4,9,7,9,7,-1,5,3,0,2,-7,4,0,7,0,-5,-6,-1,0,4,10,-2,-6,0,9,5,-5,-10,0,-7,-3,-6,5,7,-4,0,4,5,9,-4,4,1,10,1,-4,4,-4,9,-10,-10,-5,9,-3,4,0,3,-4,-1,2,-1,-5,10,7,-2,-4};
        max = MaximumElementMinimumSum.maximumElementMinimumSum(numbers);
        Assertions.assertEquals(10, max);

        numbers = new int[]{4,-10,6,-3,-2,-4,-9,10,0,-7,-4,-9,-4,2,-6,-7,10,1,8,10,5,1,2,-8,2,-10,0,-6,4,-2,-6,8,-3,0,9,-4,4,-5,4,-8,-1,-3,-8,8,-6,-7,8,6,0,9,2,-3,-4,4,-5,-2,0,3,0,-3,-6,-4,1,-4,-5,3,2,1,4,-8,-8,-3,-6,2,-4,9,-6,-9,0,9,9,-6,3,-4,0,-7,-5,0,6,-6,-10,4,-2,6,-3,-1,4,1,-3,-7};
        max = MaximumElementMinimumSum.maximumElementMinimumSum(numbers);
        Assertions.assertEquals(10, max);
    }
}
