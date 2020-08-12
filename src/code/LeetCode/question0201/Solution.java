package code.LeetCode.question0201;


import java.util.HashSet;

class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        if(head == null)
            return head;
        HashSet<Integer> buffer = new HashSet<Integer>();
        ListNode post = head;
        buffer.add(head.val);
        while(post.next != null){
            ListNode cur = post.next;
            if(buffer.add(cur.val)){
                post = post.next;
            }else{
                post.next = post.next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,1};
        ListNode head = new ListNode(nums[0]);
//        head.val = nums[0];
        ListNode node = head.next;
        for (int i = 1; i < nums.length; i++) {
               node.val= nums[i];
               node = node.next;
        }
        System.out.println(removeDuplicateNodes(head));
    }
}