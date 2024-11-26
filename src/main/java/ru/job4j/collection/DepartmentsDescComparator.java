package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] parts1 = left.split("/");
        String[] parts2 = right.split("/");
        int rootComparison = parts2[0].compareTo(parts1[0]);
        if (rootComparison != 0) {
            return rootComparison;
        }
        return left.compareTo(right);
    }
}