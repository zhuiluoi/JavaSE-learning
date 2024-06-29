import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                sk.push(ch);
            } else {
                if (sk.isEmpty()) {
                    return false;
                } else {
                    char chL = sk.peek();
                    if (chL == '(' && ch == ')' || chL == '{' && ch == '}'
                            ||chL == '[' && ch == ']') {
                         sk.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return sk.empty();
    }


    public boolean IsPopOrder (int[] pushV, int[] popV) {
        // write code here
        int j = 0;
        Stack<Integer> sk = new Stack<>();
        for (int i = 0; i < pushV.length; i++) {
            sk.push(pushV[i]);
            while (j < popV.length && sk.peek() == popV[j]
                    && !sk.empty()) {
                sk.pop();
                j++;
            }
        }
        return sk.empty();
    }
}