package com.ajax.leetcode.geeks4geeks.math;

public class SmallestPositiveIntegerCannotBeSum {
    public static long smallestPositive(long[] array, int n){
        quicksort(array, 0, array.length - 1);
        double result = 1;
        for (long value : array) {
            if (value <= result) {
                result += value;
            } else {
                break;
            }
        }
        return (long) result;
    }

    private static void quicksort(long[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quicksort(array, low, pi - 1);
            quicksort(array, pi + 1, high);
        }
    }

    private static int partition(long[] array, int low, int high) {
        int index = low - 1;
        for (int i = low; i < high; i++) {
            if (array[i] < array[high]) {
                swap(array, i, ++index);
            }
        }
        swap(array, high, ++index);
        return index;
    }

    private static void swap(long[] array, int x, int y) {
        long temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
