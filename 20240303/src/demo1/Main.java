package demo1;

// 抽象类 Animal
abstract class Animal {
    // 抽象方法 makeSound，用于描述动物发出声音的行为
    public abstract void makeSound();

    // 非抽象方法
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Dog 类
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat 类
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}



public class Main {
    public static void makeSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // 输出 "Dog barks"
        cat.makeSound(); // 输出 "Cat meows"

        System.out.println("==========================");
        makeSound(dog);
        makeSound(cat);

        System.out.println("==========================");
        dog.sleep(); // 输出 "Animal is sleeping"
        cat.sleep(); // 输出 "Animal is sleeping"
    }
}

