package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        boolean h = true;
        for (int i = 0; i < value.length; i++) {
            if (key == value[i]) {
                h = false;
            }
        }
        if (h) {
            throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        try {
            indexOf(new String[] {"Артем", "Петр", "Данияр", "Александр"}, "Петр");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}