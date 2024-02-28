public class Test1 {

    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main1(String[] args){
        System.out.println("cnt = " + cnt);
    }
    static{
        cnt /=3;
    };

    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }


    public static void main2(String[] args) {
        Test1 test = new Test1();
        System.out.println(test);}

    public int aMethod(){
        //static int i = 0;
        int i = 0;
        //静态变量不能在非静态方法中定义，因此会导致编译失败。
        i++;
        return i;
    }
    public static void main(String[] args){
        Test1 test = new Test1();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }


}
