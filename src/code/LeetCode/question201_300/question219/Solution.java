package code.LeetCode.question201_300.question219;

import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length <= 1)
            return false;

        if(k <= 0)
            return false;
        HashSet<Integer> vector = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(vector.contains(nums[i]))
                return true;
            vector.add(nums[i]);
            if(vector.size() == k + 1)
                vector.remove(nums[i - k]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {99,99};
//        int[] nums = {1};
        System.out.println(new Solution().containsNearbyDuplicate(nums,2));
    }
}
