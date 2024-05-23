public class doublyLL {
    private Node head;
    
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null)
            head.prev = node;
        head = node;
    }

    public void insertLast(int value){
        Node temp = head;
        Node node = new Node(value);
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
            
        while(temp.next!=null){
            temp = temp.next;
        }
        node.next = null;
        node.prev = temp;
        temp.next = node;
    }

    public void insertAt(int after,int value){
        Node p = find(after);

        if(p == null){
            System.out.println("Doesnt exist!");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next != null)
            node.next.prev = node;
    }

    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value == value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse: ");
        while(last!=null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
