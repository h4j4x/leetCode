package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {
    @Test
    public void test() {
        LinkedListCycle executor = new LinkedListCycle();

        ListNode head = createList(1, 3,2,0,-4);
        Assertions.assertTrue(executor.hasCycle(head));
        head = createList(0, 1,2);
        Assertions.assertTrue(executor.hasCycle(head));
        head = createList(-1, 1);
        Assertions.assertFalse(executor.hasCycle(head));
        head = createList(-1, 1,1,1);
        Assertions.assertFalse(executor.hasCycle(head));
    }

    private ListNode createList(int tailNextIndex, int... values) {
        ListNode head = null;
        ListNode node = null;
        ListNode cycleStartNode = null;
        for (int i = 0; i < values.length; i++) {
            ListNode next;
            if (head == null) {
                head = node = next = new ListNode(values[i]);
            } else {
                next = new ListNode(values[i]);
                node.next = next;
                node = next;
            }
            if (i == tailNextIndex) {
                cycleStartNode = next;
            }
            if (i == values.length - 1 && tailNextIndex >= 0 && tailNextIndex < values.length) {
                node.next = cycleStartNode;
            }
        }
        return head;
    }
}
