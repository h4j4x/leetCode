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

    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high- 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, ++i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
