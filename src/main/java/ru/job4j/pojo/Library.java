package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Анна Каренина", 750);
        Book book2 = new Book("Война и Мир", 300);
        Book book3 = new Book("Преступление и наказания", 555);
        Book book4 = new Book("Clean code", 555);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() +  " - " + book.getPage());
        }
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() +  " - " + book.getPage());
            }
        }
    }
}
