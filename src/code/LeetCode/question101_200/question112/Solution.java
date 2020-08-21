package code.LeetCode.question101_200.question112;


import code.LeetCode.Node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
//    public class TreeNode{
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x){
//            val = x;
//        }
//    }
//    public boolean hasPathSum(TreeNode root, int sum) {
//        if(root == null){
//            return  false;
//        }
//        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
//        Queue<Integer> queVal = new LinkedList<Integer>();
//        queNode.add(root);
//        queVal.add(root.val);
//        while(!queNode.isEmpty()){
//            TreeNode nowNode = queNode.poll();
//            int temp = queVal.poll();
//            if(nowNode.left == null && nowNode.right == null){
//                if(temp == sum){
//                    return true;
//                }
//                continue;
//            }
//            if(nowNode.left != null){
//                queVal.offer(nowNode.left.val + temp);
//                queNode.offer(nowNode.left);
//            }
//            if(nowNode.right != null){
//                queNode.offer(nowNode.right);
//                queVal.offer(nowNode.right.val +temp);
//            }
//        }
//        return false;
//    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return getSum(root,sum);
    }
    private boolean getSum(TreeNode node, int sum){
        if(node == null)
            return false;
        if(node.left == null || node.right == null)
            return node.val == sum;

        return getSum(node.left,sum - node.val) || getSum(node.right,sum - node.val);

    }
}
