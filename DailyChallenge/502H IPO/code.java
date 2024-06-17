//https://leetcode.com/problems/ipo/?envType=daily-question&envId=2024-06-15

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class code {
    public static void main(String[] args) {
        
    }

    public static class Project{
        int capital;
        int profit;

        public Project(int capital,int profit){
            this.capital = capital;
            this.profit = profit;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<Project> projects = new ArrayList<>();

        for(int i=0;i<profits.length;i++){
            projects.add(new Project(capital[i],profits[i]));
        }

        Collections.sort(projects,(x,y)-> (x.capital - y.capital));

        //Max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);
        int i =0;
        for(int j=0 ; j<k ; j++){
            while(i<profits.length && projects.get(i).capital <= w){
                maxHeap.add(projects.get(i).profit);
                i++;
            }

            if(maxHeap.isEmpty())
                break;
            
            w += maxHeap.poll();
        }
    
        return w;
    }
}
