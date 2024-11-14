package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<Object> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (Object name : autos) {
            System.out.println(name);
        }
    }
}