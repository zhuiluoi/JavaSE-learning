import java.util.*;

class Solution4 {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < words.length ; i++) {
            String s = words[i];
            if (!hashMap.containsKey(s)) {
                hashMap.put(s, 1);
            } else {
                hashMap.put(s, hashMap.get(s) + 1);
            }
        }
        PriorityQueue<HashMap.Entry<String, Integer>> minHeap = new PriorityQueue<>(new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().compareTo(o2.getValue()) == 0) {
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        List<String> list = new ArrayList<>();
        for (HashMap.Entry<String, Integer> entry:
                hashMap.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            }else {
                HashMap.Entry<String, Integer> top = minHeap.peek();
                if (top.getValue().compareTo(entry.getValue()) == 0) {
                    if (top.getKey().compareTo(entry.getKey()) > 0){
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                } else {
                    if (entry.getValue().compareTo(top.getValue()) > 0) {
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                }
            }
        }

        for (int i = 0; i < k; i++) {
            list.add(minHeap.poll().getKey());
        }
        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {
        String[] strings = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequent(strings, 3));
    }
}