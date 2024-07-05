import java.util.Arrays;
import java.util.Objects;

public class HashBucket2<K, V> {
    static class Node<K, V> {
        public K key;
        public V val;
        public Node<K, V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node<K, V>[] array;
    public int usedSize;
    public double loadFactor = 0.75;

    public HashBucket2() {
        array = (Node<K, V>[])new Node[10];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashBucket2<?, ?> that = (HashBucket2<?, ?>) o;
        return usedSize == that.usedSize && Double.compare(that.loadFactor, loadFactor) == 0 && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(usedSize, loadFactor);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    public void put(K key, V val) {
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K, V> cur = array[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        Node<K, V> node = new Node<K, V>(key, val);
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
        Node<K, V>[] newArray = (Node<K, V>[]) new Node[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            Node<K, V> cur = array[i];
            while (cur != null) {
                int hash = cur.key.hashCode();
                int newIndex = hash % newArray.length;
                Node<K, V> curN = cur.next;
                cur.next = newArray[newIndex];
                newArray[newIndex] = cur;
                cur = curN;
            }
        }
        array = newArray;
    }

    public V get(int key) {
        int index = key % array.length;
        Node<K, V> cur = array[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }
}
