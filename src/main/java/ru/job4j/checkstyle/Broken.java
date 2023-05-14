package ru.job4j.checkstyle;

@SuppressWarnings("checkstyle:ConstantName")

public class Broken {
    public String surname;
    private int sizeOfEmpty = 10;
    public static final String NEW_VALUE = "";
    String name;

    void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void echo() {

    }

    Broken() {
    }
}