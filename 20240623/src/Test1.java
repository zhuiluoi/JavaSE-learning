import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        String str1 = "welcome to china";
        String str2 = "come";

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch+"")) {
                arrayList.add(ch);
            }
        }

        for (char ch:
             arrayList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
