package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignLinkedListTest {
    @Test
    public void test() {
        DesignLinkedList list = new DesignLinkedList();
        Assertions.assertEquals(-1, list.get(0));
        Assertions.assertEquals(-1, list.get(1));
        list.addAtHead(1);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(-1, list.get(1));
        list.addAtTail(3);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(3, list.get(1));
        list.addAtIndex(1, 2);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
        list.deleteAtIndex(1);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(3, list.get(1));
        Assertions.assertEquals(-1, list.get(2));

        list = new DesignLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3, 0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        Assertions.assertEquals(4, list.get(4));
    }
}
