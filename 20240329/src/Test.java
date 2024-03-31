public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);

        list.display();
        list.addIndex(0, 3);
        list.addIndex(2, 6);
        list.display();

        list.remove(4);
        list.display();
        list.removeAllKey(3);
        list.display();

    }
}
