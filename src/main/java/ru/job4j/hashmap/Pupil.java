package ru.job4j.hashmap;

import java.util.List;
import java.util.Objects;

public record Pupil(String name, List<Subject> subjects) {

    public List<Subject> getSubjects() {
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
        Pupil pupil = (Pupil) o;
        return Objects.equals(name, pupil.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}