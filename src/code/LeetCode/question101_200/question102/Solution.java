package code.LeetCode.question101_200.question102;

import code.LeetCode.Node.TreeNode;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        LinkedList<Pair<TreeNode,Integer>> queue = new LinkedList<>();
        queue.addLast(new Pair<TreeNode,Integer>(root,0));
        while(!queue.isEmpty()){
            Pair<TreeNode,Integer> front = queue.removeFirst();
            TreeNode node = front.getKey();
            int level = front.getValue();

            if(level == res.size()){
                res.add(new ArrayList<>());
            }
            res.get(level).add(node.val);

            if(node.left != null){
                queue.addLast(new Pair<>(node.left,level + 1));
            }
            if(node.right != null){
                queue.addLast(new Pair<>(node.right,level + 1));
            }

        }
        return  res;
    }
}
