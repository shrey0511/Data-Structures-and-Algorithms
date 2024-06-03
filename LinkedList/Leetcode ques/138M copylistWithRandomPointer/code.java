//https://leetcode.com/problems/copy-list-with-random-pointer/

// Definition for a Node.

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class code {
    public static void main(String[] args) {
        
    }

    static Node copyRandomList(Node head){
        if(head == null) return null;

        Map<Node,Node> map = new HashMap<>();
        
        Node curr = head;
        while(curr != null){
            map.put(curr , new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}
