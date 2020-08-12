package code.LeetCode.question1_100.question16;

import java.util.Arrays;
import static java.lang.Math.abs;

public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int sum = 0;
        ans = nums[0] + nums[1] + nums[2];
        int start,end;
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1])
                continue;;
            start = i + 1;
            end = nums.length - 1;
            while(start < end){
                sum = nums[i] + nums[start] + nums[end];
                if(abs(target - sum) < abs(target - ans))
                    ans = sum;
                if(target < sum) {
                    end--;
                }else if(target > sum){
                    start++;
                }else
                    return sum;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,-3};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
}