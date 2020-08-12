package code.LeetCode.question201_300.question209;

public class Solution {
//    public int minSubArrayLen(int s, int[] nums) {
//        int start = 0;
//        int end = 0;
//        int sum = nums[start];
//        int n = nums.length;
//        int ans = Integer.MAX_VALUE;
//        while(end < n){
//            sum += nums[end];
//            while(sum >= s){
//                ans =  Math.min(ans,end - start + 1);
//                sum -= nums[start];
//                start++;
//            }
//            end++;
//        }
//        return ans==Integer.MAX_VALUE ? 0 : ans;
//    }

    public int minSubArrayLen(int s, int[] nums) {
        int l = 0;
        int r = -1;
        int res = nums.length + 1;
        int sum = 0;
        while(l < nums.length - 1){
            if(r + 1 < nums.length - 1 && sum < s){
                r++;
                sum += nums[r];
            }else{
                sum -= nums[l];
                l++;
            }
            if(sum >= s)
             res = Math.min(res,r - l + 1);
        }
        return res == nums.length + 1 ? 0 : res;
    }

}
