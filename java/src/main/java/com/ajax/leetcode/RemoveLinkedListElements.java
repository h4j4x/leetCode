package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;

// https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = null;
        ListNode theHead = head;
        ListNode node = head;
        while (node != null) {
            if (node.val == val) {
                if (previous != null) {
                    previous.next = node.next;
                }
                if (node.equals(theHead)) {
                    theHead = node.next;
                }
            } else {
                previous = node;
            }
            node = node.next;
        }
        return theHead;
    }
}
