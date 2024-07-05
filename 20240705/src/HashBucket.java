public class HashBucket {
    static class Node {
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array;
    public int usedSize;
    public double loadFactor = 0.75;

    public HashBucket() {
        array = new Node[10];
    }

    public void put(int key, int val) {
        int index = key % array.length;
        Node cur = array[index];
        while (cur != null) {
            if (cur.key == key) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        Node node = new Node(key, val);
        node.next = array[index];
        array[index] = node;
        usedSize++;

        if (loadFactorCount() >= loadFactor) {
            resize();
        }
    }

    private double loadFactorCount() {
        return usedSize * 1.0 / array.length;
    }

    private void resize() {
        Node[] newArray = new Node[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];
            while (cur != null) {
                int newIndex = cur.key % newArray.length;
                Node curN = cur.next;
                cur.next = newArray[newIndex];
                newArray[newIndex] = cur;
                cur = curN;
            }
        }
        array = newArray;
    }

    public int get(int key) {
        int index = key % array.length;
        Node cur = array[index];
        while (cur != null) {
            if (cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}
