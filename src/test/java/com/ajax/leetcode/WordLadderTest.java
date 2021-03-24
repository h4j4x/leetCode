package com.ajax.leetcode;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordLadderTest {
    @Test
    public void test() {
        WordLadder executor = new WordLadder();

        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int expected = 5;
        int result = executor.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(expected, result);

        beginWord = "hit";
        endWord = "cog";
        wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        expected = 0;
        result = executor.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(expected, result);

        beginWord = "toon";
        endWord = "plea";
        wordList = Arrays.asList("poon", "plee", "same", "poie", "plea", "plie", "poin");
        expected = 7;
        result = executor.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(expected, result);

        beginWord = "abcv";
        endWord = "ebad";
        wordList = Arrays.asList("abcd", "ebad", "ebcd", "xyza");
        expected = 4;
        result = executor.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(expected, result);

        beginWord = "hot";
        endWord = "dog";
        wordList = Arrays.asList("hot", "cog", "dog", "tot", "hog", "hop", "pot", "dot");
        expected = 3;
        result = executor.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(expected, result);
    }
}
