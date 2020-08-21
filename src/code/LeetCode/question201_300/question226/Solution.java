package code.LeetCode.question201_300.question226;

import code.LeetCode.Node.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {

        return invertTree(root);
    }
    private TreeNode invert(TreeNode node){
        if(node == null)
            return null;
       TreeNode left =  invertTree(node.left);
       TreeNode right = invertTree(node.right);
       node.left = right;
       node.right = left;
        return node;
    }
}
