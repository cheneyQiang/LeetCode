package code.LeetCode.question201_300.question283;

public class Solution {
//        public void moveZeroes(int[] nums) {
//    //        int[] noZeroes = new int[nums.length];
//            ArrayList<Integer> noZeroes = new ArrayList<>();
//            for (int i = 0; i < nums.length; i++) {
//                if(nums[i] != 0)
//                    noZeroes.add(nums[i]);
//            }
//            for (int i = 0; i < noZeroes.size(); i++) {
//                nums[i] = noZeroes.get(i);
//            }
//            for (int i = noZeroes.size(); i < nums.length; i++) {
//                nums[i] = 0;
//            }
//        }
//    public void moveZeroes(int[] nums) {
//       int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != 0){
//                nums[k++] = nums[i];
//            }
//        }
//        for (int i = k; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }
    public void moveZeroes(int[] nums) {
        int k = 0;
//        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
    }
//    private void swap(int[] nums)
}
