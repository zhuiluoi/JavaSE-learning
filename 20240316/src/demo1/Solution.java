package demo1;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return string字符串
     */
    public static String setstring (String str) {
        // write code here
        int[] num = new int[125];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            num[ch]++;
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (num[ch] > 0) {
                stringBuilder.append(ch);
                num[ch] = 0;
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(setstring("BAabB"));
    }
}
