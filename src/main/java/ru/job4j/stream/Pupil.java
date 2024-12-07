package ru.job4j.stream;

import java.util.List;
import java.util.Objects;

public record Pupil(String name, List<Subject> subjects) {

    public List<ru.job4j.stream.Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ru.job4j.stream.Pupil pupil = (ru.job4j.stream.Pupil) o;
        return Objects.equals(name, pupil.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}