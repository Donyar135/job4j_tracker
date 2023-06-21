package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return x / c;
    }

    public int sumAllOperations(int d) {
        return d;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result1 = minus(7);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rls1 = calculator.divide(4);
        System.out.println(rls1);
        int rls2 = calculator.sumAllOperations(sum(10) + minus(7) + calculator.multiply(5) + calculator.divide(4));
        System.out.println("sum all operations: " + rls2);
    }
}