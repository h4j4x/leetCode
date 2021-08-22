package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void test() {
        String input = "abcabcbb";
        int expected = 3;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);

        input = "bbbbb";
        expected = 1;
        result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);

        input = "pwwkew";
        expected = 3;
        result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);

        input = "";
        expected = 0;
        result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);

        input = "abdefgabef";
        expected = 6;
        result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);

        input = "geeksforgeeks";
        expected = 7;
        result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);

        input = "geeks for geeks";
        expected = 7;
        result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);

        input = "geeks forágeeks";
        expected = 9;
        result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);
    }
}
