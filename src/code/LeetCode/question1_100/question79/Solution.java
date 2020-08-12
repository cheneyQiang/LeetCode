package code.LeetCode.question1_100.question79;

public class Solution {
    private int[][] direction = {{-1,0},{0,1},
            {1,0},{0,-1}};
    private int m;//行数
    private int n;//列数

    private boolean[][] marked;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        if(board == null || word == null)
            throw new IllegalArgumentException("board or word can not be null!");
        if(m == 0)
            throw new IllegalArgumentException("board can not be empty.");
        if(n == 0)
            throw new IllegalArgumentException("board can not be empty.");

        marked = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               if (searchWord(board,word,i,j,0))
                return true;
            }
        }
        return false;
    }

    private boolean searchWord(char[][] board, String word, int x, int y, int index){
        if(index == word.length() -1){
            return board[x][y] == word.charAt(index);
        }
        if(board[x][y] == word.charAt(index)){
            marked[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newX = x + direction[i][0];
                int newY = y + direction[i][1];
                if( inArea(newX,newY) && !marked[newX][newY] &&
                        searchWord(board,word,newX,newY,index+ 1)){
                    return true;
                }
            }
            marked[x][y] = false;
        }
        return false;
    }



    private boolean inArea(int x, int y){
        if(x >= 0 && x < m && y < n && y >= 0 )
            return true;
        return false;
    }

    public static void main(String[] args) {
//        char[][] b1 = { {'A','B','C','E'},
//                        {'S','F','C','S'},
//                        {'A','D','E','E'}};
//        String words[] = {"ABCCED", "SEE", "ABCB" };
//        for(int i = 0 ; i < words.length ; i ++)
//            if((new Solution()).exist(b1, words[i]))
//                System.out.println("found " + words[i]);
//            else
//                System.out.println("can not found " + words[i]);
        char[][] b1 = {{'a'}};
        if((new Solution()).exist(b1,"a"))
            System.out.println("found " + "a");
        else
            System.out.println("can not fount  " + "a");
    }

}





