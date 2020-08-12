package code.LeetCode.question1_100.question67;

public class Solution {
    public static String addBinary(String a, String b){
        String res = null;
//        int r = Integer.parseInt(a,2) + Integer.parseInt(b,2);
//        res = Integer.toBinaryString(r);
        int n = Math.max(a.length(),b.length()); //循环次数
        int carry = 0; //进位数0
        for (int i = 0; i < n; i++) {

        }
        return res;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));

    }
}
