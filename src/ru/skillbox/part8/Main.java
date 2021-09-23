package ru.skillbox.part8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<String> heapPollution() {
        List numbers = new ArrayList<Number>();
        numbers.add(1);
        List<String> ls = numbers;
        ls.add("stroka");
        return ls;
    }

    static void heapPollution2(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList;
        String str = stringLists[0].get(0);
        System.out.println(str);
    }
}
