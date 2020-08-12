package code.LeetCode.question1_100.question1;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> vector= new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int compare = target - nums[i];
            if(vector.containsKey(compare)){
                int[] res = {vector.get(compare),i};
                return res;
            }else{
                vector.put(nums[i],i);
            }
        }
        return null;
    }
}
