package code.LeetCode.question1_100.question75;

public class Solution {
//    public void sortColors(int[] nums) {
//        int[] count = new int[3];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0 ){
//                count[0] ++;
//            } else if(nums[i] == 1){
//                count[1] ++;
//            }else{
//                assert( i!=2);
//                count[2]++;
//            }
//        }
//        int index = 0;
//        for (int i = 0; i < count.length; i++) {
//            for (int j = 0; j < count[i]; j++) {
//                nums[index++] = i;
//            }
//        }
//    }

    /**
     * 三路快排
     * @param nums
     */
    public void sortColors(int[] nums) {
        int zeros = -1;
        int two = nums.length;
        for (int i = 0; i < nums.length;) {
            if(nums[i] == 1){
                i++;
            }else if(nums[i] == 0){
                zeros++;
                swap(nums,i,zeros);
            }else{
                two--;
                swap(nums,i,two);
                i++;
            }
        }
    }
    private void swap(int[] nums,int i, int j){
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
