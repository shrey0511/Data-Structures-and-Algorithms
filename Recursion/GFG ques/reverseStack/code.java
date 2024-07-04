//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/

import java.util.*;

public class code {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Items before sorting ");
        printStack(s);
        reverseStack(s);
        System.out.println();
        System.out.println("Items after sorting ");
        printStack(s);
    }

    private static void reverseStack(Stack<Integer> s) {
        int temp = 0;
        if(!s.isEmpty()){
            temp = s.pop();
            reverseStack(s);
            reOrder(s, temp);
        }
        return;
    }

    private static void reOrder(Stack<Integer> s ,int x){
        if(s.isEmpty()){
            s.push(x);
        }else{
            int a = s.peek();
            s.pop();
            reOrder(s, x);

            s.push(a);
        }
        return;
    }

    private static void printStack(Stack<Integer> s) {
        ListIterator lt = s.listIterator();

        while(lt.hasNext()){
            lt.next();
        }

        while(lt.hasPrevious()){
            System.out.println(lt.previous()+" ");
        }
    }
    //Or simply print s

    


}
