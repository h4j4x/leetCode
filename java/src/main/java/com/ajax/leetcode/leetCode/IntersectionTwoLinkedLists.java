package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode nodeA = null;
        ListNode nodeB = null;
        do {
            nodeA = nodeA == null ? headA : nodeA.next;
            nodeB = nodeB == null ? headB : nodeB.next;
        } while (nodeA != nodeB);
        return nodeA;
    }
}
