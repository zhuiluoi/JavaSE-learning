import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    public void init(int[] array) {
        for (int i = 0; i < array.length; i++) {
            elem[i] = array[i];
            usedSize++;
        }
    }

    //大根堆
    public void createHeap() {
        for (int parent = (usedSize-1-1) / 2; parent >= 0 ; parent--) {
            shiftDown(parent, usedSize);
        }
    }

    public void shiftDown(int parent, int end) {
        int child = 2 * parent + 1;
        while (child < end) {
            if (child + 1 < end  && elem[child] < elem[child+1]) {
                child++;
            }

            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }

        }
    }

    public void offer(int val) {
        if (isFull()) {
            elem = Arrays.copyOf(elem, 2*elem.length);
        }
        elem[usedSize] = val;
        usedSize++;
        shiftUp(usedSize-1);
    }

    public int poll() {
        if (isEmpty()) {
            return -1;
        }

        int tmp = elem[usedSize-1];
        elem[usedSize-1] = elem[0];
        elem[0] = tmp;
        usedSize--;
        shiftDown(0, usedSize);
        return tmp;
    }

    public void shiftUp(int child) {
        int parent = (child - 1) / 2;
        while (parent>=0) {
            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            } else {
                break;
            }
        }
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }

    static void TestPriorityQueue(){
        // 创建一个空的优先级队列，底层默认容量是11
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        // 创建一个空的优先级队列，底层的容量为initialCapacity
        PriorityQueue<Integer> q2 = new PriorityQueue<>(100);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        // 用ArrayList对象来构造一个优先级队列的对象
        // q3中已经包含了三个元素
        PriorityQueue<Integer> q3 = new PriorityQueue<>(list);
        System.out.println(q3.size());
        System.out.println(q3.peek());
    }

    public void heapSort() {
        int endIndex = usedSize - 1;
        while (endIndex > 0) {
            int tmp = elem[0];
            elem[0] = elem[endIndex];
            elem[endIndex] = tmp;
            shiftDown(0, endIndex);
            endIndex--;
        }
    }


}
