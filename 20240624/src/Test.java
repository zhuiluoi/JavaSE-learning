public class Test {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.createList();

        singleLinkedList.display();
        singleLinkedList.addFirst(10);
        singleLinkedList.display();
        singleLinkedList.addLast(67);
        singleLinkedList.display();
        System.out.println(singleLinkedList.size());
        singleLinkedList.addIndex(0, 9);
        singleLinkedList.display();
        singleLinkedList.addIndex(8, 78);
        singleLinkedList.display();
        singleLinkedList.addIndex(2, 11);
        singleLinkedList.display();
        singleLinkedList.addIndex(-1, 11);
        System.out.println(singleLinkedList.contains(78));
        System.out.println(singleLinkedList.contains(9));
        System.out.println(singleLinkedList.contains(34));
        System.out.println(singleLinkedList.contains(99));

        singleLinkedList.remove(23);
        singleLinkedList.display();

        singleLinkedList.remove(78);
        singleLinkedList.display();

        singleLinkedList.remove(9);
        singleLinkedList.display();

        singleLinkedList.addLast(10);
        singleLinkedList.addLast(10);
        singleLinkedList.addLast(10);
        singleLinkedList.addLast(10);
        singleLinkedList.display();

        singleLinkedList.removeAllKey(10);
        singleLinkedList.display();

        singleLinkedList.clear();
        singleLinkedList.display();

    }
}
