package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (Objects.equals(value[i], key)) {
                result = i;
                break;
            }
        }
        if (result > -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"Артем", "Петр", "Данияр", "Александр"}, "Петр");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}