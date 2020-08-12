package code.LeetCode.question350;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> data1 = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if(data1.containsKey(nums1[i])){
                data1.put(nums1[i],data1.get(nums1[i]) + 1);
            }else{
                data1.put(nums1[i],1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if(data1.containsKey(nums2[i])){
                result.add(nums2[i]);
                data1.put(nums2[i],data1.get(nums2[i]) - 1);
                if(data1.get(nums2[i]) == 0)
                    data1.remove(nums2[i]);
            }
        }
        int[] res= new int[result.size()];
        int index = 0;
        for (int temp:result
             ) {
            res[index++] = temp;
        }
        return res;
     }
}
