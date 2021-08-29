package com.ajax.leetcode.leetCode;

// https://leetcode.com/problems/design-linked-list/
public class DesignLinkedList {
    private ListNode<Integer> head;
    private int length;

    public DesignLinkedList() {
        length = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode<Integer> node = nodeAt(index);
        if (node != null) {
            return node.value;
        }
        return -1;
    }

    private ListNode<Integer> nodeAt(int index) {
        if (index >= 0 && index < length) {
            int value = 0;
            ListNode<Integer> node = head;
            while (node != null) {
                if (value == index) {
                    return node;
                }
                if (value > index) {
                    return null;
                }
                node = node.next;
                value++;
            }
        }
        return null;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(length, val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == 0 && length == 0) {
            head = new ListNode<>(val);
            length++;
        } else if (index == length) {
            ListNode<Integer> node = nodeAt(index - 1);
            if (node != null) {
                ListNode<Integer> newNode = new ListNode<>(val);
                newNode.prev = node;
                node.next = newNode;
                length++;
            }
        } else {
            ListNode<Integer> node = nodeAt(index);
            if (node != null) {
                ListNode<Integer> newNode = new ListNode<>(val);
                newNode.next = node;
                if (node.prev != null) {
                    node.prev.next = newNode;
                    newNode.prev = node.prev;
                }
                node.prev = newNode;
                if (index == 0) {
                    head = newNode;
                }
                length++;
            }
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index == 0 && head != null) {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
            length--;
        } else {
            ListNode<Integer> node = nodeAt(index);
            if (node != null) {
                ListNode<Integer> prev = node.prev;
                ListNode<Integer> next = node.next;
                if (prev != null) {
                    prev.next = next;
                }
                if (next != null) {
                    next.prev = prev;
                }
                length--;
            }
        }
    }

    private static class ListNode<T> {
        private final T value;
        private ListNode<T> prev;
        private ListNode<T> next;

        public ListNode(T value) {
            this.value = value;
        }
    }
}
