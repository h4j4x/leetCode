package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;

// https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode theHead = null;
        ListNode headLast = null;
        ListNode evenHead = null;
        ListNode evenLast = null;
        ListNode node = head;
        boolean even = false;
        while (node != null) {
            ListNode newNode = new ListNode(node.val);
            if (even) {
                if (evenLast != null) {
                    evenLast.next = newNode;
                }
                evenLast = newNode;
                if (evenHead == null) {
                    evenHead = evenLast;
                }
            } else {
                if (headLast != null) {
                    headLast.next = newNode;
                }
                headLast = newNode;
                if (theHead == null) {
                    theHead = headLast;
                }
            }
            node = node.next;
            even = !even;
        }
        if (headLast != null) {
            headLast.next = evenHead;
        }
        return theHead;
    }
}
