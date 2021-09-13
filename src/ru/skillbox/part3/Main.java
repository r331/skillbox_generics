package ru.skillbox.part3;

public class Main {
    //Обычно можно вызвать общий метод, и компилятор попытается выяснить,
    // какой из них вам нужен. Или же вы можете явно указать тип, чтобы было ясно, что это за тип.
    public static void main(String[] args) {
        Ship.<String>identity("");
        String s = Ship.identity("");

        Crate<String> crate = new Crate<>();
        String s1 = crate.getItem();


        crate.tricky("new Long(1l)");
    }
}

class Crate<T> {
    T item;

    public T tricky(T t) {
        return t;
    }

    public T getItem() {
        return item;
    }

    public static <S> S identity(S t) {
        return t;
    }

    //public static T noGood(T t) { return t; }
}


class Ship {
    public static <T> void sink(T t) {
    }

    public static <T> T identity(T t) {
        return t;
    }


    //public static T noGood(T t) { return t; }
}
