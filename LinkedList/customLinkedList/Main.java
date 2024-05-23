public class Main{
    public static void main(String[] args) {
        linkedList LL = new linkedList();
        LL.insertFirst(5);
        LL.insertFirst(4);
        LL.insertFirst(3);
        LL.insertFirst(2);
        LL.insertLast(6);
        LL.insertAt(0, 0);
        LL.insertAt(1, 1);
        LL.insertAt(69, 3);
        LL.display();
        System.out.println(LL.deleteFirst());
        LL.display();
        System.out.println(LL.deleteLast());
        LL.display();
        System.out.println(LL.deleteAt(2));

        LL.insertRec(7, 5);//Using recurison here
        LL.display();

        // doublyLL DLL = new doublyLL();
        // DLL.insertFirst(7);
        // DLL.insertFirst(6);
        // DLL.insertFirst(5);
        // DLL.insertLast(99);
        // DLL.insertAt(99, 100);
        
        // DLL.display();

        // circularLL CLL = new circularLL();
        // CLL.insert(5);
        // CLL.insert(6);
        // CLL.insert(8);
        // CLL.insert(9);
        // CLL.display();
        // System.out.println(CLL.delete(8));
        // CLL.display();
    }
}