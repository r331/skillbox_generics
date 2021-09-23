package ru.skillbox.part6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Man<Dog> man1 = new Man<>();
        man1.bestFriend = new Dog();

        Man<Integer> integerMan = new Man<>();
        //new ArrayList<? super Dog>();

        List<? super Dog> lst = new ArrayList<>();
        List<?> lst2 = new ArrayList<Object>();
        lst.add(new BullDog());
        printList(lst);
        printList2(lst);
        var a = lst.get(0);
    }

    public static void printList(List<?> list) {
        for (Object x : list)
            System.out.println(x);
    }

    public static <E> void printList2(List<E> list) {
        for (Object x : list)
            System.out.println(x);
    }
}

interface Animal {
}

interface Good {
    void sayHello();
}
class BullDog extends Dog{

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



