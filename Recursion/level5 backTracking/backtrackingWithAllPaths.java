import java.util.Arrays;

public class backtrackingWithAllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathArray("",board,0,0,path,1);
    }   
    
    static void allPaths(String p , boolean[][] maze , int r , int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
            return;

        //Block taken in the current path
        maze[r][c] = false;

        if(r < maze.length-1){
            allPaths(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            allPaths(p+'R', maze, r, c+1);
        }
        if(r>0){
            allPaths(p+'U', maze, r-1, c);
        }
        if(c>0){
            allPaths(p+'L', maze, r, c-1);
        }

        //When all recursion calls are done , revert the maze to original for new paths
        //This is called backtracking , no changes of the previous function should
        //remain in the new path
        maze[r][c] = true;
    }

    //Another function to print the path array with the path
    //Take the step variable
    //Update the path array
    //Print it in base condition
    //Backtrack to remove the marked values in path array
    static void allPathArray(String p , boolean[][] maze , int r , int c , int[][] path , int steps){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c])
            return;

        //Block taken in the current path
        maze[r][c] = false;
        path[r][c] = steps;

        if(r < maze.length-1){
            allPathArray(p+'D', maze, r+1, c , path , steps+1);
        }
        if(c < maze[0].length-1){
            allPathArray(p+'R', maze, r, c+1, path , steps+1);
        }
        if(r>0){
            allPathArray(p+'U', maze, r-1, c, path , steps+1);
        }
        if(c>0){
            allPathArray(p+'L', maze, r, c-1, path , steps+1);
        }

        //When all recursion calls are done , revert the maze to original for new paths
        //This is called backtracking , no changes of the previous function should
        //remain in the new path
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
