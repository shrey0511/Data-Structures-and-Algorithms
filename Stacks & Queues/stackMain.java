import java.util.Stack;

public class stackMain {
    public static void main(String[] args) throws stackException {
        Stack<Integer> s1 = new Stack<>();
        dynamicStack s = new dynamicStack(4);
        s.push(0);
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
