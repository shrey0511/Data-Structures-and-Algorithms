public class circularLL {
    private Node head;
    private Node tail;

    public circularLL(){
        this.head = null;
        this.tail = null;
    }
    
    public class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
        }
    }

    public Node find(int value){

    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void insertLast(int value){

    }

    public void insertAt(int index,int value){

    }

    public int delete(int value){
        Node node = head;
        if(node == null)
            return -1;
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return node.value;
        }
        do {
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                return n.value;
            }
            node = node.next;
        } while (node!=head);

        return -1;    
    }

    public void display(){
        Node node = head;
        if(head != null){
            do {
                System.out.print(node.value+" -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println(node.value);//To prove it comes back to head
    }
}
