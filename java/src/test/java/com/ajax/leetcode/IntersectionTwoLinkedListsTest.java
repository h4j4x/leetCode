package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTwoLinkedListsTest {
    @Test
    public void test() {
        IntersectionTwoLinkedLists executor = new IntersectionTwoLinkedLists();

        ListNode common = createList(new int[] {2,4}, null);
        ListNode headA = createList(new int[] {1,9,1}, common);
        ListNode headB = createList(new int[] {3}, common);
        ListNode result = executor.getIntersectionNode(headA, headB);
        Assertions.assertEquals(common, result);

        common = createList(new int[] {1,8,4,5}, null);
        headA = createList(new int[] {4}, common);
        headB = createList(new int[] {5,6}, common);
        result = executor.getIntersectionNode(headA, headB);
        Assertions.assertEquals(common, result);

        headA = createList(new int[] {2,6,4}, null);
        headB = createList(new int[] {1,5}, null);
        result = executor.getIntersectionNode(headA, headB);
        Assertions.assertNull(result);

        headA = headB = createList(new int[] {1}, null);
        result = executor.getIntersectionNode(headA, headB);
        Assertions.assertEquals(headA, result);
    }

    private ListNode createList(int[] values, ListNode next) {
        ListNode head = null;
        ListNode node = null;
        for (int value : values) {
            if (head == null) {
                head = node = new ListNode(value);
            } else {
                node.next = new ListNode(value);
                node = node.next;
            }
        }
        if (node != null) {
            node.next = next;
        }
        return head;
    }
}
