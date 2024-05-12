package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {

    }

    @Override
    public int passengers(int i) {
        return 0;
    }

    @Override
    public int lock(int f) {
        return 0;
    }
}
