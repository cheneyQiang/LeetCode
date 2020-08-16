package code.LeetCode.question101_200.question144;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }
    private void traversal(TreeNode node,List<Integer> res){
        if(node != null){
            res.add(node.val);
            traversal(node.left,res);
            traversal(node.right,res);
        }
    }
}
