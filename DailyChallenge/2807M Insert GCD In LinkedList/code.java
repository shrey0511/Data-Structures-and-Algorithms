//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/?envType=daily-question&envId=2024-09-10

//* Definition for singly-linked list.
public class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class code{
    public static void main(String[] args) {
        
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)
            return head;

        ListNode node1 = head , node2 = head.next;
        while(node2 != null){
            int gcdVal = gcd(node1.val , node2.val);
            ListNode gcdNode = new ListNode(gcdVal);

            node1.next = gcdNode;
            gcdNode.next = node2;

            node1 = node2;
            node2 = node2.next;
        }
        return head;
    }

    public int gcd(int x , int y){
        while(y != 0){
            int temp = y;
            y = x % y ;
            x = temp;
        }
        return x;
    }
}
