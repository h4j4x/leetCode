package com.ajax.leetcode.geeks4geeks.arrays;

public class SortArray0s1s2s {
    public static void sort012(int[] array, int n) {
        int lastZero = -1;
        int firstTwo = array.length;
        int index = 0;
        while (index < firstTwo) {
            while (array[lastZero + 1] == 0 && lastZero < array.length - 1) {
                lastZero++;
                index++;
            }
            while (array[firstTwo - 1] == 2 && firstTwo > 0) {
                firstTwo--;
            }
            if (array[index] == 0 && index > lastZero + 1) {
                swap(array, ++lastZero, index);
            }
            if (array[index] == 2 && index < firstTwo - 1) {
                swap(array, --firstTwo, index);
            }
            while (index < firstTwo && array[index] == 1) {
                index++;
            }
        }
    }

    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
