package demo1;

import java.util.Comparator;

class Student implements Comparator, Cloneable{

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test {

}
