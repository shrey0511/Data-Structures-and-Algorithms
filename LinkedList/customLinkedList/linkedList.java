public class linkedList {
    private Node head;
    private Node tail;
    private int size;

    public linkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null)
            tail = head;

        size += 1;
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
            
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        else if(index==size){
            insertLast(value);
            return;
        }
        else{
            Node temp = head;
            int count = 1;
            while(count++ != index){
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head==null)
            tail = null;

        size--;
        return val;
    }

    //To use value to find a certain node
    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    //To use index to find a certain node
    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    //insert using recursion
    public void insertRec(int value,int index){
        head = insertRec(value, index, head);
    }
    private Node insertRec(int value,int index,Node Nodenext){
        //When index == 0 , it means we have reached the desired index
        if(index == 0){
            Node temp = new Node(value,Nodenext);
            size++;
            return temp;
        }
        Nodenext.next = insertRec(value, --index, Nodenext.next);//this function returns the next of the current node like if index == 0 then next of this is temp
        return Nodenext;
    }

    public int deleteLast(){
        if(size<=1)
            return deleteFirst();

        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;

        return value;
    }

    public int deleteAt(int index){
        if(index==0)
            deleteFirst();
        else if(index==size-1)
            deleteLast();

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static linkedList merge(linkedList first,linkedList second){
        Node head1 = first.head;
        Node head2 = second.head;
        
        linkedList ans = new linkedList();
        while(head1 != null && head2 != null){
            if(head1.value <= head2.value){
                ans.insertLast(head1.value);
                head1 = head1.next;
            }else{
                ans.insertLast(head2.value);
                head2 = head2.next;
            }
        }
        while (head1 != null){
            ans.insertLast(head1.value);
            head1 = head1.next;
        }
        while (head2 != null){
            ans.insertLast(head2.value);
            head2 = head2.next;
        }

        return ans;
    }

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)//If they meet then there is a cycle
                return true;
        }
        return false;
    }

    public int lengthCycle(Node head){
        int length = 0;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){//If they meet then there is a cycle
                //calculate the length
                do{
                    ++length;
                    slow = slow.next;
                } while (slow != fast);
                return length;
            }
        }
        return 0;
    }

    public Node detectCycleStart(Node head){
        //First find the cycle and its length
        int length = 0;

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                //Cycle found now find its length
                length = lengthCycle(head);
                break;
            }
        }

        if(length == 0)
            return null;

        //Find the start node
        Node s = head;
        Node f = head;

        while (length>0) {
            s = s.next;
            length--;
        }

        while(s != f){
            s = s.next;
            f = f.next;
        }
        return s;
    }

    //For sorting the linked list
    //We used mergeSort in ques 148
    //Now using bubble Sort

    private void bubbleSort(int row , int col){
        if(row == 0)
            return;

        if(col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }else{
            bubbleSort(row - 1, col);
        }
    }

    static Node middleNode(Node head) {
        Node slow = head , fast = head;
        while( fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //This works because when someone is twice your speed then
        //by the time they reach the end, you are at the middle
        return slow;
    } 

    //Reverse LL using recursion
    private void reverseRecursion(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverseRecursion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //In-place reversal of LinkedList
    private void reverseLL(){

        if(size < 2)
            return;

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)
                next.next = next;
        }
        head = prev;
    }
    
}
