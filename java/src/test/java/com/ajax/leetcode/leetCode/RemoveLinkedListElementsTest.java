package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveLinkedListElementsTest {
    @Test
    public void test() {
        RemoveLinkedListElements executor = new RemoveLinkedListElements();

        ListNode head = createList(1,2,6,3,4,5,6);
        int val = 6;
        ListNode expected = createList(1,2,3,4,5);
        ListNode result = executor.removeElements(head, val);
        Assertions.assertEquals(expected, result);

        val = 1;
        result = executor.removeElements(null, val);
        Assertions.assertNull(result);

        head = createList(7,7,7,7);
        val = 7;
        result = executor.removeElements(head, val);
        Assertions.assertNull(result);
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
