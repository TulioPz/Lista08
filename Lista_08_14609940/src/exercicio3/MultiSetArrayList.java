package exercicio3;

import java.util.ArrayList;
import java.util.Objects;

public class MultiSetArrayList<T> {
    private ArrayList<T> elements;

    public MultiSetArrayList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MultiSetArrayList<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(MultiSetArrayList<T> other) {
        this.elements.addAll(other.elements);
    }
}
