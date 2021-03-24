package com.ajax.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int [] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentChar = s.charAt(i);
            int lastCharIndex = lastIndex[currentChar];
            index = Math.max(index, lastCharIndex + 1);
            result = Math.max(result, i - index + 1);
            lastIndex[currentChar] = i;
        }
        return result;
    }
}
