package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] parts1 = left.split("\\. ", 2);
        String[] parts2 = right.split("\\. ", 2);
        return Integer.compare(Integer.parseInt(parts1[0]), Integer.parseInt(parts2[0]));
    }
}