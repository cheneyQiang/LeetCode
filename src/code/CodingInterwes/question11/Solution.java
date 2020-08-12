package code.CodingInterwes.question11;

public class Solution {
    public static int minArray(int[] numbers) {
        int index1 = 0;
        int index2 = numbers.length -1;
        int indexMid = 0;
        while(index2 >index1){
            indexMid = (index1 + index2) / 2;
            if(numbers[index2] < numbers[indexMid]){
                index1 = indexMid + 1;
            }else if(numbers[index2] > numbers[indexMid]){
                index2 = indexMid;
            }else{
                index2--;
            }
        }
        return numbers[index1];
    }

    public static void main(String[] args) {
        int[] numbs = {2,2,2,0,1};
        System.out.println(minArray(numbs));
    }
}
