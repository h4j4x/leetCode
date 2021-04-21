package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode pNode = null;
        ListNode nNode = null;
        ListNode node = head;
        while (node != null) {
            count++;
            if (count >= n) {
                pNode = nNode;
                nNode = nNode == null ? head : nNode.next;
            }
            node = node.next;
        }
        if (pNode != null || nNode != null) {
            if (pNode == null) {
                return nNode.next;
            }
            if (nNode == null) {
                return pNode;
            }
            pNode.next = nNode.next;
        }
        return head;
    }
}
