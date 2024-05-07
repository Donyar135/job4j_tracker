package ru.job4j.tracker;

import java.util.Objects;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            result[index] = item;
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int newSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (Objects.equals(key, item.getName())) {
                result[index] = item;
                newSize++;
            }
        }
        result = Arrays.copyOf(result, newSize);
        return result;
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
}