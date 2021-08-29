package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenLinkedListTest {
    @Test
    public void test() {
        OddEvenLinkedList executor = new OddEvenLinkedList();

        ListNode head = createList(1,2,3,4,5);
        ListNode expected = createList(1,3,5,2,4);
        ListNode result = executor.oddEvenList(head);
        Assertions.assertEquals(expected, result);

        head = createList(2,1,3,5,6,4,7);
        expected = createList(2,3,6,7,1,5,4);
        result = executor.oddEvenList(head);
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
