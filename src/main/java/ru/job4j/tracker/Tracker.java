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
        return Arrays.copyOf(items, size);
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
        return Arrays.copyOf(result, newSize);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item findById(int id) {
        return indexOf(id) != -1 ? items[indexOf(id)] : null;
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) != -1) {
            items[indexOf(id)] = item;
            return true;
        }
        return false;
    }
}