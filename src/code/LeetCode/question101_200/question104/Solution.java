package code.LeetCode.question101_200.question104;


import code.LeetCode.Node.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }
    private int getDepth(TreeNode node){
        if(node == null)
            return 0;
        int left = getDepth(node.left);
        int right = getDepth(node.right);
        return Math.max(left,right);
    }
}
