package com.ajax.leetcode.leetCode;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/word-ladder/
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        List<String> words = new LinkedList<>(wordList);
        words.remove(beginWord);
        List<String> chain = new LinkedList<>();
        chain.add(beginWord);
        int listIndex = 0;
        while (!chain.isEmpty() && !words.isEmpty()) {
            String last = chain.get(chain.size() - 1);
            if (last.equals(endWord) || equalsExceptOne(last, endWord)) {
                chain.add(endWord);
                break;
            }
            String word = words.get(listIndex);
            if (equalsExceptOne(last, word)) {
                chain.add(word);
                words.remove(listIndex);
                listIndex = 0;
            } else {
                listIndex++;
                if (listIndex >= words.size()) {
                    listIndex = 0;
                    chain.remove(chain.size() -1 );
                    words.add(last);
                }
            }
        }
        return chain.size();
    }

    private boolean equalsExceptOne(String mutable, String immutable) {
        char[] chars = mutable.toCharArray();
        char[] immutableChars = immutable.toCharArray();
        int differentCount = 0;
        for (int i = 0; i < mutable.length(); i++) {
            if (chars[i] != immutableChars[i]) {
                differentCount++;
                if (differentCount > 1) {
                    break;
                }
            }
        }
        return differentCount == 1;
    }
}
