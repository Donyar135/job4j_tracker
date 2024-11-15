package ru.job4j.queue;

import java.util.ArrayList;
import java.util.Deque;
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
        int index = 0;
        for (Character text : evenElements) {
            if (index % 2 == 0) {
                builder.append(text);
            }
            index++;
        }
        return builder.toString();
    }
    /*
    private String getEvenElements() {
            StringBuilder builder = new StringBuilder();
            List<Character> elementsList = new ArrayList<>(evenElements);

            for (int index = 0; index < elementsList.size(); index++) {
                if (index % 2 == 0) {
                    builder.append(elementsList.get(index));
                }
            }

            return builder.toString();
            */

    private String getDescendingElements() {
        StringBuilder builder = new StringBuilder();
        List<Character> elementsList = new ArrayList<>(descendingElements);
        for (int i = elementsList.size() - 1; i >= 0; i--) {
            builder.append(elementsList.get(i));
        }
        return builder.toString();
    }
    /*
    private String getDescendingElements() {
        StringBuilder builder = new StringBuilder();
        for (int i = descendingElements.size() - 1; i >= 0; i--) {
            builder.append(descendingElements.pollLast());
        }
        return builder.toString();
        */

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();

    }
}