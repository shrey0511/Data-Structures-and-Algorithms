public class queueMain {
    public static void main(String[] args) throws Exception {
        circularQueue q = new circularQueue();
        q.insert(5);
        q.insert(3);
        q.insert(7);
        q.insert(1);

        q.display();

        System.out.println(q.remove());
        q.insert(133);

        q.display();
    }
}
