//https://leetcode.com/problems/design-linked-list/

public class LinkedList {
    private static class Node {

        private final int val;
        private Node next;

        private Node(int val) {
            this(val, null);
        }

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        if (index == 0) return head.val;
        if (index == size - 1) return tail.val;

        return getNode(index).val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            head = new Node(val, head);

            if (size == 0) tail = head;
        } else if (index == size) {
            Node n = new Node(val);
            tail.next = n;
            tail = n;
        } else {
            Node prev = getNode(index - 1);
            prev.next = new Node(val, prev.next);
        }

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;

            if (head == null) tail = null;
        } else {
            Node prev = getNode(index - 1);
            prev.next = prev.next.next;

            if (prev.next == null) tail = prev;
        }

        size--;
    }

    private Node getNode(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }

        return n;
    }
}
