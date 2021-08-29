package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;

// https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head != null) {
            int lastPos = -1;
            ListNode node = head;
            while (node != null) {
                int pos = positionOf(node, head);
                if (pos <= lastPos) {
                    return node;
                }
                lastPos = pos;
                node = node.next;
            }
        }
        return null;
    }

    private int positionOf(ListNode node, ListNode head) {
        int pos = 0;
        ListNode value = head;
        while (value != node) {
            pos++;
            value = value.next;
        }
        return pos;
    }
}
