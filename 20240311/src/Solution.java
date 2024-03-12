class Solution {

    public int firstUniqChar(String s) {
        int[] count =new int[125];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }





    public static int countSegments(String s) {
        String[] strings;
        strings = s.split(" ");
        int count = 0;
        for (String a : strings) {
            if (a.equals("")) {
                System.out.println("+");
            } else {
                System.out.println(a);
            }
            if (!a.equals("")) {
                count++;
            }
        }
        return count;
    }

    public static void main1(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.println(countSegments(s));
    }
}