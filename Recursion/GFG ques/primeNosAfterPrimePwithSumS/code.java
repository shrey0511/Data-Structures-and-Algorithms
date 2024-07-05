//https://www.geeksforgeeks.org/prime-numbers-after-prime-p-with-sum-s/

import java.util.*;

public class code {
    
    private static ArrayList<Integer> set = new ArrayList<>();
    private static ArrayList<Integer> prime = new ArrayList<>();
    
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        int sqrt = (int) Math.sqrt(n);

        for(int i = 2 ; i<=sqrt ; i++){
            if(n % i == 0)
                return true;
        }
        return false;
    }

    static void display(){
        for(int i = 0 ; i<set.size() ; i++){
            System.out.println(set.get(i)+" ");
        }
        System.out.println();
    }

    static void primeSum(int total , int N , int S , int index){
        //Base case
        if(total == S && set.size()==N){
            display();
            return;
        }

        if(total > S || index == prime.size() || set.size() >= N){
            return;
        }

        set.add(prime.get(index));

        primeSum(total+prime.get(index) , N, S, index+1);

        set.remove(set.size()-1);

        primeSum(total, N, S, index+1);
    }

    static void allPrime(int N , int S , int P){
        for(int i = P+1 ; i<=S ; i++){
            if(isPrime(i)){
                prime.add(i);
            }
        }

        if(prime.size()<N){
            return;
        }
        primeSum(0,N,S,0);
    }

    public static void main(String[] args) {
        int N = 2 , P = 7 , S = 28;
        allPrime(N, S, P);      
    }
}
