//https://www.geeksforgeeks.org/rat-in-a-maze/

import java.util.*;

public class code {

    private static String direction = "DLRU";

    private static int[] dirR = {1,0,0,-1};
    private static int[] dirC = {0,-1,1,0};

    private static void findPath(int r, int c, int n, int[][] maze, StringBuilder currentPath, ArrayList<String> result){
        
        if(r == n-1 && c == n-1){
            result.add(currentPath.toString());
            return;
        }

        maze[r][c] = 0; //Path is taken

        for(int i = 0 ; i<4 ; i++){

            int newR = r + dirR[i];
            int newC = c + dirC[i];

            if(isValid(newR,newC,n,maze)){

                currentPath.append(direction.charAt(i));

                findPath(newR, newC, n, maze, currentPath, result);

                currentPath.deleteCharAt(currentPath.length()-1);
            }
        }

        maze[r][c] = 1;

    }

    private static boolean isValid(int r, int c, int n, int[][] maze) {
        return (r >= 0 && c >= 0 && r < n && c < n && maze[r][c] == 1);    
    }

    public static void main(String[] args) {
        int[][] maze = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 1, 1, 0, 0 },
            { 0, 1, 1, 1 }
        };

        int n = maze.length;

        ArrayList<String> result = new ArrayList<>();
        StringBuilder currentPath = new StringBuilder();

        if(maze[0][0] != 0 && maze[n-1][n-1] != 0){
            findPath(0,0,n,maze,currentPath,result);
        }

        for(String path : result){
            System.out.println(" "+path);
        }
        System.out.println();
    }
}

// Time Complexity: O(3^(m*n)), because on every cell we have to try 3 different directions.
// Auxiliary Space: O(m*n), Maximum Depth of the recursion tree(auxiliary space).
