package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {
    @Test
    public void test() {
        PalindromeLinkedList executor = new PalindromeLinkedList();

        ListNode head = createList(1,2,3,4,5);
        Assertions.assertFalse(executor.isPalindrome(head));

        head = createList(1,2);
        Assertions.assertFalse(executor.isPalindrome(head));

        head = createList(1,2,2,1);
        Assertions.assertTrue(executor.isPalindrome(head));

        head = createList(1);
        Assertions.assertTrue(executor.isPalindrome(head));
    }

    private ListNode createList(int... values) {
        ListNode head = null;
        ListNode node = null;
        for (int value : values) {
            if (head == null) {
                head = node = new ListNode(value);
            } else {
                ListNode next = new ListNode(value);
                node.next = next;
                node = next;
            }
        }
        return head;
    }
}
