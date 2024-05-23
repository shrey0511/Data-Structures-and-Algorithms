import java.util.ArrayList;
import java.util.List;

public class factors {
    public static void main(String[] args) {
        factor2(20);
    }
    static void factor(int n){
        //brute force
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i + " ");
        }
    }
    //Optimised way
    static void factor2(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i==(n/i))
                    System.out.print(i+" ");
                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        //Used list to display the pairs in ascending order
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
