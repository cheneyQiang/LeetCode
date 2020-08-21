package code.huawei.date0819;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 默认的PriorityQueue, 底层是最小堆
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0 ; i < 10 ; i ++){
            int num = (int)(Math.random() * 100);
            pq.add(num);
            System.out.println("insert " + num + " in priority queue.");
        }

        while (!pq.isEmpty())
            System.out.print(pq.poll() + " ");

        System.out.println();
        System.out.println();


        // 使用lambda表达式，创建底层是最大堆的PriorityQueue
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, (a, b) -> b - a);

        for(int i = 0 ; i < 10 ; i ++){
            int num = (int)(Math.random() * 100);
            pq2.add(num);
            System.out.println("insert " + num + " in priority queue.");
        }

        while (!pq2.isEmpty())
            System.out.print(pq2.poll() + " ");

        System.out.println();
        System.out.println();


        // 使用自定义的Comparator，创建个性化的PriorityQueue
        // 注意：也可以使用lambda表达式。在这里只是为了演示PriorityQueue的不同用法
        // 同理，上一个例子也可以使用自定义的Comparator的方式完成
        class myCmp implements Comparator<Integer> {
            @Override
            public int compare(Integer a, Integer b){
                if(a%10 != b%10)
                    return a%10 - b%10;
                return a - b;
            }
        }
        PriorityQueue<Integer> pq3 = new PriorityQueue<Integer>(10, new myCmp());

        for(int i = 0 ; i < 10 ; i ++){
            int num = (int)(Math.random() * 100);
            pq3.add(num);
            System.out.println("insert " + num + " in priority queue.");
        }

        while (!pq3.isEmpty())
            System.out.print(pq3.poll() + " ");

        System.out.println();
        System.out.println();
    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int M = sc.nextInt();
//        int N = sc.nextInt();
////        if(M < 10 &&  M> 1000){}
//        int[][] res = new int[N][2];
//        Main main = new Main();
//        if(M == 0 || N == 0){
//
//        }else {
//            main.getResult(res,M,N,0,0,1,0);
//        }
//        System.out.print("[");
//        for (int i = 0; i < N; i++) {
//            if (res[i][0] == 0 && res[i][1] == 0){
//                break;
//            }
//            System.out.print("[");
//            System.out.print(res[i][0] + ",");
//            if(res[i][1] == 0)
//                System.out.print(res[i][1] + ",");
//            System.out.print(res[i][1]);
//            System.out.print("]");
//        }
//        System.out.println("]");
//    }
//    public void getResult(int[][] res, int M, int N, int x, int y, int num, int k){
//        if(M <= 0 || N<= 0)
//            return;
//
//        for (int i = 0; i < N; i++) {
//            if(num % 10 ==7 && (num/10%10)%2 == 1 ){
//                res[k][0] = x;
//                res[k][1] = y + i;
//                k++;
//            }
//            num++;
//        }
//        for (int i = 1; i < M - 1; i++) {
//            if(num % 10 ==7 && (num/10%10)%2 == 1 ){
//                res[k][0] = x + i;
//                res[k][1] = y + N -1;
//                k++;
//            }
//            num++;
//        }
//        if(M > 1){
//            for (int i = N -1; i >= 0; i--) {
//                if(num % 10 ==7 && (num/10%10)%2 == 1 ) {
//                    res[k][0] = x + M -1;
//                    res[k][1] = y;
//                    k++;
//                }
//                num++;
//            }
//        }
//        if(N > 1){
//            for (int i = M -2; i > 0; i--) {
//                if(num % 10 ==7 && (num/10%10)%2 == 1 ) {
//                    res[k][0] = x + i;
//                    res[k][1] = y;
//                    k++;
//                }
//                num++;
//            }
//        }
//        getResult(res,M-2,N-2,x+1,y+1,num,k);
//    }
}
