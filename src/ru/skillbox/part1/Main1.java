package ru.skillbox.part1;

public class Main1 {
    public static void main(String[] args) {
        Human<Dog> human1 = new Human<>();
        Human<Cat> human2 = new Human<>();
        human1.getBestFriend().sayGav();
        human2.getBestFriend().sayMeow();
        Dog d = human1.getBestFriend();
        //man1.addBestFriend(new Cat());
    }
}

class Dog {
    void sayGav() {
        System.out.println("Gav");
    }
}

class Cat {
    void sayMeow() {
        System.out.println("Meow");
    }
}


class Human<T> {
    private T bestFriend;

    public T getBestFriend() {
        return bestFriend;
    }

    public void addBestFriend(T bestFriend) {
        this.bestFriend = bestFriend;
    }
}




