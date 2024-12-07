package ru.job4j.stream;

import ru.job4j.hashmap.Label;

import java.util.Objects;

public record Subject(String name, int score) {

    public String getName() {
        return name;
    }

    public int getScore() {
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
        ru.job4j.stream.Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}