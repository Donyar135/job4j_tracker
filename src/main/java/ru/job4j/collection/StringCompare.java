package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        for (char i = 0; i < minLength; i++) {
            int compare = Character.compare(left.charAt(i), right.charAt(i));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
