package demo2;

public class A {
}

class B extends A {

}

class C extends B {

}

class Test {
    public static void main(String[] args) {
        A a0=new A();
        A a1=new B();
        A a2=new C();
    }
}
