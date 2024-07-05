import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    class IntCmp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }

    public int[] smallestK(int[] arr, int k) {
        if(null == arr || k <= 0)
            return new int[0];

        PriorityQueue<Integer> p = new PriorityQueue<>(new IntCmp());
        int i = 0;
        for (; i < k; i++) {
            p.offer(arr[i]);
        }

        int[] ret = new int[k];
        for (; i < arr.length; i++) {
            if (p.peek() > arr[i]) {
                p.poll();
                p.offer(arr[i]);
            }
        }

        for (int j = 0; j < k; j++) {
            ret[j] = p.poll();
        }

        return ret;
    }
}