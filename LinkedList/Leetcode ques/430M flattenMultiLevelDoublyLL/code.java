//https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
//Amazon question

public class code {
    public static void main(String[] args) {
        
    }

    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };

    static Node flatten(Node head) {
        if(head == null) return head;
        Node curr = head;

        while(curr!=null){
            if(curr.child!=null){
                Node tail = findTail(curr.child);
                if(curr.next!=null){
                    curr.next.prev = tail;
                }
                tail.next = curr.next;
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }
            curr = curr.next;
        }
        return head;
    }
    static Node findTail(Node node){
        while(node.next != null){
            node = node.next;
        }
        return node;
    }
}
