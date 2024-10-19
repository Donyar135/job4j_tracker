package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (Objects.equals(value[i], key)) {
                result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (int i = 0; i < abuses.length; i++) {
            if (Objects.equals(abuses[i], value)) {
                throw new ElementAbuseException("Element abuse exception");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}