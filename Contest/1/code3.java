//https://leetcode.com/contest/weekly-contest-406/problems/minimum-cost-for-cutting-cake-i/

public class code3 {
    public static int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        
        int horizontalCuts = 1;
        int verticalCuts = 1;
        int totalCost = 0;

        int i = horizontalCut.length - 1;
        int j = verticalCut.length - 1;

        while (i >= 0 && j >= 0) {
            if (horizontalCut[i] > verticalCut[j]) {
                totalCost += horizontalCut[i] * verticalCuts;
                horizontalCuts++;
                i--;
            } else {
                totalCost += verticalCut[j] * horizontalCuts;
                verticalCuts++;
                j--;
            }
        }

        while (i >= 0) {
            totalCost += horizontalCut[i] * verticalCuts;
            i--;
        }

        while (j >= 0) {
            totalCost += verticalCut[j] * horizontalCuts;
            j--;
        }

        return totalCost;
    }

}
