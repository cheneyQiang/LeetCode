package code.CodingInterwes.question10_1;

public class Question10_1 {
    public static long fib(int n) {
        int[] result = {0,1};
        if(n < 2)
            return result[n];
        long fibN = 0;
        long fibNMinusOne = 1;
        long fibNMinusTwo = 0;
        for (int i = 2; i <= n; ++i) {
            fibN = (fibNMinusOne + fibNMinusTwo) % 1000000007;

            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }

    public static void main(String[] args) {
        System.out.println(fib(45));
    }
}
