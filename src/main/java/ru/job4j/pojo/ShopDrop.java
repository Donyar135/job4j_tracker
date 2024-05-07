package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length - index - 1; i++) {
            products[index + i] = products[index + i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}