package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order key : orders) {
            String value = key.getNumber();
            map.put(value, key);
        }
        return map;
    }
}