package com.ajax.leetcode.leetCode.auxiliary;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode fromArray(int[] values) {
        ListNode result = null;
        for (int i = values.length - 1; i >= 0; i--) {
            result = new ListNode(values[i], result);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode listNode)) return false;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return "" + val + ((next != null) ? ", " + next : "");
    }
}
