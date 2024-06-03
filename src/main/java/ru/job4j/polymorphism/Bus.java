package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("вперед");
    }

    @Override
    public void passengers(int i) {
    }

    @Override
    public int lock(int f) {
        return f * 95;
    }
}
