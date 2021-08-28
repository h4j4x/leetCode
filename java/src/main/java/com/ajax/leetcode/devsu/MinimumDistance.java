package com.ajax.leetcode.devsu;

public class MinimumDistance {
    public static int minimumDistance(String text, String subtext) {
        int distance = -1;
        if (text != null && !text.isEmpty()
            && subtext != null && !subtext.isEmpty()
            && subtext.length() <= text.length()) {
            int index = text.indexOf(subtext);
            while (index >= 0) {
                if (distance < 0) {
                    distance = Integer.MAX_VALUE;
                }
                int rightIndex = index + subtext.length();
                int rightDistance = text.length() - rightIndex;
                int indexDistance = Math.min(index, rightDistance);
                distance = Math.min(distance, indexDistance);
                index = text.indexOf(subtext, rightIndex);
            }
        }
        return distance;
    }
}
