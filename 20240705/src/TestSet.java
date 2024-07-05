import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        // add(key): 如果key不存在，则插入，返回ture
        // 如果key存在，返回false
        boolean isIn = s.add("apple");
        s.add("orange");
        s.add("peach");
        s.add("banana");
        System.out.println(s.size());
        System.out.println(s);

        isIn = s.add("apple");
        // add(key): key如果是空，抛出空指针异常
        //s.add(null);
        // contains(key): 如果key存在，返回true，否则返回false
        System.out.println(s.contains("apple"));
        System.out.println(s.contains("watermelen"));
        // remove(key): key存在，删除成功返回true
        // key不存在，删除失败返回false
        // key为空，抛出空指针异常
        s.remove("apple");
        System.out.println(s);
        s.remove("watermelen");
        System.out.println(s);
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
