public class This {
    String str = "nihao";

    public static void main(String args[]) {
        This myObject = new This();
        myObject.printString("这是局部变量");
    }

    void printString(String str) {
        // 打印局部变量 str 的值
        System.out.println(str);
        // 打印成员变量 str 的值
        System.out.println(this.str);
        // 将形参 str 的值赋给成员变量 str
        this.str = str;
        // 打印成员变量 str 的值
        System.out.println(this.str);
    }
}