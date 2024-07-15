//https://leetcode.com/contest/weekly-contest-406/problems/minimum-cost-for-cutting-cake-ii/

import java.util.Collections;
import java.util.PriorityQueue;

public class code4 {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        // Convert arrays to priority queues to handle cuts in descending order
        PriorityQueue<Integer> horizontalCuts = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> verticalCuts = new PriorityQueue<>(Collections.reverseOrder());

        for (int cut : horizontalCut) {
            horizontalCuts.add(cut);
        }

        for (int cut : verticalCut) {
            verticalCuts.add(cut);
        }

        long totalCost = 0;
        int horizontalPieces = 1;
        int verticalPieces = 1;

        while (!horizontalCuts.isEmpty() && !verticalCuts.isEmpty()) {
            if (horizontalCuts.peek() > verticalCuts.peek()) {
                totalCost += (long) horizontalCuts.poll() * verticalPieces;
                horizontalPieces++;
            } else {
                totalCost += (long) verticalCuts.poll() * horizontalPieces;
                verticalPieces++;
            }
        }

        while (!horizontalCuts.isEmpty()) {
            totalCost += (long) horizontalCuts.poll() * verticalPieces;
        }

        while (!verticalCuts.isEmpty()) {
            totalCost += (long) verticalCuts.poll() * horizontalPieces;
        }

        return totalCost;
    }
}
