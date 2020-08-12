package code.CodingInterwes.question12;

public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {//行数
            for (int j = 0; j < board[0].length; j++) {//列数

            }
        }
        return false;
    }

//    private boolean dfs(char[][] board, char[] words, int i, int j, int k){
//        if(i > board.length - 1 || j > board[0].length-1 || i < 0 || j < 0 || board[i][j] != words[k])
//
//        return true;
//    }

    public static void main(String[] args) {
        char[][] board ={{'a','b','c'},
                         {'e','f','g'}};
        System.out.println(board.length);//行数
        System.out.println(board[0].length);//列数
    }
}
