package code.LeetCode.question1_100.question3;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int l = 0;
        int r = -1;
        int res = 0;
        while(l < s.length()){
            if(r + 1 < s.length() && freq[s.charAt(r + 1)] == 0){
                r++;
                freq[s.charAt(r)] = 1;
            }else {
                freq[s.charAt(l)] = 0;
                l++;
            }
            res = Math.max(res,r - l + 1);
        }
        return  res;
    }

    public static void main(String[] args) {
        int c = new Solution().lengthOfLongestSubstring("aadfagdgfs");
    }
}
