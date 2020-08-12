package code.LeetCode.question1_100.question46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private boolean[] used;
    public List<List<Integer>> permute(int[] nums) {

        if(nums.length <= 0 || nums == null){
            return res;
        }
        LinkedList<Integer> p = new LinkedList<Integer>();
        used = new boolean[nums.length];
        generatePermutation(nums,0,p);
        return res;
    }

    private void generatePermutation(int[] nums, int index, LinkedList<Integer> p){
        if(index == nums.length){
            res.add((LinkedList<Integer>)p.clone());
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i] = false){
                used[i] = true;
                p.add(nums[i]);
                generatePermutation(nums ,index + 1, p);
                p.remove(nums[i]);
                used[i] = false;
            }
        }
        return;
    }

}
