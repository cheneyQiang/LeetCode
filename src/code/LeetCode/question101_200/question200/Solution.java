package code.LeetCode.question101_200.question200;

public class Solution {
//    int[][] direction = {{0,-1},{0,1},{1,0},{0,-1}};
    int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int m; //行数
    int n; //列数
    boolean[][] marked;
    private boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n ;
    }
    private void dfs(char[][] grid, int x, int y){
        marked[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + direction[i][0];
            int newY = y + direction[i][1];
            if(inArea(newX,newY) && !marked[newX][newY] && grid[newX][newY] == '1'){
                dfs(grid,newX,newY);
            }
        }
        return;
    }



    public int numIslands(char[][] grid) {
        int res = 0;
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        m = grid.length;
        n = grid[0].length;
        marked = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !marked[i][j]){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char grid1[][] = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        System.out.println((new Solution()).numIslands(grid1));

        char grid2[][] = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println((new Solution()).numIslands(grid2));
        // 3

    }
}
