//https://leetcode.com/problems/word-search/

public class code {
    public static void main(String[] args) {
        
    }

    static boolean exist(char[][] board, String word) {

        boolean[][] check = new boolean[board.length][board[0].length];

        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean result = backtrack(board,word, check, i, j, 0);
                    if(result)
                        return true;
                }
            }
        }
        return false;
    }

    static boolean backtrack(char[][] board ,String word, boolean[][] check , int row , int col , int index){
        if(index == word.length())
            return true;

        if(check[row][col] || board[row][col] != word.charAt(index) || col < 0 || col >= board[0].length || row < 0 || row >= board.length){
            return false;
        }

        check[row][col] = true;

        if(
            backtrack(board, word, check, row+1, col, index+1) ||
            backtrack(board, word, check, row-1, col, index+1) ||
            backtrack(board, word, check, row, col+1, index+1) ||
            backtrack(board, word, check, row, col-1, index+1) 
        ){
            return true;
        }

        check[row][col] = false;

        return false;
    }
}
