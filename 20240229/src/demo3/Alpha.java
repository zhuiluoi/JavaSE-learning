package demo3;

class Base {
    Base() {
        System.out.print("Base");
    }

}

public class Alpha extends Base {

    Alpha(int a) {
        System.out.print("Alpha");
    }
    public static void main( String[] args ) {
        new Alpha(1);//1
        //调用父类无参的构造方法
        new Base();//2
    }
}