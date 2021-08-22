package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleIITest {
    @Test
    public void test() {
        LinkedListCycleII executor = new LinkedListCycleII();

        ListNode head = createList(1, 3,2,0,-4);
        ListNode next = executor.detectCycle(head);
        Assertions.assertNotNull(next);
        Assertions.assertEquals(head.next, next);

        head = createList(0, 1,2);
        next = executor.detectCycle(head);
        Assertions.assertNotNull(next);
        Assertions.assertEquals(head, next);

        head = createList(-1, 1);
        next = executor.detectCycle(head);
        Assertions.assertNull(next);

        head = createList(-1, 1,1,1);
        next = executor.detectCycle(head);
        Assertions.assertNull(next);
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
