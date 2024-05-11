package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches <= 3 && matches >= 1) {
                count = count - matches;
                System.out.println("Осталось на столе " + count);
            } else if (matches < 1) {
                System.out.println("Обьязательно надо брать минимум 1 спичек. Правила игры нарушен");
                turn = !turn;
                break;
            } else {
                System.out.println("Нельзя брать больше 3 спичек. Правила игры нарушен");
                turn = !turn;
                break;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}