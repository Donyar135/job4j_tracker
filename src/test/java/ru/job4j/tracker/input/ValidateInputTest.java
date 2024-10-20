package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.input.*;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"six", "6"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(6);
    }

    @Test
    void whenInputTrueMuch() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"two", "2", "one", "1", "three", "3"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);

        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);

        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(3);
    }

    @Test
    void whenInputMinusValue() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}