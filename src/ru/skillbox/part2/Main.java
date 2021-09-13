package ru.skillbox.part2;


//Generic Interfaces
public class Main {
}

interface Shippable<T> {
    void ship(T t);
}

class Boat implements Shippable<String> {
    @Override
    public void ship(String s) {

    }
}

class AbstractBoat<U> implements Shippable<U> {
    public void ship(U t) { }
}
