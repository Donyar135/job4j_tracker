package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {

    @Test
    void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(1, "Reboot server"),
                new Item(2, "Impl task")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "Reboot server"),
                new Item(2, "Impl task"),
                new Item(4, "Fix bugs")
        );
        assertThat(items).isEqualTo(expected);
    }

    @Test
    void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(1, "Reboot server"),
                new Item(2, "Impl task")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );
        assertThat(items).isEqualTo(expected);
    }
}