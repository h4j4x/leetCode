package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;

// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head != null) {
            ListNode reversed = null;
            ListNode node = head;
            while (node != null) {
                reversed = new ListNode(node.val, reversed);
                node = node.next;
            }
            node = head;
            while (node != null) {
                if (reversed.val != node.val) {
                    return false;
                }
                node = node.next;
                reversed = reversed.next;
            }
            return true;
        }
        return false;
    }
}
