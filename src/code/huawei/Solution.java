package code.huawei;

import java.util.Scanner;

public class Solution {
    private boolean[][] marked;
    public int exist() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] board = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
             board[i][j]=sc.nextInt();
            }
        }
        int res = 0;
        marked = new boolean[m][n];
        if(search(board,0,0,m,n,s)){
            res = 1;
        } else{
            res = 0;
        }
        return res;
    }

    private boolean search(int[][] board, int x, int y,int m, int n,int s){
         int[][] direction = {{-s,0},{0,s},
                {s,0},{0,-s}};
        if(x == m -1 && y == n - 1){
            return board[x][y] == 1;
        }
        if(board[x][y] == 1){
            marked[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newX = x + direction[i][0];
                int newY = y + direction[i][1];
                if( inArea(newX,newY,m,n) && !marked[newX][newY]
                        && board[newX][newY] == 1 && search(board,newX,newY,m,n,s)){
                    return true;
                }
            }
            marked[x][y] = false;
        }
        return false;
    }
    private boolean inArea(int x, int y,int m, int n){
        if(x >= 0 && x < m && y < n && y >= 0 )
            return true;
        return false;
    }

    public static void main(String[] args) {

        if((new code.huawei.Solution()).exist() == 1)
            System.out.println("found ");
        else
            System.out.println("can not fount");
    }

}





