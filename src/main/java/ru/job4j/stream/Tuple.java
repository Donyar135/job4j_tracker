package ru.job4j.stream;

import java.util.Objects;

public record Tuple(String name, double score) {

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ru.job4j.stream.Tuple tuple = (Tuple) o;
        return Objects.equals(name, tuple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}

