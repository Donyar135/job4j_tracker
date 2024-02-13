package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] arr) {
        this.array = arr;
    }

    public int print() {
        int index;
        for (index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        return this.array[index];
    }

    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(arrayNumber);
        reduce.print();

    }
}
