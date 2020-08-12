package code.LeetCode.question201_300.question237;

import code.LeetCode.LinkedListTest.ListNode;

public class Solution {
    void deleteNode(ListNode node) {

        if(node == null || node.next == null)
            throw new IllegalArgumentException("node should be valid and can not be the tail node.");

        node.val = node.next.val;
        node.next = node.next.next;

    }
}
