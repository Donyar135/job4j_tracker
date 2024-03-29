package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String EXTRA_TOMATO = " + ExtraTomato";

    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);
    }

    @Override
    public String name() {
        return super.name() + EXTRA_TOMATO;
    }
}
