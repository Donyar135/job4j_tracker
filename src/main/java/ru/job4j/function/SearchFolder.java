package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {

    Predicate<Folder> predicate = (folder) -> folder.getSize() > 100 || folder.getName().contains("Bug");

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        return new ArrayList<>(list);
    }
}

