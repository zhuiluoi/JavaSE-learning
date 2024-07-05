public class TestHash {
    public static void main(String[] args) {
        HashBucket2<Integer, Integer> hashBucket = new HashBucket2<>();
        hashBucket.put(1, 11);
        hashBucket.put(4, 44);
        hashBucket.put(14, 1414);
        hashBucket.put(24, 2424);
        hashBucket.put(3, 33);

        System.out.println(hashBucket.get(14));
    }
}
