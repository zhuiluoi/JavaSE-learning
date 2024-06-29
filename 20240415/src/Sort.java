public class Sort {
    public static void quickSort(int[] array) {
        quick(array, 0, array.length-1);
    }

    private static void quick(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int par = partition(array, start, end);

        quick(array, start, par-1);
        quick(array, par+1, end);
    }

    private static int partitionHoare(int[] array, int left, int right) {
        int tmp = array[left];
        int start = left;
        while(left < right) {
            while (left < right && array[right] >= tmp) {
                right--;
            }

            while (left < right && array[left] <= tmp) {
                left++;
            }
            swap(array, left, right);
        }
        swap(array, start, left);

        return left;

    }

    private static int partition(int[] array, int left, int right) {
        int tmp = array[left];

        while (left < right) {
            while (left < right && array[right] >= tmp) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= tmp) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = tmp;
        return left;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
