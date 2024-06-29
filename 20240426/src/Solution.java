import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param S string字符串 
     * @param T string字符串 
     * @return bool布尔型
     */
    public static boolean isSubsequence (String S, String T) {
        // write code here
        int num1 = 0;
        int num2 = 0;
        while (num2 != T.length() && num1 != S.length()) {
            char a = S.charAt(num1);
            char b = T.charAt(num2);
            if (a == b) {
                num1++;
            }
            num2++;
        }
        return num1 == S.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("nowef","nowcoder"));
    }
}