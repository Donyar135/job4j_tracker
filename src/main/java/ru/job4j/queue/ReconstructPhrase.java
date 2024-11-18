package ru.job4j.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder builder = new StringBuilder();
        Iterator<Character> iterator = evenElements.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next());
            iterator.next();
        }
        return builder.toString();
    }

    private String getDescendingElements() {
        StringBuilder builder = new StringBuilder();
        for (int i = descendingElements.size() - 1; i >= 0; i--) {
            builder.append(descendingElements.pollLast());
        }
        return builder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();

    }
}