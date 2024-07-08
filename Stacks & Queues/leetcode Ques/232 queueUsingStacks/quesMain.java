//https://leetcode.com/problems/implement-queue-using-stacks/

public class quesMain {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(5);
        int param_2 = q.pop();
        int param_3 = q.peek();
        boolean param_4 = q.empty();

        System.out.println(param_2 + " " + param_3 + " " + param_4);
    }
}


