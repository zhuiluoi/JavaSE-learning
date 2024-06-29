import java.util.Scanner;
import java.util.Stack;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            StringBuilder s = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            for (char c:
                 a.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            for (char c:
                 stack) {
                s.append(c);
            }

            if (s.length() == 0) {
                System.out.println(0);
            } else {
                System.out.println(s.toString());
            }

        }
    }
}