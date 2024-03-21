package demo4;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }

    public static void main(String[] args) {
        MyArraylist iList = new MyArraylist();
        iList.add(1);
        iList.add(2);
        iList.add(3);
        //iList.add(1,99);
        iList.display();
        //System.out.println(iList.contains(2));
        iList.remove(3);

        iList.display();
    }
}