package code.LeetCode.question1_100.question24;


import code.LeetCode.LinkedListTest.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;

        while (p.next != null && p.next.next != null ){

            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;

            p.next = node2;
            node1.next = next;
            node2.next = node1;

            p = node1;

        }
        return dummyHead.next;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        ListNode head = new ListNode(arr);
        System.out.println(head);

        head = (new Solution()).swapPairs(head);
        System.out.println(head);
    }
}
