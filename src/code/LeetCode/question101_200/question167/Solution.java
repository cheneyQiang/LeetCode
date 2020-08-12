package code.LeetCode.question101_200.question167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r= numbers.length - 1;
        int[] res = new int[2];
        while(l < r){
            if(numbers[l] + numbers[r] == target){
                res[0] = l + 1;
                res[1] = r + 1;
                return res;
            } else if(numbers[l] + numbers[r] > target){
                r--;
            }else{
                l++;
            }
        }
        throw new IllegalStateException("The input has no solution");
    }
}
