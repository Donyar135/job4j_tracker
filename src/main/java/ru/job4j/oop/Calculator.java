package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y; }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperations(int d) {
        return sum(d) + minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
        int result1 = minus(5);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rls1 = calculator.divide(5);
        System.out.println(rls1);
        int rls2 = calculator.sumAllOperations(5);
        System.out.println("sum all operations: " + rls2);
    }
}