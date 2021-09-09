package com.ajax.leetcode.geeks4geeks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RearrangeArrayAlternatelyTest {
    @Test
    public void test() {
        int[] arr = new int[] {1,2,3,4,5,6};
        RearrangeArrayAlternately.rearrange(arr, arr.length);
        Assertions.assertArrayEquals(new int[] {6, 1, 5, 2, 4, 3}, arr);

        arr = new int[] {10,20,30,40,50,60,70,80,90,100,110};
        RearrangeArrayAlternately.rearrange(arr, arr.length);
        Assertions.assertArrayEquals(new int[] {110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60}, arr);

        arr = new int[] {12, 23, 28, 43, 44, 59, 60, 68, 70, 85, 88, 92, 124, 125, 136, 168, 171, 173, 179, 199, 212, 230, 277, 282, 306, 314, 316, 325, 328, 336, 337, 363, 365, 368, 369, 371, 374, 387, 394, 414, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583, 650, 691, 730, 737, 751, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863, 874, 887, 896, 916, 920, 926, 927, 930, 957, 981, 997};
        RearrangeArrayAlternately.rearrange(arr, arr.length);
        Assertions.assertArrayEquals(new int[] {997, 12, 981, 23, 957, 28, 930, 43, 927, 44, 926, 59, 920, 60, 916, 68, 896, 70, 887, 85, 874, 88, 863, 92, 858, 124, 847, 125, 815, 136, 809, 168, 803, 171, 794, 173, 789, 179, 785, 199, 783, 212, 778, 230, 764, 277, 751, 282, 737, 306, 730, 314, 691, 316, 650, 325, 583, 328, 568, 336, 546, 337, 541, 363, 538, 365, 531, 368, 527, 369, 506, 371, 493, 374, 457, 387, 435, 394, 430, 414, 427, 422}, arr);
    }
}
