package com.ajax.leetcode.leetCode;

import com.ajax.leetcode.leetCode.auxiliary.ListNode;

// https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode theHead = head;
        ListNode theNext = null;
        if (theHead != null) {
            theNext = theHead.next;
            theHead.next = null;
        }
        while (theNext != null) {
            ListNode newHead = new ListNode(theNext.val);
            newHead.next = theHead;
            theNext = theNext.next;
            theHead = newHead;
        }
        return theHead;
    }
}
