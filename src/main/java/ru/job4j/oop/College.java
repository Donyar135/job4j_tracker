package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        /* делаем приведение к типу родителя Student. */
        Student student = freshman;
        /* делаем приведение к типу родителя Object. */
        Object object = freshman;
    }
}
