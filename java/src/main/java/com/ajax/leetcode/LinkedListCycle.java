package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;

// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head != null) {
            ListNode slowNode = head;
            ListNode fastNode = head.next;
            while (slowNode != null && fastNode != null && fastNode.next != null) {
                if (fastNode == slowNode) {
                    return true;
                }
                slowNode = slowNode.next;
                fastNode = fastNode.next.next;
            }
        }
        return false;
    }
}
