package code.LeetCode.question454;

import java.util.HashMap;

public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> vector = new HashMap<>();
        int res = 0 ;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                if(!vector.containsKey(sum)){
                    vector.put(sum,1);
                }else{
                    Integer value = vector.get(sum) + 1;
                    vector.put(sum,value);
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int comparable = C[i] + D[j];
                if(vector.containsKey(-comparable)){
                 res += vector.get(-comparable);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] A = {-1,-1};
        int[] B = {-1, 1};
        int[] C = {-1, 1};
        int[] D = {1, -1};
        System.out.println(test.fourSumCount(A,B,C,D));
    }
}
