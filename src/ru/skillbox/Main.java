package ru.skillbox;

import java.time.LocalDate;
import java.util.*;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Main {

    public static void main(String[] args) {
        //String[] attributes = pickTwo("Good", "Fast", "Cheap");
        Set hset = new HashSet();
        hset.add(new int[1]);
        hset.add(1L);

        Set
                tsset = Collections
                .checkedSet(hset, String.class);
        System.out.println(tsset);
        java.util.Collections
        tsset.add("asdasdsads");
        System.out.println(tsset);

        //tsset.add(LocalDate.now());
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (current().nextInt(3)) {
            case 0:
                return toArray(a, b);
            case 1:
                return toArray(a, c);
            case 2:
                return toArray(b, c);
        }

        throw new AssertionError(); // Can't get here
    }

    static <T> T[] toArray(T... args) {
        return args;
    }


    // Typesafe heterogeneous container pattern - implementation
    class Favorites {
        private Map<Class<?>, Object> favorites = new HashMap<>();

        public <T> void putFavorite(Class<T> type, T instance) {
            favorites.put(Objects.requireNonNull(type), instance);
        }

        public <T> T getFavorite(Class<T> type) {
            return type.cast(favorites.get(type));
        }
    }

}
