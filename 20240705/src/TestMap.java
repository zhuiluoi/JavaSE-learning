import java.util.TreeMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> m = new TreeMap<>();

        // put(key, value):插入key-value的键值对
        // 如果key不存在，会将key-value的键值对插入到map中,返回null
        m.put("林冲", "豹子头");
        m.put("鲁智深", "花和尚");
        m.put("武松", "行者");
        m.put("宋江", "及时雨");
        String str = m.put("李逵", "黑旋风");
        System.out.println(m.size());
        System.out.println(m);

        // put(key,value): 注意key不能为空，但是value可以为空
        // key如果为空，会抛出空指针异常
        //m.put(null, "花名");
        str = m.put("无名", null);
        System.out.println(m.size());
        System.out.println(m);

        // put(key, value):
        // 如果key存在，会使用value替换原来key所对应的value，返回旧value
        str = m.put("李逵", "铁牛");
        System.out.println(str);
        System.out.println(m);

        // get(key): 返回key所对应的value
        // 如果key存在，返回key所对应的value
        // 如果key不存在，返回null
        System.out.println(m.get("鲁智深"));
        System.out.println(m.get("史进"));

        //GetOrDefault(): 如果key存在，返回与key所对应的value，如果key不存在，返回一个默认值
        System.out.println(m.getOrDefault("李逵", "铁牛"));
        System.out.println(m.getOrDefault("史进", "九纹龙"));
        System.out.println(m.size());

        //containKey(key)：检测key是否包含在Map中，时间复杂度：O(logN)
        // 按照红黑树的性质来进行查找
        // 找到返回true，否则返回false
        System.out.println(m.containsKey("林冲"));
        System.out.println(m.containsKey("史进"));

        // containValue(value): 检测value是否包含在Map中，时间复杂度: O(N)
        // 找到返回true，否则返回false
        System.out.println(m.containsValue("豹子头"));
        System.out.println(m.containsValue("九纹龙"));

        // 打印所有的key
        // keySet是将map中的key防止在Set中返回的
        for(String s : m.keySet()){
            System.out.print(s + " ");
        }
        System.out.println();

        // 打印所有的value
        // values()是将map中的value放在collect的一个集合中返回的
        for(String s : m.values()){
            System.out.print(s + " ");
        }
        System.out.println();

        // 打印所有的键值对
        // entrySet(): 将Map中的键值对放在Set中返回了
        for(Map.Entry<String, String> entry : m.entrySet()){
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println();
    }
}
