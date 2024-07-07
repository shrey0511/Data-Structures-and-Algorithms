import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(15);
        s.push(15);
        s.push(15);
        s.push(15);
        s.push(15);
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    
        Queue<Integer> q = new LinkedList<>();
        q.add(99);
        q.add(98);
        q.add(97);
        q.add(96);
        
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        
    }
}