//All codes in this consider matrix starting from 3,3 and ending with 0,0

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        //System.out.println(mazee(3, 3));
        //mazePrintPath("", 3, 3);
        // ArrayList<String> ans = new ArrayList<>();
        // ans.addAll(mazeListDiagonal("", 3, 3));
        // System.out.println(ans);
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        mazePathWithRestrictions("",board,0,0);
    }   
    
    static int mazee(int r , int c){
        if( r==1 || c==1){
            return 1;
        }

        int left = mazee(r-1, c);
        int right = mazee(r, c-1);

        return left+right;
    }

    static void mazePrintPath(String p,int r , int c){
        if( r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            mazePrintPath(p+'D', r-1, c);
        }
        if(c>1){
            mazePrintPath(p+'R', r, c-1);
        }

        return;
    }

    static ArrayList<String> mazeList(String p , int r , int c){
        if( r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(mazeList(p+'D', r-1, c));
        }
        if(c>1){
            ans.addAll(mazeList(p+'R', r, c-1));
        }

        return ans;
    } 

    static ArrayList<String> mazeListDiagonal(String p , int r , int c){
        if( r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        //V -> Vertical , H -> Horizontal , D -> Diagonal
        if(r>1 && c>1){
            ans.addAll(mazeListDiagonal(p+'D', r-1, c-1));//For diagonal movement
        }
        if(r>1){
            ans.addAll(mazeListDiagonal(p+'V', r-1, c));
        }
        if(c>1){
            ans.addAll(mazeListDiagonal(p+'H', r, c-1));
        }

        return ans;
    } 

    //Maze with obstacles
    //This is a matrix starting with 0,0 and ending with 2,2
    static void mazePathWithRestrictions(String p,boolean[][] maze,int r , int c){
        //Our matrix contains obstacle at false value of maze

        if( r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
            return;

        if(r<2){
            mazePathWithRestrictions(p+'D',maze, r+1, c);
        }
        if(c<2){
            mazePathWithRestrictions(p+'R',maze, r, c+1);
        }

        return;
    }
}
