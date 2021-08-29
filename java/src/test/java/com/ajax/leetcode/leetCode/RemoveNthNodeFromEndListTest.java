package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndListTest {
    @Test
    public void test() {
        RemoveNthNodeFromEndList executor = new RemoveNthNodeFromEndList();

        ListNode head = createList(1, 2, 3, 4, 5);
        int n = 2;
        ListNode expected = createList(1, 2, 3, 5);
        ListNode result = executor.removeNthFromEnd(head, n);
        Assertions.assertEquals(expected, result);

        head = createList(1);
        n = 1;
        result = executor.removeNthFromEnd(head, n);
        Assertions.assertNull(result);

        head = createList(1, 2);
        n = 1;
        expected = createList(1);
        result = executor.removeNthFromEnd(head, n);
        Assertions.assertEquals(expected, result);

        head = createList(1, 2);
        n = 2;
        expected = createList(2);
        result = executor.removeNthFromEnd(head, n);
        Assertions.assertEquals(expected, result);
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
