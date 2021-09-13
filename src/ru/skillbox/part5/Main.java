package ru.skillbox.part5;

public class Main {
    public static void main(String[] args) {
        Man<Dog> man1 = new Man<>();
        man1.bestFriend = new Dog();

        Man<Integer> integerMan = new Man<>();
        Man3<Dog> man = new Man3<Dog>();
    }
}

interface Animal {
}

interface Good {
    void sayHello();
}

class Dog implements Animal, Good{
    @Override
    public void sayHello() {
        System.out.println("Dog hello");
    }
}

class Cat implements Animal {
}

class Man<T> {
    T bestFriend;
}
class Man2<T extends Cat> {
    T bestFriend;
}

class Man3<T extends Animal & Good> {
    T bestFriend;
    void a(){
        bestFriend.sayHello();
    }
}

