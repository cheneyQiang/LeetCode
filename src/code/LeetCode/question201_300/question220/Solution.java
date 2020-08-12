package code.LeetCode.question201_300.question220;

import java.util.TreeSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums == null || nums.length < 1)
            return  false;
        if(k < 0 || t < 0)
            return false;
        TreeSet<Integer> vector = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            int compare = t + nums[i];
            if(vector.floor(compare) != null && vector.floor(compare) >= nums[i] - t )
                return true;
            vector.add(nums[i]);
            if(vector.size() == k + 1)
                vector.remove(nums[i - k]);
        }
        return false;
    }
    private static void printBool(boolean b){
        System.out.println(b ? "True" : "False");
    }

    public static void main(String[] args) {

        int[] nums = {-2147483648, -2147483647};
        int k = 3;
        int t = 3;
        printBool((new Solution()).containsNearbyAlmostDuplicate(nums, k, t));
    }
}
