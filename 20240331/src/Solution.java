import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String a:
             tokens) {
            if (a.equals("+")) {
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num2+num1);
            } else if (a.equals("-")) {
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num2-num1);
            } else if (a.equals("*")) {
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num2*num1);
            } else if (a.equals("/")) {
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num2/num1);
            } else {
                st.push(Integer.valueOf(a));
            }
        }
        return st.peek();
    }
}