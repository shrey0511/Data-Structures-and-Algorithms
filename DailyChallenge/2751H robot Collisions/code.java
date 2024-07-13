//https://leetcode.com/problems/robot-collisions/?envType=daily-question&envId=2024-07-13

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Stack<int[]> st = new Stack<>();

        int n = positions.length;
        int[][] robots = new int[n][3];

        for(int i = 0 ; i<n ; i++){
            robots[i][0] = positions[i];
            robots[i][1] = healths[i];
            robots[i][2] = directions.charAt(i) == 'R' ? 1 : -1;
        }

        Arrays.sort(robots , Comparator.comparingInt(a -> a[0]));

        for(int[] robot : robots){
            if(robot[2] == 1 ){
                st.push(robot);
            }else{
                //Left direction ones encountered
                while(!st.isEmpty() && st.peek()[2] > 0 && robot[1] > 0){
                    int[] topRobot = st.pop();
                    if(topRobot[1] > robot[1]){
                        topRobot[1]--;
                        st.push(topRobot);
                        robot[1] = 0;
                    }else if(topRobot[1] < robot[1]){
                        robot[1]--;
                    }else{//Same values then remove both
                        robot[1] = 0;//Health zero
                    }
                }
                if(robot[1] > 0){//This is for same directions
                    st.push(robot);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int[] robot : st){
            map.put(robot[0] , robot[1]);
        }
        for(int pos : positions){
            if(map.containsKey(pos)){
                ans.add(map.get(pos));
            }
        }

        return ans;
    }
}
