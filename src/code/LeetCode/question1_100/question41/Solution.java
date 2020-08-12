package code.LeetCode.question1_100.question41;

import static java.lang.Math.abs;

public class Solution {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if(nums[i] <= 0  ){
                nums[i] =  n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int num = abs(nums[i]);
            if( num <= nums.length){
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0)
                return i + 1;
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
}
