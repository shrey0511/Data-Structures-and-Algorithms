//https://leetcode.com/problems/task-scheduler/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static int leastInterval(char[] tasks, int n) {
        if(tasks.length == 0)
            return 0;

        //Step 1: Counting frequencies of tasks
        int[] tasksFreq = new int[26]; //For all alphabets
        for(char task : tasks){
            tasksFreq[task - 'A']++; //To get the exact index
        }

        //Step 2: After getting the most frequent one , we use a maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);

        for(int count : tasksFreq){
            if(count > 0){
                maxHeap.offer(count);//Storing in descending order
            }
        }

        //Step 3: A coolDown queue will be needed 
        Queue<int[]> coolDown = new LinkedList();

        int time = 0;

        while( !maxHeap.isEmpty() || !coolDown.isEmpty()){
            
            time++;

            if(!maxHeap.isEmpty()){
                int taskCount = maxHeap.poll();

                if(taskCount > 1){
                    //need to store in coolDown queue , count & executable time
                    coolDown.offer(new int[]{ taskCount - 1 , time + n });
                }
            }

            if(!coolDown.isEmpty() && coolDown.peek()[1] == time){
                //Put it back in maxHeap
                maxHeap.offer(coolDown.poll()[0]);
            }
        }
        return time;
    }
}
