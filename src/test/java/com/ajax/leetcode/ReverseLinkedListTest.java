package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {
    @Test
    public void test() {
        ReverseLinkedList executor = new ReverseLinkedList();

        ListNode input = createList(1,2,3,4,5);
        ListNode expected = createList(5,4,3,2,1);
        ListNode result = executor.reverseList(input);
        Assertions.assertEquals(expected, result);

        input = createList(1,2);
        expected = createList(2,1);
        result = executor.reverseList(input);
        Assertions.assertEquals(expected, result);

        input = createList(1);
        expected = createList(1);
        result = executor.reverseList(input);
        Assertions.assertEquals(expected, result);

        result = executor.reverseList(null);
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
