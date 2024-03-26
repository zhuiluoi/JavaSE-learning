public class Test {

    public static void main(String[] args) {
        SingleLinkedList myList = new SingleLinkedList();
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.addIndex(0, 12);
        myList.addIndex(5, 12);
        myList.addIndex(3, 12);
        myList.display();
        System.out.println(myList.contains(16));
        System.out.println(myList.size());
        myList.remove(22);
        myList.remove(46);
        myList.display();
        myList.removeAllKey(12);
        myList.display();
        myList.clear();
        myList.display();
    }

}
