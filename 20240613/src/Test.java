
class Alg {
    public <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
}



class MyArray<T> {
    public Object[] array = new Object[10];
    public void setValue(int pos, T x) {
        array[pos] = x;
    }

    public T getVal(int pos) {
        return (T)array[pos];
    }
}


public class Test {
    public static void main(String[] args) {
        Alg alg = new Alg();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        Integer x = alg.<Integer>findMax(array);
        System.out.println(x);
    }
}
