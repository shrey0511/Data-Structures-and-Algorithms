public class nKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        nKnightss(board, 0, 0, 4);
    }

    static void nKnightss(boolean[][] board , int row , int col , int knights){
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board.length-1){
            return;
        }

        if(col == board.length){
            nKnightss(board, row+1, 0, knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            nKnightss(board, row, col+1, knights-1);
            board[row][col] = false;
        }

        nKnightss(board, row, col+1, knights);

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board , int row , int col){
        if(row < board.length && row >= 0 && col<board.length && col >= 0){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }    
    }
}
