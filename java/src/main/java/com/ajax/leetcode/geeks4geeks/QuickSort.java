package com.ajax.leetcode.geeks4geeks;

public class QuickSort {
    public static int[] quicksort(int[] unsorted) {
        if (unsorted == null || unsorted.length < 2) {
            return unsorted;
        }
        int len = unsorted.length;
        int[] sorted = new int[len];
        System.arraycopy(unsorted, 0, sorted, 0, len);
        quicksort(sorted, 0, len - 1);
        return sorted;
    }

    private static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quicksort(array, low, pivot - 1);
            quicksort(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int index = low - 1;
        for (int i = low; i < high; i++) {
            if (array[i] < array[high]) {
                swap(array, ++index, i);
            }
        }
        swap(array, ++index, high);
        return index;
    }

    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
