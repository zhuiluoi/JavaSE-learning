public class Sort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        int gap = array.length;

        while (gap > 1) {
            gap /= 2;
            shell(array, gap);
        }
    }

    private static void shell(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for (; j >= 0; j-=gap) {
                if (array[j] > tmp) {
                    array[j+gap] = array[j];
                } else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    public static void selectSort1(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }

            }
            swap(array, i, minIndex);
        }
    }

    public static void selectSort2(int [] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left+1; i <= right; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(array, minIndex, left);
            if (maxIndex == left) {
                maxIndex = minIndex;
            }
            swap(array, maxIndex, right);
            left++;
            right--;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void heapSort(int[] array) {
        createBigHeap(array);

        int end = array.length-1;

        while (end >= 0) {
            swap(array, 0, end);
            shiftDown(0, array, end);
            end--;
        }
    }

    private static void createBigHeap(int[] array) {
        for (int parent = (array.length-1-1) / 2; parent >=0 ; parent--) {
            shiftDown(parent, array, array.length);
        }
    }
    private static void shiftDown(int parent, int[] array, int end) {
        int child = 2*parent+1;
        while (child < end) {
            if (child + 1 < end && array[child] < array[child+1]) {
                child++;
            }

            if (array[child] > array[parent]) {
                swap(array, child, parent);
                parent = child;
                child = 2*parent+1;
            } else {
                break;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1] < array[j]) {
                    swap(array, j, j+1);
                    flg =true;
                }
            }
            if (!flg) {
                break;
            }
        }
    }

}
