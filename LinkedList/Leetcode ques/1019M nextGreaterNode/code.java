//https://leetcode.com/problems/next-greater-node-in-linked-list/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static int[] nextLargerNodes(ListNode head) {
        if(head.next == null) return new int[]{0};
        //Finding lengthList
        List<Integer> values = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            values.add(temp.val);
            temp = temp.next;
        }

        int[] res = new int[values.size()];
        Stack<Integer> stack = new Stack<>();

        for(int i = values.size()-1 ; i>=0 ; i--){
            int value = values.get(i);

            while(!stack.isEmpty() && stack.peek()<=value){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[i] = stack.peek();
            }else{
                res[i] = 0;
            }
            stack.push(value);
        }
        return res;
    }
}
