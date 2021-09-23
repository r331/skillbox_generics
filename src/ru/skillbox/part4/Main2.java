package ru.skillbox.part4;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("stroka");

        unsafeAdd(stringList, 1L);

        System.out.println(stringList.get(0));
        System.out.println((String) stringList.get(1));
    }

    @SuppressWarnings("unchecked")
    private static void unsafeAdd(List list, Object o){
        list.add(o);
    }
}
