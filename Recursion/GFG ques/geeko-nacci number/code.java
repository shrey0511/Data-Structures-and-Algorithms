//https://www.geeksforgeeks.org/problems/geek-onacci-number/0

import java.util.Scanner;

public class code {
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0 ; i<T ; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int n = sc.nextInt();
		    System.out.println(find(a,b,c,n));
		}
        sc.close();
	}
	
	private static int find(int a,int b,int c,int n){
	    if(n == 1 )
	        return a;
	    if(n == 2 )
	        return b;
	    if(n == 3 )
	        return c;
	        
	    return find(a,b,c,n-1) + find(a,b,c,n-2) + find(a,b,c,n-3);
	}
}
