package code.LeetCode.offer.qustion13;

import java.util.Scanner;

public class Solution {


    private boolean[][] marked;
    public int movingCount(int m, int n, int k) {
        int[][] board = new int[m][n];
//        int res = 0;
        marked = new boolean[m][n];
        int res = search(board, 0, 0, m, n, k,0);
        return res;
    }

    private int search(int[][] board, int x, int y,int m, int n,int s,int num){
        int[][] direction = {{-1,0},{0,1},
                {1,0},{0,-1}};
        if(gitDigitSum(x)+gitDigitSum(y) > s){
            return 0;
        }
        else {
            marked[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newX = x + direction[i][0];
                int newY = y + direction[i][1];
                if( inArea(newX,newY,m,n) && !marked[newX][newY] && gitDigitSum(x)+gitDigitSum(y) <= s){
                    num = 1 + search(board,newX,newY,m,n,s,num);
                }
            }
            marked[x][y] = false;
        }
        return num;
    }
    private boolean inArea(int x, int y,int m, int n){
        if(x >= 0 && x < m && y < n && y >= 0 )
            return true;
        return false;
    }
    private int gitDigitSum(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().movingCount(2,3,1));
    }
}
