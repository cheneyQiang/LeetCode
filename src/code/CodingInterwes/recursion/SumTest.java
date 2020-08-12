package code.CodingInterwes.recursion;

public class SumTest {

    public static int addFromToN(int n){
        if(n < 0){
            return 0;
        } else
            return n + addFromToN(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(addFromToN(10));
    }
}
