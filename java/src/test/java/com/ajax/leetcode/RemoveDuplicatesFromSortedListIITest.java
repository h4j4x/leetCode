package com.ajax.leetcode;

import com.ajax.leetcode.auxiliary.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListIITest {
    @Test
    public void test() {
        ListNode input = ListNode.fromArray(new int[] {1,2,3,3,4,4,5});
        ListNode expected = ListNode.fromArray(new int[] {1,2,5});
        ListNode result = RemoveDuplicatesFromSortedListII.deleteDuplicates(input);
        Assertions.assertEquals(expected, result);

        input = ListNode.fromArray(new int[] {1,1,1,2,3});
        expected = ListNode.fromArray(new int[] {2,3});
        result = RemoveDuplicatesFromSortedListII.deleteDuplicates(input);
        Assertions.assertEquals(expected, result);

        input = ListNode.fromArray(new int[] {1,1,1,2,3,3});
        expected = ListNode.fromArray(new int[] {2});
        result = RemoveDuplicatesFromSortedListII.deleteDuplicates(input);
        Assertions.assertEquals(expected, result);

        input = ListNode.fromArray(new int[0]);
        expected = ListNode.fromArray(new int[0]);
        result = RemoveDuplicatesFromSortedListII.deleteDuplicates(input);
        Assertions.assertEquals(expected, result);

        input = ListNode.fromArray(new int[] {1});
        expected = ListNode.fromArray(new int[] {1});
        result = RemoveDuplicatesFromSortedListII.deleteDuplicates(input);
        Assertions.assertEquals(expected, result);
    }
}
