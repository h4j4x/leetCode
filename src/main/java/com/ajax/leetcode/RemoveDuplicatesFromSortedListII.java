package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        /*
        ListNode node = head;
        int last = 1_000;
        while (node.next != null && (last == node.val || node.val == node.next.val)) {
            last = node.val;
            node = node.next;
        }
        if (node.val != last) {
            node.next = deleteDuplicates(node.next);
            return node;
        }
        return null;
        */

        ListNode root = new ListNode(0, head);
        ListNode last = root;
        ListNode node = head;
        while (node != null) {
            if (node.next != null && node.val == node.next.val) {
                while (node.next != null && node.val == node.next.val) {
                    node = node.next;
                }
                last.next = node.next;
            } else {
                last = last.next;
            }
            node = node.next;
        }
        return root.next;
    }
}
