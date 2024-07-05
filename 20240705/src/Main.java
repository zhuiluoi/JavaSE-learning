import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            HashSet<Character> hashSet = new HashSet<>();
            for (int i = 0; i < b.length(); i++) {
                hashSet.add(Character.toUpperCase(b.charAt(i)));
            }
            HashSet<Character> hashSet2 = new HashSet<>();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < a.length(); i++) {
                char ch = Character.toUpperCase(a.charAt(i));
                if (!hashSet.contains(ch) && !hashSet2.contains(ch)) {
                    result.append(ch);
                    hashSet2.add(ch);
                }
            }
            System.out.println(result.toString());
        }
    }
}