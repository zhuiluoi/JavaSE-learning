package demo1;

public class Person{

    private String name = "Person";
    //private时不同类无法访问
    int age=0;

}

class Child extends Person{

    public String grade;

    public static void main(String[] args){

        Person p = new Child();

        //System.out.println(p.name);
        // private时不同类无法访问

    }

}