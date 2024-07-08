//https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.Arrays;
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0 ; i<testCases ; i++){
            int size1 = sc.nextInt();
            int size2 = sc.nextInt();
            int maxSum = sc.nextInt();
            int[] a = new int[size1];
            int[] b =new int[size2];
            
            for(int j = 0 ; j<size1 ; j++){
                a[j] = sc.nextInt();
            }
            for(int j = 0 ; j<size1 ; j++){
                b[j] = sc.nextInt();
            }

            System.out.println(twoStacks(maxSum, a, b));
        }
    }

    static int twoStacks(int maxSum , int[] a , int[] b){
        return helper(maxSum,a,b,0,0) - 1;
    }

    private static int helper(int maxSum, int[] a, int[] b, int sum, int count) {
        //Base case
        if(sum > maxSum){
            return count;
        }

        if(a.length == 0 || b.length == 0){
            return count;
        }

        int left = helper(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int right = helper(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);

        return Math.max(left,right);
    }
}
