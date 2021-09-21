package com.ajax.leetcode.geeks4geeks.arrays;

import java.util.ArrayList;

public class LeadersInArray {
    public  static ArrayList<Integer> leaders(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                list.add(0, arr[i]);
            }
        }
        return list;
    }
}
