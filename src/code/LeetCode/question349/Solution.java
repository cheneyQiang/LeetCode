package code.LeetCode.question349;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>  data1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            data1.add(nums1[i]);
        }
        HashSet<Integer> data2 = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if(data1.contains(nums2[i]))
                data2.add(nums2[i]);
        }
        int[] res = new int[data2.size()];
        int index = 0;
        for (int temp:data2
             ) {
            res[index++] = temp;
        }
        return res;
    }
}
