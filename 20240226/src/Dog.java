public class Dog {

    public String name;
    public int age;
    public String color;

    public Dog() {
        this("大黄", 1, "黄色");
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat() {
        System.out.println(this.name + "正在吃饭!");
    }

    public void sleep() {
        System.out.println(this.name + "正在睡觉!");
    }

    public void show() {
        System.out.println(this.name + "/"  + this.age + "岁/" + this.color);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.show();
        System.out.println("============================");
        Dog dog2 = new Dog("小白", 3, "白色");
        dog2.eat();
        dog2.sleep();
        dog2.show();
    }
}
