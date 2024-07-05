import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.init(array);
        testHeap.createHeap();

        System.out.println(Arrays.toString(testHeap.elem));

        testHeap.poll();

        System.out.println(Arrays.toString(testHeap.elem));

        testHeap.heapSort();
        System.out.println(Arrays.toString(testHeap.elem));

    }
}
