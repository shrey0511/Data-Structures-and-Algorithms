//https://www.geeksforgeeks.org/sort-a-stack-using-recursion/

import java.util.*; 

public class code {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Items before sorting ");
        printStack(s);
        sortStack(s);
        System.out.println();
        System.out.println("Items after sorting ");
        printStack(s);
    }

    private static void sortStack(Stack<Integer> s) {
        if(!s.isEmpty()){
            int x = s.pop();//Remove the top item

            sortStack(s);//Pop the remaining stack

            sortedInsert(s,x);//Push back the top element back in stack while sorting
        }    
        return;
    }

    private static void sortedInsert(Stack<Integer> s, int x) {
        
        if(s.isEmpty() || s.peek()<x){
            s.push(x);
            return;
        }

        //If top element is greater then

        int temp = s.pop();//take it out and check next element
        sortedInsert(s, x);

        s.push(temp); //Put the element back
    }

    private static void printStack(Stack<Integer> s){
        ListIterator<Integer> lt = s.listIterator();

        while(lt.hasNext()){
            lt.next();
        }

        while(lt.hasPrevious()){
            System.out.println(lt.previous() + " ");
        }
    }
}
