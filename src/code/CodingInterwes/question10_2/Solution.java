package code.CodingInterwes.question10_2;

public class Solution {
    public static int numWays(int n) {
        int a = 0, b = 1, sum = 0;
        if(n < 2){
            return n;
        }
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            b = a;
            a = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numWays(0));
    }
}
