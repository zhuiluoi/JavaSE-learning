package demo1;



class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((Character.isLetterOrDigit(ch))){
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}