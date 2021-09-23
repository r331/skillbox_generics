package ru.skillbox.part4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> strings1 = new ArrayList<>();

        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // Has compiler-generated cast
    }

    private static void unsafeAdd(List list, Object o) {
        if(list instanceof List)
            System.out.println("1");
        list.add(o);
    }
}
