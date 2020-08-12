package code.LeetCode.question201_300.question206;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x){
        val = x;
    }
    public ListNode(int[] nums){
        if (nums == null)
            throw new IllegalArgumentException("arr can not be empty.");
        this.val = nums[0];
        ListNode curNode = this;
        for (int i = 1; i < nums.length; i++) {
            curNode.next = new ListNode(nums[i]);
            curNode = curNode.next;
        }
    }
    // 返回以当前ListNode为头结点的链表信息字符串
    @Override
    public String toString(){

        StringBuilder s = new StringBuilder("");
        ListNode curNode = this;
        while(curNode != null){
            s.append(Integer.toString(curNode.val));
            s.append(" -> ");
            curNode = curNode.next;
        }
        s.append("NULL");
        return s.toString();
    }
}
