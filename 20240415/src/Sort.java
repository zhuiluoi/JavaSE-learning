public class Sort {
    public static void quickSort(int[] array) {
        quick(array, 0, array.length-1);
    }

    private static void quick(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int par = partitionW(array, start, end);

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

    private static int partitionW(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            array[i] = array[j];
            while (i < j && array[i] <= pivot) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        return i;
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

    public static void mergeSort(int[] array) {
        mergeSortFun(array, 0, array.length-1);
    }

    private static void mergeSortFun(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (right + left) / 2;
        mergeSortFun(array, left, mid);
        mergeSortFun(array, mid+1, right);

        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] tmp = new int[right-left+1];
        int k = 0;
        int s1 = left;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = right;

        while (s1<=e1 && s2<=e2) {
            if (array[s1] <= array[s2]) {
                tmp[k] = array[s1];
                k++;
                s1++;
            } else {
                tmp[k] = array[s2];
                k++;
                s2++;
            }
        }
        while (s1<=e1) {
            tmp[k++] = array[s1++];
        }

        while (s2<=e2) {
            tmp[k++] = array[s2++];
        }

        if (k >= 0) System.arraycopy(tmp, 0, array, left, k);
    }
}
